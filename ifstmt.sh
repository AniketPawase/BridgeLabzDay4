read -p  "Enter a no. whose tables to be printed: " a
for((i=1;i<=10;i++))
do
Z=$(($a*$i))
echo $Z
done
