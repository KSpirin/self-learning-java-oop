import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = input.nextInt();

        for(int i = 0; i < n; i++)
            System.out.println(i+1);

        input.close();
    }

}
// System.out.println();