import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        //method 1
        System.out.println("enter 5 number");
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++)
            arr[i] = input.nextInt();
        for (int i = 0; i < 5; i++)
            System.out.print(arr[i] + " ");
        System.out.print("\n");
        //method 2
        String[] name = {"miya","captain","tar"};

        //sizeof
        System.out.println("size of name = " + name.length);

        // For-Each Loops
        for(String n : name)
            System.out.print(n + " ");
    }

}
// System.out.println();
// Scanner input = new Scanner(System.in);
//intput.close()