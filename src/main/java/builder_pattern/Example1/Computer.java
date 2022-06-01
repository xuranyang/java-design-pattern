package builder_pattern.Example1;

/**
 * 创建产品类：我们要组装一台计算机，计算机被抽象为 Computer 类
 * 它有3个部件：CPU、主板和内存，并在里面提供3个方法分别用来设置 CPU、主板和内存
 */
public class Computer {
    private String mCpu;
    private String mMainboard;
    private String mRam;

    public void setmCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public void setmMainboard(String mMainboard) {
        this.mMainboard = mMainboard;
    }

    public void setmRam(String mRam) {
        this.mRam = mRam;
    }
}
