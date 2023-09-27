package chain_of_responsibility_pattern.example1;

public class HandlerA extends Handler {
    @Override
    public void handle() {
        boolean handled = false;
        //...
        if (!handled && successor != null) {
            successor.handle();
            System.out.println("HandlerA 处理成功，结束处理");
        }
    }
}
