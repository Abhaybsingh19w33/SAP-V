//Accept a num1
//Accept a num2 
//This script is performing Arithmatic Operators
//1.Sum
//2.Sub
//3.Mul
//4.Div
//5.Mode
//select your choice
def console = System.console()
 
num1 = console.readLine("Enter num1 :").toInteger()
num2 = console.readLine("Enter num2 :").toInteger()
println "This script is performing Arithmatic Operators"
println "###############################################"
println("\n\n\n\t\t\t\t\tArithmetic Operations\n\t\t\t\t\t**********  *********\n1.Sum\n2.sub\n3.Mul\n3.Div\n4.Mode\n\n")
 
choice = console.readLine("Enter your choice :").toInteger()
 
if(choice == 1)
{
	println "Sum is : ${num1 + num2}"
}
else if(choice == 2)
{
	println "Subtraction is : ${num1 - num2}"
}
else if(choice == 3)
{
	println "Multiplication is : ${num1 * num2}"
}
else if(choice == 4)
{
	println "Division is : ${num1 / num2}"
}
else if(choice == 5)
{
	println "Module is : ${num1 % num2}"
}
else
{
	println "Invalid Choice"
}


/*

println("\n\n\n\t\t\t\t\t\tFood Menu\n\t\t\t\t\t\t**** ****\n1.Veg_Menu\n2.Non_Veg_Menu\n3.Jain_Menu\n\n")
def console=System.console()
choice=console.readLine("Enter your choice:").toInteger()

if (choice==1)
{
println "Veg Menu Items\n1. Makhni Paneer Biryani \n2. Masala Bhindi \n3. Pommes Gratin \n4. Vegetarian Burritos"
}
else if(choice==2)
{
println "Non Veg Menu Items\n1. Makhni chicken Biryani \n2. chicken Masala Bhindi \n3. chicken \n4. chicken Burritos"
}
else if (choice==3)
{
println "Jain menu Items\nItem1\nItem2"
}
else 
{
println "Wrong choice..try again.."
}




def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
if (num1>0)
{
println "The $num1 is positive"
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




def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
if (num1>99 && num1<1000)
{
println "The $num1 is 3 digit"
}
else
{
println "The $num1 is not a 3 digit"
}

println "Bye"



def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
if (num1>0)
{
println "The $num1 is positive"
}
else
{
println "The $num1 is not positive"
}

println "Bye"


def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
if (num1%2==0)
{
println "The $num1 is even"
}
else
{
println "The $num1 is odd"
}

println "Bye"



//1) Accept a number and check the given number is positive or not positive
//2)Accept a number and check the given number is 3 digit number or not 
//3)Accept a number and check the given number even or odd 





def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
if (num1>0)
{
println "The $num1 is positive"
}
println "Bye"


a=4
if(a==4)
{
println "The given value is: $a"
}
println "Bye"




a=4
b=3
c=5
println a>b 
println b<c 
println a==b 
println a!=b 
println "#"*20
x='abcd'
y='bc'
z='abce'
println x<y 
println x<z 



a=4
b=3
c=5
println a+b*c 
println ((a+b)*c) 

//BODMAS



//Accept two numbers and perform all arithmatic operators 
//add , sub, mul, div , mode 

def console=System.console()
num1=console.readLine("Enter a num1:").toInteger()
//println num1.getClass()
num2=console.readLine("Enter a num2:").toInteger()

println "The sum of $num1 and $num2 is: ${num1 + num2}"



num1=System.console().readLine "Enter a num1:"
num2=System.console().readLine "Enter a num2:"
x=num1.toInteger() + num2.toInteger() 
println "sum of $num1 and $num2 is: $x"

println num1.getClass()
println num2.getClass()



num1=System.console().readLine ("Enter a num1:") as Integer 
//println num1.getClass()
num2=System.console().readLine ("Enter a num2:") as Integer
x=num1+num2 
println "sum of $num1 and $num2 is: $x"

println num1.getClass()
println num2.getClass()






num1=System.console().readLine "Enter a num1:"
num1=num1 as int 
num2=System.console().readLine "Enter a num2:"
num2=num2.toInteger()
x=num1+num2 
println "sum of $num1 and $num2 is: $x"

println num1.getClass()
println num2.getClass()

a='100'
b='200'
println a+b
i='groovy'
j='script'
println i+j 



student_name=System.console().readLine "Enter a student name:"
println "Hi $student_name welcome"





Write a script to accept two number and perform arithmatic operation

Accept a num1 
Accept a num2 
perform arithmatic operation + (adding num1 and num2)









a=10
println "The value of a is: a"
println 'The value of a is: a'

println "The value of a is: $a" //interpolation
println 'The value of a is: $a'

student_name='siri'
student_id=101

println "Hi $student_name welcome"
println "Student id is: $student_id"


student_name='siri'
student_id=101
println student_name
println student_id


abc1=100
println(abc1)



a=10
b=2.5
c='groovy'
d="python"
istodaywednesday=true
println("####################")
println(a)
println(b)
println(c)
println(d)
println(istodaywednesday)
println("####################")
println("Data types")
println "#"*20
println(a.getClass())
println(b.getClass())
println(c.getClass())
println(d.getClass())
println(istodaywednesday.getClass())




a=10
b=2.5
c='groovy'
d="python"
def x=100
def y=3.4
def z="unix"
println("####################")
println(a)
println(b)
println(c)
println(d)
println("####################")
println(x)
println(y)
println(z)
print("####################")





println("\n\n\n\t\t\t\t\t\tFood Menu\n\t\t\t\t\t\t**** ****\n1.Veg_Menu\n2.Non_Veg_Menu\n")





println("Hello world\n")
println("Hi")
println("Bye")



print("Hello")
print("Hi")
print("Bye")


print("Hello\n")
print("Hi\n")
print("Bye\n")


println("Hello world")
println("Hi")
println("Bye")
*/