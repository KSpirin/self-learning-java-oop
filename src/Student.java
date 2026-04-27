public class Student {
    private String studentID;
    private String studentName;

    public Student(String inID,String inName){
        studentID = inID;
        studentName = inName;
    }

    public String GetName(){
        return studentName;
    }
    public String GetID(){
        return studentID;
    }
}
