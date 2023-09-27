package chain_of_responsibility_pattern.example2;

import java.util.ArrayList;
import java.util.List;

public class HandlerChain {
    private List<IHandler> handlers = new ArrayList<>();

    public void addHandler(IHandler handler) {
        this.handlers.add(handler);
    }

    public void handle() {
        for (IHandler handler : handlers) {
            boolean handled = handler.handle();
            if (handled) {
                System.out.println("结束处理");
                break;
            }
        }
    }
}
