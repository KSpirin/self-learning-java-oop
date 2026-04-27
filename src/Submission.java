public class Submission {
    private String fileName;
    private String language;
    private int score;
    //private : ppl cant change data by using name.x

    public Submission (String inname,String inlang){ // Constructor(special method)
        fileName = inname;
        language = inlang;
        score = 0;
    }

    public void DisplayInfo(){
        System.out.println("-----checking-----");
        System.out.println("file name: " + fileName);
        System.out.println("language: " + language);
        System.out.println("current score: " + score);
    }
}
