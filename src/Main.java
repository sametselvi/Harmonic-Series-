import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz : ");
        int n = input.nextInt();

        double[] list = new double[n];
        double sum = 0.0;
        for (double j = 1; j <= n; j++) {
            for(int i =0; i< list.length; i++){
                list[i]=j;

            }
            sum += 1/j;



        }
        System.out.println(sum);



















       


    }
}
