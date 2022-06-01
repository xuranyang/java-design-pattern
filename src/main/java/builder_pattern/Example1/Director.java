package builder_pattern.Example1;

/**
 * 创建导演类：统一管理组装过程。
 * 商家就是导演类用来规范组装计算机的流程规范，
 * 先安装主板，在安装 CPU ，最后安装内存并组装完成计算机
 */
public class Director {
    Builder mBuild = null;

    public Director(Builder build) {
        this.mBuild = build;
    }

    public Computer CreateComputer(String cpu, String mainboard, String ram) {
        //规范建筑流程
        this.mBuild.buildMainboard(mainboard);
        this.mBuild.buildCpu(cpu);
        this.mBuild.buildRam(ram);
        return mBuild.create();
    }
}
