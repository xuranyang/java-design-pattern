package chain_of_responsibility_pattern.example2;

public class HandlerB implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = true;
        //...
        if (handled) {
            System.out.println("HandlerB 处理完毕");
        } else {
            System.out.println("HandlerB 未处理");
        }
        return handled;
    }
}
