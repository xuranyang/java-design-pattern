package rpc.v1;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class RpcClient {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888)) {
            ObjectOutputStream output = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream input = new ObjectInputStream(socket.getInputStream());

            String methodName = "add";
            Class<?>[] parameterTypes = new Class[]{int.class, int.class};
            Object[] arguments = new Object[]{2, 3};

            // 这里的参数与Server的processRequest方法处理所对应
            output.writeUTF(methodName);
            output.writeObject(parameterTypes);
            output.writeObject(arguments);

            int result = (int) input.readObject();
            System.out.println("Client Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
