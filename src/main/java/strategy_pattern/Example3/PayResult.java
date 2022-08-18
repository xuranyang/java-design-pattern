package strategy_pattern.Example3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PayResult {
    /**
     * 响应码
     */
    private int code;
    /**
     * 提示信息
     */
    private String msg;

    public static PayResult success(String msg) {
        return new PayResult(200, msg);
    }
}
