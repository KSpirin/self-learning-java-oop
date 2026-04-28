public class CppCompiler extends Compiler{//child class use extends
    @Override
    public void execute(String file){
        System.out.println("[C++] use clang cmd to compile and run");
    }
}
