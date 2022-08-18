package strategy_pattern.Example2;

import java.util.Arrays;
import java.util.List;

public class StrategyIfElse {
    /**
     * 使用策略模式优化
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");
//        list.forEach(traditionIfElse -> {
//            //四层if else 看起来还好 但是如果代码量的增加就会导致阅读性越来越低
//            if ("a".equals(traditionIfElse)) {
//                System.out.println("A");
//            } else if ("b".equals(traditionIfElse)) {
//                System.out.println("B");
//            } else if ("c".equals(traditionIfElse)) {
//                System.out.println("C");
//            } else if ("d".equals(traditionIfElse)) {
//                System.out.println("D");
//            } else {
//                System.out.println("XJB输入");
//            }
//        });
        list.forEach(traditionIfElse -> {
            //使用枚举值优化if else
            StrategyContext strategyContext = StrategyEnum.valueOf(traditionIfElse).getStrategyContext();
            System.out.println(strategyContext.strategyTest());
        });
    }
}
