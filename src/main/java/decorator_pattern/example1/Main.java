package decorator_pattern.example1;

public class Main {
    public static void main(String[] args) {
        // 买一个煎饼，创建基础套餐，需要被装饰的对象
        BatterCake batterCake = new BaseBatterCake();
        System.out.println(batterCake.getMessage() + ",总价：" + batterCake.getPrice());

        // 加煎蛋，创建煎蛋装饰器
        batterCake = new EggDecorator(batterCake);
        System.out.println(batterCake.getMessage() + ",总价：" + batterCake.getPrice());

        // 加香肠，创建香肠装饰器
        batterCake = new SausageDecorator(batterCake);
        System.out.println(batterCake.getMessage() + ",总价：" + batterCake.getPrice());
    }
}
