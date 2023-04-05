package Java_project;
//
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        String username = "Alice";
//        int age = 28;
//        String occupation = "Software Engineer";
//        double totalIncome = 5000.0;
//        ArrayList<Double> dailyExpenses = new ArrayList<Double>();
//        dailyExpenses.add(50.0);
//        dailyExpenses.add(80.0);
//        dailyExpenses.add(70.0);
//        dailyExpenses.add(90.0);
//
//        BudgetSummary summary = new BudgetSummary(username, age, occupation, totalIncome, dailyExpenses);
//        summary.generateSummary();
//    }
//}
//


// a) Create classes as Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid.
// b) Create Shape as abstract class with showShape(String shape) as non-abstract method,
//       while calculateShape() and calculatePerimeter() as abstract method.
// c) Create Volume as an interface with calculateVolume() as an abstract method.
// d) Get input from users for measurements of shapes.
//Circle, Rectangle, Square, Sphere, Cylinder, and Pyramid.



import java.util.Scanner;

abstract class shape{
    Scanner sc= new Scanner(System.in);
    static void showshape(String shape){
        System.out.println("The shape is"+shape);
    }

    abstract public void calculatearea();
    abstract public void calculateparameter();
}

class circle extends shape{
    int r;
    int getr(){
        System.out.println("Enter value of r");
        r= sc.nextInt();
        return r;
    }

    @Override
    public void calculatearea(){
      r =getr();
        double area= 3.14*r*r;
        System.out.println(area);
    }

    @Override
    public void calculateparameter() {
        r= getr();
        double parameter= 2*3.14*r;
        System.out.println(parameter);

    }

}

class rectangle extends shape{
    int l,b;
    int getl(){
        System.out.println("Enter l");
        l= sc.nextInt();
        return l;
    }

    int getb(){
        System.out.println("Enter b");
        b= sc.nextInt();
        return b;
    }


    @Override
    public void calculatearea() {
        l= getl();
        b= getb();
        double area= l*b;
        System.out.println(area);
    }

    @Override
    public void calculateparameter() {
        l= getl();
        b= getb();
        int paremeter= 2*(l+b);
        System.out.println(paremeter);

    }
}

class squre extends shape{
    int side;

    int getSide(){
        side= sc.nextInt();
        return side;
    }


    @Override
    public void calculatearea() {
        side= getSide();
        double area= side*side;
        System.out.println(area);
    }

    @Override
    public void calculateparameter() {
        side= getSide();
        double par= 4*side;
        System.out.println(par);

    }
}

interface volume{
    public void volume();
}

class cylinder extends shape implements volume{
    int r,h;
    int getR(){
        r= sc.nextInt();
        return r;
    }

     int getH() {
        h= sc.nextInt();
        return h;
    }

    @Override
    public void calculatearea() {
        r= getR();
        h= getH();
        double area= 2*3.14*r*2 + 2*3.14*r*h;
        System.out.println(area);

    }

    @Override
    public void calculateparameter() {
        System.out.println("It has no parameter");

    }

    @Override
    public void volume() {
        r= getR();
        h= getH();
        double vol= 3.14*r*2*h + (2/3)*3.14*r*3;
        System.out.println(vol);

    }
}

class sphere extends shape implements volume{
    int r;
    int getR(){
        r= sc.nextInt();
        return r;
    }

    @Override
    public void calculatearea() {
        r= getR();
        double area=  4*3.14*r*r;
        System.out.println(area);

    }

    @Override
    public void calculateparameter() {
        System.out.println("No parameter");
    }

    @Override
    public void volume() {
        r= getR();
        double vol= (4/3)*3.14*r*r*r;
        System.out.println(vol);

    }
}

class pyramid extends shape implements volume{
    //Surface Area = 0.5 x perimeter x slant height + base area
    //Volume = (1/3) x base area x height
    int p=10;
    int sl= 10;
    int base_area=20;
    int h=15;


    @Override
    public void calculatearea() {
        double area= 0.5*p*sl*base_area;
        System.out.println(area);

    }

    @Override
    public void calculateparameter() {
        System.out.println("No parameter");

    }

    @Override
    public void volume() {
        double vol= (1/3)* base_area*h;
        System.out.println(vol);

    }
}

public class Main {
    public static void main(String[] args) {
        circle cr= new circle();
        cr.getr();
        cr.calculatearea();
        cr.calculateparameter();

    }
}






















