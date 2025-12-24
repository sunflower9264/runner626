import os
import struct
from PIL import Image
import io

def read_short(f):
    b = f.read(2)
    if len(b) < 2:
        return None
    return struct.unpack('>h', b)[0]

def read_byte(f):
    b = f.read(1)
    if len(b) < 1:
        return None
    return struct.unpack('b', b)[0]

def read_ubyte(f):
    b = f.read(1)
    if len(b) < 1:
        return None
    return struct.unpack('B', b)[0]

def extract_is_file(filepath, output_dir):
    filename = os.path.basename(filepath)
    name_no_ext = os.path.splitext(filename)[0]
    file_out_dir = os.path.join(output_dir, name_no_ext)
    
    with open(filepath, 'rb') as f:
        # Header: IBS\0\1
        header = f.read(5)
        if header != b'IBS\x00\x01':
            print(f"Skipping {filename}: Invalid header {header}")
            return

        image_count = read_short(f)
        type_flag = read_byte(f)
        
        print(f"Processing {filename}: {image_count} images, Type {type_flag}")

        if type_flag == 0:
            if not os.path.exists(file_out_dir):
                os.makedirs(file_out_dir)
                
            for i in range(image_count):
                length = read_short(f)
                if length is None:
                    break
                img_data = f.read(length)
                
                try:
                    image = Image.open(io.BytesIO(img_data))
                    # Determine extension
                    ext = ".png"
                    if image.format:
                        ext = "." + image.format.lower()
                    
                    out_path = os.path.join(file_out_dir, f"{i}{ext}")
                    with open(out_path, 'wb') as out_f:
                        out_f.write(img_data)
                    print(f"  Extracted {out_path}")
                except Exception as e:
                    print(f"  Failed to extract image {i} in {filename}: {e}")
                    # Save as bin just in case
                    with open(os.path.join(file_out_dir, f"{i}.bin"), 'wb') as out_f:
                        out_f.write(img_data)

        else:
            print(f"  Type {type_flag} not fully supported for extraction (Indexed/Compressed). Dumping raw data.")
            # For Type != 0, we can at least try to read the structure and dump the parts
            if not os.path.exists(file_out_dir):
                os.makedirs(file_out_dir)
            
            try:
                # Palette Section
                palette_size = read_short(f)
                num_palettes = read_byte(f)
                print(f"  Palette: {num_palettes} palettes of size {palette_size}")
                
                # Skip palettes
                # Each color is a short (2 bytes)
                f.seek(num_palettes * palette_size * 2, 1)
                
                # Sprite Info Section
                has_sprites = read_byte(f)
                if has_sprites != 0:
                    # Skip sprite info
                    for _ in range(image_count):
                        num_frames = read_byte(f)
                        if num_frames > 0:
                            f.seek(num_frames * 4, 1) # 2 shorts per frame
                
                # Image Data Section
                for i in range(image_count):
                    width = read_short(f)
                    height = read_short(f)
                    length = read_short(f)
                    
                    if length is None:
                        break
                        
                    data = f.read(length)
                    
                    # Save raw compressed data
                    out_path = os.path.join(file_out_dir, f"{i}_{width}x{height}.bin")
                    with open(out_path, 'wb') as out_f:
                        out_f.write(data)
                    print(f"  Dumped raw data {out_path}")
                    
            except Exception as e:
                print(f"  Error parsing Type != 0 file {filename}: {e}")

def main():
    resources_dir = r'd:\j2me\runner626\resources'
    output_dir = r'd:\j2me\runner626\extracted_resources'
    
    if not os.path.exists(output_dir):
        os.makedirs(output_dir)

    for root, dirs, files in os.walk(resources_dir):
        for file in files:
            filepath = os.path.join(root, file)
            if file.lower().endswith('.is') or file.lower().endswith('.ibs'):
                extract_is_file(filepath, output_dir)
            elif file.lower().endswith('.mid') or file.lower().endswith('.stg') or file.lower().endswith('.png'):
                # Copy other resources
                import shutil
                out_path = os.path.join(output_dir, file)
                shutil.copy2(filepath, out_path)
                print(f"Copied {file}")

if __name__ == '__main__':
    main()
