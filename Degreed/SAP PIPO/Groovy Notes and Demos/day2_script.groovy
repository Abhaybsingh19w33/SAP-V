//write the data to the file
file1=new File('m3.txt')
//file1.write("Hello Groovy")
file1.append("Hello Groovy\n")
line1=file1.readLines()
println line1 
file_size=line1.size()
println "size is: $file_size"

/*
file1=new File('C:/Users/SCRIPTING SCHOOL/Desktop/Training_Corp/2024/test1.txt').getText()
println file1


file1=new File('C:\\Users\\SCRIPTING SCHOOL\\Desktop\\Training_Corp\\2024\\test1.txt').getText()
println file1


file1=new File('test1.txt')
for (i in file1.readLines())
{
println i 
}


file1=new File('test1.txt')
println file1.readLines().get(3)


file1=new File('test1.txt')
x=file1.readLines()
for (i in x[1,2,3])
{
println i 
}



file1=new File('test1.txt')
x=file1.readLines()
//println x 
for (i in x)
{
println i 
}



file1=new File('test1.txt').getText()
println file1
println file1.getClass()




file_name='test1.txt'
input_file=new File(file_name)
//check file exist or not 

if (input_file.exists())
{
println "File $file_name is exist"
}
else 
{
println "File $file_name is not exist"
}




file1=new File('test1.txt').getText()
println file1



map1=[b1:100,b2:200,b3:500,b4:300]
if (map1.containsKey('b11'))
{
println "Key exist"
}
else 
{
map1['b11']=240
}
println map1


map1=[b1:100,b2:200,b3:500,b4:300]
println map1.size()
k=map1.keySet()
println k 
v=map1.values()
println v 
println "#######################"
for (i in k)
{
println "$i -> ${map1["$i"]}" 
}



car_details=[Brand:'Audi',Color:'Red',Plant:'UK',Model:'A8']
println car_details
println car_details['Plant']='India'
car_details.Color='Black'
println car_details
car_details['price']='1CRORE'

println car_details

map1=[b1:100,b2:200,b3:500,b4:300]
println map1 
println "${map1.min{it.key}}" 
println "${map1.max{it.key}}" 

println "${map1.max{it.value}}" 
println "${map1.min{it.value}}" 



emp_details=[101:"John",102:"Siri",103:"Bob"]
println emp_details
println emp_details[101]
println emp_details[103]
println emp_details.getClass()
println System.identityHashCode(emp_details)
println "#"*40
emp_details[101]="Ram"
println emp_details
println System.identityHashCode(emp_details)




my_list=[10,20,30,4.5,"groovy"]
println my_list[0]
println my_list[-1]
len=my_list.size()
println "Total length of my_list is: $len"
println my_list[1..3]
println my_list[0,2,-1]
println System.identityHashCode(my_list)
//How to replace a value 
my_list[-1]="JAVA"
println my_list
println System.identityHashCode(my_list)
my_list[0,-1]=["unix","redhat"]
println my_list





my_list=[10,20,30,4.5,"groovy"]
my_list2=[11,22,33,44]
println my_list
println my_list2

println "##########################"
println "$my_list\n"

for (i in my_list)
{
println i
}
println "##########################"
println my_list.getClass()
println System.identityHashCode(my_list)




user_info="siri:x:10001:10001:india:/home/siri:/bin/bash"
x=user_info.split(":")
println(x)
println(x[0])


x="groovy"
println x.toUpperCase()




println "immutable objects"
println "######################"
x=10
println x 
println System.identityHashCode(x)
x=200
println x 
println System.identityHashCode(x)
str1="abcde"
println str1.replace('cd','xy')
println str1 
println System.identityHashCode(str1)
str1=str1.replace('cd','xy')
println str1 
println System.identityHashCode(str1)

println "mutable object"
println "###################"
k=[10,20,30,40]
println k
println System.identityHashCode(k)
k[0]=100
println k
println System.identityHashCode(k)





str1="abcde"
println str1.replace('cd','xy')

x=10
println x 
x=200
println x 



str2="groovy script"
result=""
for (i=0;i<str2.length();i+=2) {
result+=str2[i]
}
println result



str1="groovy"
println str1 
println str1[0]
println str1[-1]
println str1[1]
//println str1[10]
len=str1.length()
println "Total length of str1 is: $len"
println str1[5]
println "##########################"
//slicing - one part of string
//range operator ..

str2="groovy script"
println str2[0..5]



str1='I play cricket'
println str1 
str2='I don\'t play cricket'
println str2 

str3="I said, I don't play cricket"
println str3

str4="I said, \"I don't play cricket\""
println str4






for (i in 1..100){
	if(i%3==0 && i%5==0){
		println "FizzBuzz"
	}
	else if(i%3==0){
		println "Fizz"
	}
	else if(i%5==0){
		println "Buzz"
	}
	else{
		println "$i"
	}
}

//write a script which iterates int values 1 to 100.
//For the multiples with 3 print "Fizz" insted of the number 
//For the multiples with 5 print "Buzz" insted of the number
//For the multiples with 3 and 5 print "FizzBuzz"
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

for (i in 'groovy')
{
println i 
}

list1=[10,20,30,40,'unix',300]

for (i in list1)
{
if (i=='unix')
{ continue }
println i 
}


for (i in [10,20,30,40])
{
println i 
}




for (i in 1..10)
{
println i 
}



for (i=1;i<=10;i++)
{
println i 
}
println "#######################"
for (i=1;i<=10;i++)
{
if (i==5)
{ break }
println i 
}

println "#######################"
for (i=1;i<=10;i++)
{
if (i==5)
{ continue }
println i 
}


//while(true)
//Accept a number if the given number is positive number then display the square of the given number **
//If its a negative number ask input again
//if the given number is zero then terminate the loop

def console = System.console()
while(true)
{
num = console.readLine("Enter number : ").toInteger()
if(num > 0)
{
	println "Square of $num is ${num*num}"
	continue
}
else if(num < 0) 
{
continue
}
else 
	break
	
}





i=0
while (i<10)
{
i++
if (i==5)
{
continue
}
println i 
}
println("Bye")


i=1
while (i<=10)
{
if (i==5)
{
i++
continue
}
println i 
i++
}
println("Bye")



i=1
while (i<=10)
{
if (i==5)
{
continue
}
println i 
i++
}
println("Bye")



i=1
while (i<=10)
{
println i 
if (i==5)
{
continue
}
i++
}
println("Bye")




//ATM_PIN=4321
//given_pin=
//Write a code to validate ATM pin
//Accept a pin if pin is correct pin then display logged in 
//if pin is wrong then ask 3 times for the valid pin, if user provided 3 times wrong pin then display
// access denied..limit done..try after 24 hours
count=0
ATM_PIN=4321
while(true)
{
def console = System.console()
pin = console.readLine("enter your pin:").toInteger()
count++
if (pin == ATM_PIN)
{
println "You have successfully logged in"
break
}
else if (pin != ATM_PIN)
{
if (count >=3)
{
println "You entered 3 times.. limit crossed"
break
}
}
}


i=1
while (i<=10)
{
println i 
if (i==5)
{
break
}
i++
}
println("Bye")




i=1
while (i<=10)
{
println i 
i++
}
println("Bye")




i=1			1<=10			1			2
			2<=10			2			3
			3<=10			3			4
			.
			.
			.
			9<=10			9			10
			10<=10			10			11
			11<=10

//write a switch case with regex
//Accept a input and check the given character is 
//alphabet or digit or special character
def console = System.console()
choice = console.readLine("enter your choice:")

switch(choice) {

case ~ /[a-zA-Z]+/:
	println "Alphabet only";break;
case ~ /[0-9]+/:
	println "Digit only";break;
case ~ /[^a-zA-Z0-9]+/:
	println "special character only";break;
default:
	println("Other")
}



//range operator ..
def console = System.console()
choice = console.readLine("enter your choice:").toInteger()
switch(choice)
{
case 1..9: 
	println "single digits"
	break
case 10..99: println "Two digit numbers";break;
case 100..999: println "Three digit numbers";break;

default:
	println "Wrong choice.."
}

def console = System.console()
choice = console.readLine("enter your choice:").toInteger()
switch(choice)
{
case 1:
	println "Value is one"
	break
case 2:
	println "Value is two"
	break
case 3:
	println "Value is Three"
	break
case 4:
	println "Value is four"
	break
	
default:
	println "Wrong choice.."
}




//Grade
//if the score is >=90 display as a Grade A 
//if the score is >=80 display as a Grade B 
//if the score is >=70 display as a Grade C
//if the score is >=60 display as a Grade D 
//if the score is <60 display as a Grade F
def console = System.console()

score = console.readLine("enter score:").toIntenger()
if(score>=90){
println "Grade A"
} else if(score>=80) {
println "Grade B" }
else if(score>=70) {
println "Grade C" }
else if(score>=60) {
println "Grade D" }
else if(score<60){
println "Grade F"
}



//checking for Login credentials
user_name='babu'
password='asdf1234'
//Accept user name and password
//if user entered correct user name and password then display login successful
//if user entered correct user name and wrong password then display Incorrect password
//is user entered wrong user name then discount user name not found
def console = System.console()

user1 = console.readLine("Enter the username: ")
pass1 = console.readLine("Enter the password: ")
 
if(user1 == user_name){
	if(password == pass1){
		println("Login was successful")
	}
	else {
		println("Incorrect password")
	}
}
else{
	println("Username not found")
}




boolean is_member=true
boolean has_coupon=true
def console = System.console()

purchase_amount = console.readLine("Enter the purchase amount :").toDouble()
is_member=console.readLine("is a member of shop :").toBoolean()
has_coupon=console.readLine("is a customer has coupon:").toBoolean()
if (purchase_amount > 100) {
	if (is_member) {
		if (has_coupon) {
			println "You get a 30% discount"
		} else {
		println "You get a 20% discount"
		}
} else {
	if (has_coupon) {
		println "You get a 10% discount"
	} else { 
	println "You get a 5% discount"
}}}
else {
println "No discount available"
}



//Nested if for Discount calculation
//Customer purchase > 100 and if customer is member of the mall and has a coupon then provide 30% discount
//Customer purchase > 100 and if customer is member of the mall 20% discount
//Customer purchase > 100 and has a coupon then provide only 10% discount
//Customer purchase > 100  and not a member or not having coupon then provide 5% discount
def console = System.console()
is_member=console.readLine("is a member of shop :").toBoolean()
//is_member=true
has_coupon=true
if (is_member) {
println "Is a member of the shop"
}
else
{
println "is not member of the shop"
}




def console = System.console()
num1 = console.readLine("Enter num1 :").toInteger()
if (num1>0)
{
println "The $num1 is positive"
	if(num1<10)
	{
	println "The given $num1 is a single digit number"
		if (num1%2==0)
		{
		println "The given $num1 is single digit even number"
		}
		else 
		{
		println "The given $num1 is single digit odd number"
		
		}
		
	}
	else 
	{
	println "The given $num1 is not a single digit number"
	}
	
}
else if(num1<0)
{
println "The $num1 is -ve"
}
//else if (num1==0)
else
{
println "The $num1 is zero"
}
println "Bye"
*/