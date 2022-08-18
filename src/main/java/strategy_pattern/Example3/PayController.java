package strategy_pattern.Example3;

import java.util.Arrays;
import java.util.List;

/**
 * https://blog.csdn.net/qq_37949192/article/details/116993087
 * SprintBoot 可以通过 @Servive + applicationContext.getBean 来实现,不用再写枚举类
 */
//@RestController
//@AllArgsConstructor
//@RequestMapping("/pay/")
public class PayController {
//    private final ApplicationContext applicationContext;

    public static void main(String[] args) {
        System.out.println(pay(123, "AliPay"));
        System.out.println(pay(456, "WechatPay"));
        System.out.println(pay(789, "UnionPay"));

    }

//    @GetMapping()
    public static PayResult pay(int payAmount, String payType) {
//        Order order = new Order().setAmount(123456).setType(payType);
        Order order = Order.builder().amount(payAmount).type(payType).build();
        IPaymentStrategy paymentStrategy = PayStrategyEnum.valueOf(order.getType()).getPayStrategy();
//        IPaymentStrategy paymentStrategy = applicationContext.getBean(payType, IPaymentStrategy.class);
        return paymentStrategy.pay(order);
    }
}
