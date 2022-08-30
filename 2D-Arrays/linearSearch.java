import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                arr[j][i] = sc.nextInt();
            }
        }

        System.out.println("Your 2D Array:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Enter the number you want to search: ");
        int n = sc.nextInt();
        int row=0, col=0;
        boolean flag = false;
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                if(arr[i][j] == n) {
                    row = i+1;
                    col = j+1;
                    flag = true;
                }
            }
        }
        if(flag==true) 
            System.out.println("Your number is present at (" + row + "," + col + ")." );
        else
            System.out.println("Not found");
        sc.close();
    }
}
