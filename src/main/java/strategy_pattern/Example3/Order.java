package strategy_pattern.Example3;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Builder
// chain不写默认为false，当该值为 true 时，对应字段的 setter 方法调用后，会返回当前对象
//@Accessors(chain = true)
public class Order {
    /**
     * 金额
     */
    private int amount;

    /**
     * 支付类型
     */
    private String type;
}
