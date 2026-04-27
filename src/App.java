//import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Student s1 = new Student("0001","miya");
    Student s2 = new Student("0002", "pirin");
    Submission work1 = new Submission("main.cpp","cpp",s1);
    Submission work2 = new Submission("main.py","py",s2);

    work1.SetScore(90);
    work2.SetScore(99);
    System.out.println("work1 score = " + work1.GetScore());


    work1.DisplayInfo();
    System.out.println();
    work2.DisplayInfo();

    System.out.println("\n--- running code process ---");

    CppCompiler cppcode = new CppCompiler();
    cppcode.runCode(work1.getFileName());

    PyCompiler pycode = new PyCompiler();
    pycode.runCode(work2.getFileName());
    }
}
// System.out.println();
// Scanner input = new Scanner(System.in);
// input.close();