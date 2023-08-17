package template_pattern.example1;

public class Withdraw extends AbstractBankBizTemplate {
    @Override
    public void doSomething() {
        System.out.println("办理取款业务");
    }
}
