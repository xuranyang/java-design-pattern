package interpreter_pattern.example1;

/**
 * 抽象运算符号解析器
 */
public abstract class SymbolExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * 所有的解析公式都应只关心自己左右两个表达式的结果
     *
     * @param left  表达式左部
     * @param right 表达式右部
     */
    public SymbolExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
}