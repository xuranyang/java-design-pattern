package bridge_pattern.example2;

public class Client {
    public static void main(String[] args) {
        // 芒果
        Fruit mango = new Mango();

        // 蛋糕
        Food cake = new Cake();
        cake.setFruit(mango);
        cake.add();

        // 牛奶
        Food milk = new Milk();
        milk.setFruit(mango);
        milk.add();
    }
}
