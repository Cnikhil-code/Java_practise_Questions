import java.util.Scanner;

public class Employee {

    // Attribute
    int emp_id;
    String emp_name;
    double basic_salary;
    String department;

    // Salary Assumptions
    double hra;
    double da;
    double gross_salary;
    double pf;

    double tax;
    double deductions;

    double net_salary;

    // Methods to set Employee salary
    void setData(int emp_id, String emp_name, double basic_salary, String department) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.basic_salary = basic_salary;
        this.department = department;
    }

    // Calculate Salary
    void calculateSalary() {
        // Calculate Earnings
        hra = basic_salary * 0.20;
        da = basic_salary * 0.50;

        // Calculate Gross Salary
        gross_salary = basic_salary + hra + da;

        // Calculate deductions
        pf = basic_salary * 0.12;
        tax = basic_salary * 0.10;

        // Calculate Net Salary
        net_salary = gross_salary - (pf + tax);
    }

    // Display Salary
    void displaySalary() {
        System.out.println("===== SALARY SLIP =====");
        System.out.println("Employee ID    : " + emp_id);
        System.out.println("Employee Name  : " + emp_name);
        System.out.println("Department     : " + department);
        System.out.println("Basic Salary   : " + basic_salary);
        System.out.println("HRA            : " + hra);
        System.out.println("DA             : " + da);
        System.out.println("Gross Salary   : " + gross_salary);
        System.out.println("PF Deduction   : " + pf);
        System.out.println("Tax Deduction  : " + tax);
        System.out.println("Net Salary     : " + net_salary);
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        // Taking Input
        System.out.println("Enter Employee ID : ");
        int id  = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Employee Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Department : ");
        String dept = sc.nextLine();
        System.out.println("Enter Basic Salary : ");
        double salary = sc.nextDouble();

        // Call
        emp.setData(id, name, salary, dept);
        emp.calculateSalary();
        emp.displaySalary();

        sc.close();
    }

}
