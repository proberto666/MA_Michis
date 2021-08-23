package metodos;

public class metodos {

    public static double area(double b, double h){
        System.out.println("Usaste el método del rectángulo");
        return h*b;
    }
     
    public static double area(double b, double h, boolean x){
        System.out.println("Usaste el método del triángulo");
        return (b*h)/2;
    }
     
    public static double area(double r){
        System.out.println("Usaste el método del círculo");
        return (3.1416*(r*r));
    }
}
