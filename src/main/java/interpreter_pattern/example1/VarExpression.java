package interpreter_pattern.example1;

import java.util.Map;

/**
 * 变量解析器
 */
public class VarExpression extends Expression {
    private final String key;

    public VarExpression(String key) {
        this.key = key;
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return map.get(key);
    }
}