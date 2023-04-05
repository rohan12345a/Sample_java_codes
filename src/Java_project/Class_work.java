package Java_project;

//interface A{
//    public void aa();
//}
//
//interface B extends A{
//    public void bb();
//}
//
//public class Class_work implements B{
//    public void bb(){
//        System.out.println("Its bb");
//    }
//
//    public void aa(){
//        System.out.println("Its aa");
//    }
//}


//

import java.util.Scanner;
interface result{
    public void percent_cal();
}

class student implements result{
    Scanner sc= new Scanner(System.in);
    String name,branch,batch;
    int marks1,marks2,marks3;

    public void setName(String name) {
        System.out.println("Enter name");
        name= sc.next();
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void getMarks1(){
        System.out.println("enter marks1");
        marks1= sc.nextInt();
        this.marks1=marks1;
    }
    public void getMarks2(){
        System.out.println("Enter marks 2");
        marks2= sc.nextInt();
        this.marks2=marks2;
    }


    public void getMarks3(){
        System.out.println("enter marks1");
        marks1= sc.nextInt();
        this.marks1=marks1;
    }

    public void details(){
        System.out.println("Name is "+name);
    }

    public void percent_cal(){
        int perc= (((marks1+marks2+marks3))/3);
        System.out.println("The perc is"+ perc);
    }
}

public class Class_work {
    public static void main(String[] args) {
        student st= new student();


        st.getMarks1();
        st.getMarks2();
        st.getMarks3();
        st.percent_cal();
    }
}







