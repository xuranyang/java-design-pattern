package command_pattern.example2;

// 大厨类 是命令的Receiver
public class ChefReceiver {
    public void makeFood(int num, String foodName) {
        System.out.println("做了" + num + "份" + foodName);
    }
}
