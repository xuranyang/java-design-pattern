package chain_of_responsibility_pattern.example4;

public abstract class Handler {
    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handleRequest(Integer times);
}
