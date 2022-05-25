package  com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args)
    {
        // write your code here

        Scanner in=new Scanner(System.in);
        System.out.println("Enter x : ");
        double x=in.nextDouble();

        System.out.println("Enter y : ");
        double y=in.nextDouble();


        boolean A = ((y>=0)&&(y<=4)&&(x<=2)&&(x>=-2)||(y>=-3)&&(y<=0)&&(x<=4)&&(x>=-4));
        System.out.println("Answer is " + A);


    }
}
