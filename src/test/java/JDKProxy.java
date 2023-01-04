import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    /**
     * @Description //TODO 创建被代理类增强功能后的代理类
     **/
    public static void main(String[] args) {
        Class[] interfaces = new Class[]{UserDao.class};
        //创建接口实现类代理对象
//        以下三个参数分别是类加载器、被实现接口的Class数组对象、增强后的功能
        UserDao userDao = new UserDaoImpl();
//        此处相当于对代理类进行了一个封装得到了一个对象，而真正的功能增强部分已经在UserDaoProxy类中。
        Object o = Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));//此处的interfaces是为了服务后边的new UserDaoProxy()的，为其提供标准
        UserDao dao = (UserDao) o;
//        int result = dao.add(1, 2);//因为已经在代理对象中传过interfaces信息了，所以代理类知道接口中的一切方法，也就是知道增强哪个被代理类的方法
        String result = dao.update("helloworld!");
        System.out.println("==============");
        System.out.println(result);
    }
}

interface UserDao {
    /**
     * @Description //TODO 被实现的接口
     **/
    public int add(int a, int b);

    public String update(String id);
}

class UserDaoImpl implements UserDao {
    /**
     * @Description //TODO 被代理的对象
     **/
    @Override
    public int add(int a, int b) {
        System.out.println("add 执行中");
        return a + b;
    }

    @Override
    public String update(String id) {
        System.out.println("update 执行中");
        return id;
    }
}

class UserDaoProxy implements InvocationHandler {
    /**
     * @Description //TODO 对被代理对象object实现功能增强
     **/
    //被代理的对象
    private Object object;

    public UserDaoProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        /**
         * @Description //TODO 可以被代理对象的不同方法做不同的增强
         * @Param [proxy, method, args]
         * @return java.lang.Object
         **/
        if (method.getName() == "add") {
            System.out.println("add方法之前执行。传入方法的参数为：" + Arrays.toString(args) + "\n");
            Object res = method.invoke(object, args);//相当于这里这说要调用object对象的方法，传入的参数是args，但并没有说调用的是哪个方法。
            System.out.println("\nadd方法之后执行。被代理对象为" + object);
            return res;
        } else {
            System.out.println("update方法之前执行。传入方法的参数为：" + Arrays.toString(args) + "\n");
            Object res = method.invoke(object, args);//相当于这里这说要调用object对象的方法，传入的参数是args，但并没有说调用的是哪个方法。
            System.out.println("\nupdate方法之后执行。被代理对象为" + object);
            return res;
        }
    }
}