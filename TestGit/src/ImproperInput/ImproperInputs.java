package ImproperInput;

/* Write a program that asks the user to input a set of floating-point values. When the
user enters a value that is not a number, give the user a second chance to enter the
value. After two chances, quit reading input. Add all correctly specified values and
print the sum when the user is done entering data. Use exception handling to detect
improper inputs.


Output/Program:
*/


import java.util.*;
public class ImproperInputs {
public static void main(String[] args)
{
float total = 0;
String value;
float valuefloat;
String answer;
int entervalue;
Scanner key = new Scanner(System.in);
System.out.println("How many values do you want to enter?");
entervalue = key.nextInt();

for (int i = 1; i < entervalue + 1; i++)
{
for (int j = 0; j < 2; j++)
{

System.out.println("Enter a point floating value. " + i);
value = key.next();

try
{
valuefloat = Float.parseFloat(value);
total = total + valuefloat;
break;
}
catch (Exception e)
{
if (j == 0)

System.out.println(e.getMessage() + " Please enter a float value again. " + i);

else
{
System.out.println("You will not be given any more chances because you entered incorrect values twice.");
System.exit(0);
}
}
}

}
System.out.println("The total of the values is: " + total + ".");
}
}

