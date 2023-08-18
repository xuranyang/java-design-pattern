package command_pattern.example1;

public class Client {
    public static void main(String[] args) {
        // 创建接收者
        Receiver receiver = new Receiver();
        // 创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(receiver);

        // 创建调用者，把命令对象设置进去，客户端通过调用者来执行命令
//        Invoker invoker = new Invoker(command);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        // 调用者调用命令
        invoker.invoke();
    }
}
