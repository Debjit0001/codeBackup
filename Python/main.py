import os
import shutil
import zipfile

def convert_pptx_to_zip(pptx_file):
    # Create a temporary directory to extract the contents
    temp_dir = "temp"
    os.makedirs(temp_dir, exist_ok=True)

    try:
        # Extract the contents of the PPTX file to the temporary directory
        with zipfile.ZipFile(pptx_file, "r") as zip_ref:
            zip_ref.extractall(temp_dir)

        # Create a new ZIP archive with the same name as the PPTX file
        zip_filename = os.path.splitext(pptx_file)[0] + ".zip"
        with zipfile.ZipFile(zip_filename, "w") as zip_ref:
            # Add all the extracted files to the new ZIP archive
            for root, _, files in os.walk(temp_dir):
                for file in files:
                    file_path = os.path.join(root, file)
                    zip_ref.write(file_path, os.path.relpath(file_path, temp_dir))

        print(f"Conversion completed: {zip_filename}")

    finally:
        # Remove the temporary directory
        shutil.rmtree(temp_dir)

# Usage example
# pptx_file_path = "c:/Users/debji/OneDrive/Desktop/AtulMahuya/GraphColoring.pptx"
# convert_pptx_to_zip(pptx_file_path)


folder_path = "c:/Users/debji/OneDrive/Desktop/ppts"

# List all files in the folder
files = os.listdir(folder_path)

# Iterate over each file in the folder
for file_name in files:
    # Create the full file path by joining the folder path and the file name
    file_path = os.path.join(folder_path, file_name)
    
    # Check if the file path points to a regular file
    if os.path.isfile(file_path):
        # Process the file or perform any desired operation
        print(file_path.replace(' ', '_'))