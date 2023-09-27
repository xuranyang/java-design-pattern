# Chain Of Responsibility Pattern 责任链模式

Client(客户端)：实例化一个处理器的链，在第一个链对象中调用handleRequest 方法

Handle(处理器)：抽象类，提供给实际处理器继承然后实现handleRequst方法，处理请求

ConcreteHandler(具体处理器)：继承了handler的类，同时实现handleRequst方法，负责处理业务逻辑类，不同业务模块有不同的ConcreteHandler


- 链表实现方式
- 数组实现方式