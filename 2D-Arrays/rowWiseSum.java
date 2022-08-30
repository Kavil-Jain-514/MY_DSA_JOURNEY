import java.util.Scanner;

public class rowWiseSum {
    public static void main(String[] args) {
        int arr[][] = new int[3][4];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<4; i++) {
            for(int j=0; j<3; j++) {
                arr[j][i] = sc.nextInt();
            }
        }
        int sum[] = new int[3];
        System.out.println("Your 2D Array:");
        for(int i=0; i<3; i++) {
            for(int j=0; j<4; j++) {
                System.out.print(arr[i][j]+ " ");
                sum[i] += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of all rows:");
        for(int i = 0; i<3; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.println();
        System.out.println("Row with largest sum:");
        int max = sum[0];
        int index = 0;
        for(int i = 0; i<3; i++) {
            if(sum[i]>max) {
                max=sum[i];
                index = i+1;
            }
        }
        System.out.println(index+ " " + max);
        sc.close();
    }
}
