package herencia01;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Create instances
        Student student = new Student();
        Employee employee = new Employee();

        //For the student
        System.out.print("Set the name for the student: ");
        student.setName(sc.nextLine());
        System.out.print("Set the addres fot the student: ");
        student.setAddres(sc.nextLine());
        System.out.print("Set the mail for the student: ");
        student.setMail(sc.nextLine());
        System.out.print("Set the phone for the student: ");
        student.setPhoneNumber(sc.nextInt());
        System.out.print("Set the state for the student: ");
        student.setState(sc.nextInt());
        sc.nextLine();
        System.out.println(student.toString());

        //For the employee
        System.out.print("Set the name for the employee: ");
        employee.setName(sc.nextLine());
        System.out.print("Set the addres fot the employee: ");
        employee.setAddres(sc.nextLine());
        System.out.print("Set the mail for the employee: ");
        employee.setMail(sc.nextLine());
        System.out.print("Set the phone for the employee: ");
        employee.setPhoneNumber(sc.nextInt());
        sc.nextLine();
        System.out.print("Set the department for the employee: ");
        employee.setDepartment(sc.nextLine());
        System.out.print("Set the hire date for the employee: ");
        employee.setHireDate(sc.nextLine());
        System.out.print("Set the salary for the employee: ");
        employee.setSalary(sc.nextInt());
        System.out.println(employee.toString());
    }
}
