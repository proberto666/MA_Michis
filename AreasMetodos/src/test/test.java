package test;

import metodos.metodos;

public class test {

    public static void main(String[] args){

        double area = metodos.area(5,10);
        System.out.println("Área = " + area);

        double area1 = metodos.area(5,10,true);
        System.out.println("Área = " + area1);

        double area2 = metodos.area(5);
        System.out.println("Área = " + area2);
    }
}
