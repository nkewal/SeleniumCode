package ExceptionHandling;

/* TestScores Class

Write a class named TestScores. The class constructor should accept an array of test scores
as its argument. The class should have a method that returns the average of the test scores.
If any test score in the array is negative or greater than 100, the class should throw an
IllegalArgumentException. Demonstrate the class in a program.


Output/Program: 

package Exceptions; */

public class TestScores {
//private double[] testscores;
double total = 0;
int totalnumber = 0;
double avg;
public TestScores(double[] array) throws InvalidTestScores
{
for (int i = 0; i < array.length; i++)
{
if (array[i] < 0 || array[i] > 100)
		throw new InvalidTestScores(array[i]);

else

{ totalnumber = totalnumber + 1;
total = total + array[i];
}
}
}



public double getAverage()
{
avg = total / totalnumber;
return avg;
}
}