package ExceptionHandling;

import java.util.*;
public class TestScoresDemo {
public static void main(String[] args) throws InvalidTestScores
{

double[] array = {97, 99, 84, 101};
TestScores ts = new TestScores(array);
double avg = ts.getAverage();
System.out.println("The average is: " + avg + ".");

}
}