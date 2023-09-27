package chain_of_responsibility_pattern.example2;

public class HandlerA implements IHandler {
    @Override
    public boolean handle() {
        boolean handled = true;
//        boolean handled = false;
        //...
        if (handled){
            System.out.println("HandlerA 处理完毕");
        }else {
            System.out.println("HandlerA 未处理");
        }
        return handled;
    }
}
