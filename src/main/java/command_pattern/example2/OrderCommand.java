package command_pattern.example2;

import java.util.Set;

public class OrderCommand implements Command {
    //持有接受者对象
    private ChefReceiver receiver;
    private Order order;

    public OrderCommand(ChefReceiver receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");
        Set<String> keys = order.getFoodDic().keySet();
        for (String key : keys) {
            // 厨师制作食物
            receiver.makeFood(order.getFoodDic().get(key), key);
        }

        try {
            Thread.sleep(100); //停顿一下 模拟做饭的过程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(order.getDiningTable() + "桌的饭弄好了\n");
    }
}
