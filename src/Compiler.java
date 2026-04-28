//add abstract before parent class
public abstract class Compiler { //parent class

    public void prepare(String file){
        System.out.println("preparing for " + file);
    }
    //change runCode to execute bc its cooler XD
    //must have abstract so child class cant use another name
    public abstract void execute(String file); // Contract
}
