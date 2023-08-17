package template_pattern.example1;

public class BankApp {
    public static void main(String[] args) {
        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();

        deposit.handleBiz(); // 存款
        System.out.println("==================");
        withdraw.handleBiz(); // 取款
    }
}
