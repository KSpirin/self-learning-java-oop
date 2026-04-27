public class PyCompiler extends Compiler{
    @Override // override parent's behavior
    public void runCode(String file) {
        super.runCode(file); // use old parent's behavior (use super.)
        System.out.println("[Py] use python3 cmd to compile and run");
    }
}
