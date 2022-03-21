package fraction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Fraction fn = new Fraction();
        Scanner abc = new Scanner(System.in);
        fn.setA(abc.nextInt());
        fn.setB(abc.nextInt());
        if(fn.kiemtra()) System.out.println("Nhap mau khac 0");
        else {
            System.out.println("Tu so la: "+fn.getA());
            System.out.println("Mau so la: "+fn.getB());
            System.out.println("Phan so la: "+fn.getA()+"/"+fn.getB());
        }
        fn.rutgon();
        fn.nghichdao();
        fn.add();
        fn.sub();
        fn.mul();
        fn.div();
    }
}
