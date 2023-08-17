package template_pattern.example1;

public abstract class AbstractBankBizTemplate {
    // 模板方法
    public void handleBiz() {
        getNumber();    // 先取号
        lineUp();       // 再排队
        doSomething();  // 然后办理不同业务
        appraise();     // 最后评价
    }

    // 基本方法
    public void getNumber() {
        System.out.println("银行取号");
    }

    public void lineUp() {
        System.out.println("银行排队");
    }

    public void appraise() {
        System.out.println("银行评价");
    }

    // 抽象方法
    public abstract void doSomething();
}
