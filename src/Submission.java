public class Submission {
    String fileName;
    String language;
    int score;

    public void DisplayInfo(){
        System.out.println("-----checking-----");
        System.out.println("file name: " + fileName);
        System.out.println("language: " + language);
        System.out.println("current score: " + score);
    }
}
