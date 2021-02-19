package Payroll;

public class InvalidPayroll extends Exception {

public InvalidPayroll(String empname)
{
super("You put an invalid string for the employee name.");
}

public InvalidPayroll(int id)
{
super("You put an invalid value for the employee id.");
}

public InvalidPayroll(double hrs)
{
super("You put an invalid value for the number of hours the employee worked for.");
}

public InvalidPayroll()
{
super("You put an invalid value for the employee hourly pay rate.");
}
}

