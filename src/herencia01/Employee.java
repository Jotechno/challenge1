package herencia01;

public class Employee extends Person {
    //Atributos-atributes
    private String department; // only compatibility, human resources, sales
    private int salary;
    private  String hireDate;


    //toString
    @Override
    public String toString() {
        return
                super.toString() +
                "\ndepartment= " + department + "\n" +
                "hireDate= " + hireDate + '\n' +
                "salary= " + salary;
    }

    public void setDepartment(String department) {
        if (!department.equals("compatibility") && !department.equals("human resources") &&
        !department.equals("sales")){
            this.department = "human resources";
        }
        else {
            this.department = department;
        }
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
}
