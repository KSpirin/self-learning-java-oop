public abstract class Compiler { //parent class

    public void prepare(String file){
        System.out.println("preparing for " + file);
    }
    public abstract void execute(String file);

    // Template Method
    public void runProcess(String file){
        prepare(file);
        execute(file);
        System.out.println();
    }
}
