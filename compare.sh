read -p "Enter first number : " a
read -p "Enter second number : " b 
if [ $a -gt $b ];
then
echo $a is greater than $b
else
echo $b is greater than $a
fi 
