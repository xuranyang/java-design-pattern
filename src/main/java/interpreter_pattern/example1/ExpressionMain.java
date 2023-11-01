package interpreter_pattern.example1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * 解释器模式 入口类
 */
public class ExpressionMain {
    /*
    输入表达式：
    a+b-c+d
    100
    20
    80
    10
    运算结果为：a+b-c+d=50
     */
    public static void main(String[] args) {
        String expStr = getExpStr();
        Map<String, Integer> map = getValue(expStr);
        Calculator calculator = new Calculator(expStr);
        System.out.println("运算结果为：" + expStr + "=" + calculator.run(map));
    }

    /**
     * 获取表达式
     *
     * @return 控制台输入的表达式
     */
    private static String getExpStr() {
        System.out.println("输入表达式：");
        try {
            return (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    /**
     * 获得值映射
     */
    public static Map<String, Integer> getValue(String expStr) {
        Map<String, Integer> map = new HashMap<>();
        char[] cs = expStr.toCharArray();
        try {
            for (char c : cs) {
                // 如果是值的占位符
                if (c != '+' && c != '-') {
                    // 解决重复参数的问题，确保值的占位符唯一
                    if (!map.containsKey(String.valueOf(c))) {
                        String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                        map.put(String.valueOf(c), Integer.valueOf(in));
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }
}