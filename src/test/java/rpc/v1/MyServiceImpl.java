package rpc.v1;

public class MyServiceImpl implements MyService {
    @Override
    public int add(int a, int b) {
        return a + b;
    }
}
