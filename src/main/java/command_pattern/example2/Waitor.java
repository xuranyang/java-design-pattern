package command_pattern.example2;

import java.util.ArrayList;
import java.util.List;

/**
 * Invoker
 */
public class Waitor {
    private List<Command> commands;//可以持有很多的命令对象

    public Waitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command command) {
        commands.add(command);
    }


    // 发出命令 喊 订单来了，厨师开始执行
    public void orderUp() {
        System.out.println("美女服务员：叮咚，大厨，新订单来了.......");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }

}
