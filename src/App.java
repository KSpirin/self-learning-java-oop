import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Submission work1 = new Submission("main.cpp","cpp");
    Submission work2 = new Submission("main.py","py");


    work1.DisplayInfo();
    System.out.println();
    work2.DisplayInfo();
    }
}
// System.out.println();
// Scanner input = new Scanner(System.in);
// input.close();