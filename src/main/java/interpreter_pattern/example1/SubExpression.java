package interpreter_pattern.example1;

import java.util.Map;

/**
 * 减法解析器
 */
public class SubExpression extends SymbolExpression {
    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left  表达式左部
     * @param right 表达式右部
     */
    public SubExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        return super.left.interpreter(map) - super.right.interpreter(map);
    }
}