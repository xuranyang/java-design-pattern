package interpreter_pattern.example1;

import java.util.Map;
import java.util.Stack;

/**
 * 解释器的封装类
 * 将运算符和运算符两边的值进行组合，实现解释
 */
public class Calculator {
    private final Expression expression;

    public Calculator(String expStr) {
        // 安排运算先后顺序
        Stack<Expression> stack = new Stack<>();
        // 表达式拆分成字符数组
        char[] cs = expStr.toCharArray();
        Expression left;
        Expression right;
        // 遍历我们的字符数组， 即遍历  [a, +, b]
        // 针对不同的情况，做处理
        for (int i = 0; i < cs.length; i++) {
            switch (cs[i]) {
                // 加法
                case '+': {
                    // 从stack取出left => "a"
                    left = stack.pop();
                    // 取出右表达式 "b"
                    right = new VarExpression(String.valueOf(cs[++i]));
                    // 然后根据得到left 和 right 构建 AddExpression 加入stack
                    stack.push(new AddExpression(left, right));
                    break;
                }
                // 减法
                case '-': {
                    left = stack.pop();
                    right = new VarExpression(String.valueOf(cs[++i]));
                    stack.push(new SubExpression(left, right));
                    break;
                }
                default:
                    //如果是一个 Var 就创建要给 VarExpression 对象，并push到 stack
                    stack.push(new VarExpression(String.valueOf(cs[i])));
            }
        }
        // 当遍历完整个 charArray 数组后，stack 就得到最后Expression
        this.expression = stack.pop();
    }

    public int run(Map<String, Integer> map) {
        // 最后将表达式a+b和 map = {a=10,b=20}
        // 然后传递给expression的interpreter进行解释执行
        return this.expression.interpreter(map);
    }
}