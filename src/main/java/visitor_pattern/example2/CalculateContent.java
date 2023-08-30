package visitor_pattern.example2;

// CalculateContent类：计算内容类，充当抽象访问类
public abstract class CalculateContent {
    public abstract void calculate(Car content);

    public abstract void calculate(Carframe content);

    public abstract void calculate(Tyre content);

    public abstract void calculate(Seat content);
}