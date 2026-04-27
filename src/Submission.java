public class Submission {
    String fileName;
    String language;
    int score;

    public Submission (String inname,String inlang){ // Constructor(special method)
    //must use same name as Class
    //dont have void or return type
        fileName = inname;
        language = inlang;
        score = 0;  // 0 by default
    }

    public void DisplayInfo(){
        System.out.println("-----checking-----");
        System.out.println("file name: " + fileName);
        System.out.println("language: " + language);
        System.out.println("current score: " + score);
    }
}
