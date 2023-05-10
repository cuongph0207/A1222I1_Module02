package module2.baitap.ss15_exception;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a:");
            a = sc.nextDouble();
            System.out.println("Enter b:");
            b = sc.nextDouble();
            System.out.println("Enter c:");
            c = sc.nextDouble();
            if (a < 0 || b < 0 || c < 0)
                throw new ArithmeticException("Error Enter");
            if(a+b<c)
            {
                throw new IllegalTriangle("Error Enter");
            } else if (a+c<b) {

                throw new IllegalTriangle("Error Enter");
            }else if(b+c<a)
            {
                throw new IllegalTriangle("Error Enter");
            }
        }catch (ArithmeticException e)
        {
            System.out.println("Must Be Positive Number");
        }catch (IllegalTriangle e)
        {
            System.out.println("Sum of 2 sides must be greater than the other side");
        }
    }
}
