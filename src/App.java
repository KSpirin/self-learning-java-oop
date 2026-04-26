import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("enter n: ");
        int n = input.nextInt();

        int i = 0;
        while (i < n){
            System.out.println(i);
            i++;
        }

        input.close();
    }

}
// System.out.println();