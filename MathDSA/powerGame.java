package MathDSA;

import java.util.Scanner;

public class powerGame {
    
    public static int findPower(int a, int b) {
        int res = 1;
        while(b!=0) {
            if(b%2==1)
                res = res * a;
            a = a * a;
            b = b/2;    
        }
        return res;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int ans1 = findPower(firstNum, secondNum);
        System.out.println(firstNum + " ^ " + secondNum + " = " + ans1);
        scanner.close();
    }
}
