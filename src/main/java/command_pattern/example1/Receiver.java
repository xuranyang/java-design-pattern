package command_pattern.example1;

/**
 * 命令的接收者
 */
public class Receiver {
    /**
     * 示意方法，真正执行命令相应的操作
     */
    public void action() {
        System.out.println("这是接受者负责处理业务逻辑");
    }
}
