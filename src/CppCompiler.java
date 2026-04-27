public class CppCompiler extends Compiler{//child class use extends
    @Override //override parent's behavior
    public void runCode(String file){
        super.runCode(file);    //use old parent's behavior (use super.)
        System.out.println("[C++] use clang cmd to compile and run");
    }
}
