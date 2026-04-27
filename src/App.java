import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Submission work1 = new Submission();
    work1.fileName = "main.cpp";
    work1.language = "cpp";
    work1.score = 100;

    Submission work2 = new Submission();
    work2.fileName = "main.py";
    work2.language = "py";
    work2.score = 70;

    work1.DisplayInfo();
    System.out.println();
    work2.DisplayInfo();
    }
}
// System.out.println();
// Scanner input = new Scanner(System.in);
// input.close();