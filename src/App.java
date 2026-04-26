import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);

        System.out.println("will you shut down?: (enter [shutdown / restart / sleep / cancel])");
        String cmd = kb.nextLine();

        switch (cmd){
            case "shutdown":
                System.out.println("Shutting down...");
                break;
            case "restart":
                System.out.println("Restarting...");
                break;
            case "sleep":
                System.out.println("---sleep...");
                break;
            case "cancel":
                System.out.println("-----");
                break;
            default:
                System.out.println("invalid command");
        }


        kb.close();
    }

}
// System.out.println();