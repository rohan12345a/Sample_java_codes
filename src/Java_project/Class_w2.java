package Java_project;
import java.util.Scanner;

interface departement{
    public void AIML();
    public void cs();

}
abstract class dep_info{
    abstract public void depinfo();
}

abstract class emp_info{
    abstract public void employee_info();
}
class Employee extends emp_info {
    Scanner sc= new Scanner(System.in);
    String name, department;
    int age;

    public String getName() {
        System.out.println("Enter name");
        name= sc.next();
        return name;
    }

    public int getAge() {
        System.out.println("Enter age");
        age= sc.nextInt();
        return age;
    }

    public String getDepartment() {
        System.out.println("Enter dep name");
        department= sc.next();
        return department;
    }

    @Override
    public void employee_info() {
        name= getName();
        age= getAge();
        department= getDepartment();

        System.out.println("Employee name is :"+name);
        System.out.println("Its age is :"+ age);
        System.out.println("Its departement is :"+department);

    }
}

class Department extends dep_info{
    Scanner sc= new Scanner(System.in);
    String dep_name;
    int dep_id;

    public String getDep_name() {
        System.out.println("Enter dep name again");
        dep_name= sc.next();
        return dep_name;
    }

    public int getDep_id() {
        System.out.println("Enter dep ID");
        dep_id= sc.nextInt();
        return dep_id;
    }

    @Override
    public void depinfo() {
        dep_name= getDep_name();
        dep_id= getDep_id();

        System.out.println("The dep name is :"+dep_name);
        System.out.println("Dep id is :"+ dep_id);

    }
}

public class Class_w2 {

    public static void main(String[] args) {
        Department d= new Department();
        Employee e= new Employee();
        e.employee_info();
        d.depinfo();


    }
}
