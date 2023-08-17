package template_pattern.example1;

public class Deposit extends AbstractBankBizTemplate {
    @Override
    public void doSomething() {
        System.out.println("办理存款业务");
    }
}
