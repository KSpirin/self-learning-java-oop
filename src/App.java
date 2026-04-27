import java.util.Scanner;

public class App {

    public static void caldiscount(double arr[],int Dis) { // array
        for (int i = 0; i < arr.length; i++)
            arr[i] = arr[i] * (1 - Dis / 100.0); // discount 50% off
        //if we use / 100 its will be int and make this code error
        // 50 / 100 = 0 NOT 0.5 bc int thats why
    }

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        double[] price = {130, 70, 75, 50, 123};
        for (double p : price)
            System.out.printf("%.2f ",p);

        System.out.print("\nendter the discount(%): ");
        int discount = input.nextInt();
        caldiscount(price, discount);

        for (double p : price)
            System.out.printf("%.2f ", p);

        input.close();
    }

}
// System.out.println();
// Scanner input = new Scanner(System.in);
// input.close();