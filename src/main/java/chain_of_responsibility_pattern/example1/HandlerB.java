package chain_of_responsibility_pattern.example1;

public class HandlerB extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
            System.out.println("HandlerB 处理成功");
        }
    }
}
