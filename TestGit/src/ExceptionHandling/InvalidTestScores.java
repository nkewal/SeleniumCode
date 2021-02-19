package ExceptionHandling;

public class InvalidTestScores extends Exception {


public InvalidTestScores()
{
super("Test score is negative or greater than 100.");
}

public InvalidTestScores(double testscore)
{
super("Test score is incorrect " + testscore + ".");
}
}
