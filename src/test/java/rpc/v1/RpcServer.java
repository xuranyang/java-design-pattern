package rpc.v1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;

public class RpcServer {
    private MyService myService;

    public RpcServer(MyService myService) {
        this.myService = myService;
    }

    public void start(int port) {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Server started. Listening on port " + port + "...");
            while (true) {
                Socket socket = serverSocket.accept();
                processRequest(socket);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void processRequest(Socket socket) {
        try (
                ObjectInputStream input = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream())
        ) {
            String methodName = input.readUTF();
            Class<?>[] parameterTypes = (Class<?>[]) input.readObject();
            Object[] arguments = (Object[]) input.readObject();

            // 在这里根据methodName和parameterTypes调用相应的方法
            // int result = myService.add((int) arguments[0], (int) arguments[1]);
            Method method = myService.getClass().getMethod(methodName, parameterTypes);
            Object result = method.invoke(myService, arguments);

            output.writeObject(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MyService myService = new MyServiceImpl();
        RpcServer rpcServer = new RpcServer(myService);
        rpcServer.start(8888);
    }
}
