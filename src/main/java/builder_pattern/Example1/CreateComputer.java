package builder_pattern.Example1;

/**
 * 客户端调用导演类：最后商家用导演类组装计算机。
 * 我们只需要提供自己想要的 CPU 、主板和内存就可以了，至于商家怎样组装计算机我们无须知道。
 */
public class CreateComputer {
    public static void main(String[] args) {
        Builder mBuilder = new MoonComputerBuilder();
        Director mDirector = new Director(mBuilder);
        //组装计算机
        mDirector.CreateComputer("i7-6700", "华擎玩家至尊", "三星 DDR4");
    }
}
