import java.util.Scanner;

class rowColumn {
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
        sc.close();
    }
}