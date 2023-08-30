package visitor_pattern.example2;

// Component类：汽车组件类，充当抽象元素类。该抽象类定义了抽象方法 accept()，可以接收一个 Visitor 实现类的实例，用于触发组件计算的动作。
public interface Component {
    public void accept(CalculateContent content);
}