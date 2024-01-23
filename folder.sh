read -p "Enter folder name: " folder_name
if [ -d "$folder_name" ]
then
echo "Folder already exists"
else
mkdir "$folder_name"
echo "Folder created"
fi
