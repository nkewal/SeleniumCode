package Payroll;

public class Payroll1 {
private String empname;
private int id;
private double hpr;
private double hrs;

public void Payroll1() throws InvalidPayroll
{
this.empname = empname;
this.id = id;
}

public double GrossPay(double hpr, double hrs)
{
double grosspay = hpr * hrs;
return grosspay;
}

public String getEmpname() {
return empname;
}

public void setEmpname(String empname) {
this.empname = empname;
}

public int getId() {
return id;
}

public void setId(int id) {
this.id = id;
}

public double getHpr() {
return hpr;
}

public void setHpr(double hpr) {
this.hpr = hpr;
}

public double getHrs() {
return hrs;
}

public void setHrs(double hrs) {
this.hrs = hrs;
}

}