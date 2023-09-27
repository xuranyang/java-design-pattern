package chain_of_responsibility_pattern.example3;

public class HandlerA extends Handler{
    @Override
    protected void doHandle() {
        // ...
        System.out.println("doHandle A");
    }
}
