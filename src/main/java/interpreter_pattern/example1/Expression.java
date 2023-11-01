package interpreter_pattern.example1;

import java.util.Map;

/**
 * 表达式 抽象类
 */
public abstract class Expression {
    /**
     * 解析公式和数值
     *
     * @param map key是公式中的参数，value是参数对应的值
     * @return 结果
     */
    public abstract int interpreter(Map<String, Integer> map);

}