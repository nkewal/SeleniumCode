package Payroll;


import java.util.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
public class PayrollDemo {
public static void main(String[] args)
{
String empname;
int id;
double hpr;
double hrs;
double grosspay;
Scanner key = new Scanner(System.in);
Payroll1 p = new Payroll1();
InvalidPayroll pr = new InvalidPayroll();
empname = JOptionPane.showInputDialog(null, "Enter the name of the employee.");
p.setEmpname(empname);

if (empname == null)
{
JOptionPane.showMessageDialog(null, "Name cannot be blank or null.", "Illegal Argument Exception", JOptionPane.ERROR_MESSAGE);
System.exit(0);
}

id = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the ID number of the employee."));
p.setId(id);

if (id <= 0)
{
JOptionPane.showMessageDialog(null, "Invalid value! ID number cannot be negative or zero.", "Illegal Argument Exception", JOptionPane.ERROR_MESSAGE);
System.exit(0);
}

hrs = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the number of hours worked."));
p.setHrs(hrs);

if (hrs < 0 || hrs > 84)
{
JOptionPane.showMessageDialog(null, "Invalid number! Number of hours worked cannot be negative or greater than 84.", "Illegal Argument Exception", JOptionPane.ERROR_MESSAGE);
System.exit(0);
}

hpr = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the hourly pay rate."));
p.setHpr(hpr);

if (hpr < 0 || hpr > 25)
{
JOptionPane.showMessageDialog(null, "Invalid number! Hourly pay rate cannot be negative or greater than 25.", "Illegal Argument Exception", JOptionPane.ERROR_MESSAGE);
System.exit(0);
}

DecimalFormat df1 = new DecimalFormat("#.00");
grosspay = hpr * hrs;

JOptionPane.showMessageDialog(null, "Your employee name is: " + empname + ".\nYour employee ID number is: " + id + ".\nYou worked for " + hrs + " hours.\nYour hourly pay rate is: " + hpr + ".\nThe amount of gross pay you earned is: $" + df1.format(grosspay) + ".");
}
}

