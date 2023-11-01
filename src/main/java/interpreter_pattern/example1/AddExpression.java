package interpreter_pattern.example1;

import java.util.Map;

/**
 * 加法解析器
 */
public class AddExpression extends SymbolExpression {
    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left  表达式左部
     * @param right 表达式右部
     */
    public AddExpression(Expression left, Expression right) {
        super(left, right);
    }

    @Override
    public int interpreter(Map<String, Integer> map) {
        // super.left.interpreter(var) ： 返回 left 表达式对应的值 a = 10
        // super.right.interpreter(var): 返回right 表达式对应值 b = 20
        return super.left.interpreter(map) + super.right.interpreter(map);
    }
}