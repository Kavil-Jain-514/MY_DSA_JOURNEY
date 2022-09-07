package MathDSA;

import java.util.Scanner;

public class gcd {

    public static int findGCD1(int a, int b) {
        if(a==0)
            return b;
        if(b==0)
            return a;
        while(a!=b) {
            if(a>b)
                a=a-b;
            else
                b=b-a;    
        }
        return b;
    }

    public static int findGCD2(int a, int b) {
        if(b==0)
            return a;
        return findGCD2(b, a%b);    
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int ans1 = findGCD1(firstNum,secondNum);
        System.out.println("GCD of "+firstNum+" and "+secondNum+" is "+ ans1);
        int ans2 = findGCD2(firstNum,secondNum);
        System.out.println("GCD of "+firstNum+" and "+secondNum+" is "+ ans2);
        scanner.close();
    }
}
