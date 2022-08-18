package strategy_pattern.Example2;

public enum StrategyEnum {
    a("a",new AtypeImpl()),
    b("b",new BtypeImpl()),
    c("c",new CtypeImpl()),
    d("d",new DtypeImpl())
    ;

    private String text;
    private StrategyContext strategyContext;

    StrategyEnum(String text, StrategyContext strategyContext) {
        this.text = text;
        this.strategyContext = strategyContext;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public StrategyContext getStrategyContext() {
        return strategyContext;
    }

    public void setStrategyContext(StrategyContext strategyContext) {
        this.strategyContext = strategyContext;
    }
}
