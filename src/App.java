import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.print("enter your score: ");
        int score = kb.nextInt();
        if(score < 0 || score > 100)
            System.out.println("invalid score");
        else if(score >= 80 && score <= 100)
            System.out.println("A");
        else if(score >= 70)
            System.out.println("B");
        else if (score >= 60)
            System.out.println("C");
        else if (score >= 50)
            System.out.println("D");
        else
            System.out.println("F");

        kb.close();
    }

}
// System.out.println();