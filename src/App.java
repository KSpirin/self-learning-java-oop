import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in); //can change in to whatever you want

        System.out.print("age: ");
        int age = in.nextInt();

        in.nextLine();      //If you use nextInt before nextLine you must add x.nextLine between

        System.out.print("name: ");
        String name = in.nextLine();

        System.out.println("your name is " + name);
        System.out.println("your age is " + age);

        in.close(); //return the memomory
    }//print is print yk
    //println is print line
}
