import java.util.Scanner;

public class App {

    public static double calvat(double price) {// int double
        double finalprice = price * (0.07);
        return finalprice;
    }

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        System.out.print("enter the price: ");
        int price = in.nextInt();
        double vat = calvat(price);
        System.out.printf("vat 7%% = %.2f\n", calvat(price)); //"%%" = %
        System.out.printf("current price = %.2f\n", (price + vat));

        in.close();
    }

}
// System.out.println();
// Scanner input = new Scanner(System.in);
// intput.close();