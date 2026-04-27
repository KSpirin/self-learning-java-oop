public class Submission {
    private String fileName;
    private String language;
    private int score;
    private Student std;

    public Submission (String inname,String inlang,Student instd){
        fileName = inname;
        language = inlang;
        score = 0;
        std = instd;
    }

    public void DisplayInfo(){
        System.out.println("-----checking-----");
        System.out.println("studen INFO -> " + std.GetID() + " " + std.GetName());
        System.out.println("file name: " + fileName);
        System.out.println("language: " + language);
        System.out.println("current score: " + score);
    }

    //Getter : read data
    public int GetScore(){
        return score;
    }

    //Setter : change data
    public void SetScore(int newscore){
        //make some condition (why not yk :) ) (no needed btw)
        if (score < 0 || newscore > 100){
            System.out.println("invalid score (must be in range 0-100)");
        }
        else{
            score = newscore;
            System.out.println("change " + fileName + " score to " + score);
        }
    }
}
