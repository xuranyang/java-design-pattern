package builder_pattern.Example1;

/**
 * 创建Builder类规范产品的创建：商家组装计算机有一套组装方法的模版，就是一个抽象的 Builder 类，
 * 其里面提供了安装 CPU、主板和内存的方法，以及组装成计算机的 creact 方法。
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);

    public abstract void buildMainboard(String mainboard);

    public abstract void buildRam(String ram);

    public abstract Computer create();
}
