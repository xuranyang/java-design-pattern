# 命令模式 Command Pattern

命令接口 (Command)：定义命令的接口，声明执行的方法。

具体命令 (ConcreteCommand)：命令接口实现对象，是“虚”的实现；通常会持有接收者，并调用接收者的功能来完成命令要执行的操作。

接受者 (Receiver)：接收者，真正执行命令的对象。任何类都可能成为一个接收者，只要它能够实现命令要求实现的相应功能。

调用者 (Invoker)：要求命令对象执行请求，通常会持有命令对象，可以持有很多的命令对象。这个是客户端真正触发命令并要求命令执行相应操作的地方，也就是说相当于使用命令对象的入口。

客户 (Client)：创建具体的命令对象，并且设置命令对象的接收者。注意这个不是我们常规意义上的客户端，而是在组装命令对象和接收者，或许，把这个 Client 称为装配者会更好理解，因为真正使用命令的客户端是从 Invoker 来触发执行。




```
Client -> Invoker  -> Command
                         ⬆
       -> Receiver <- ConcreteCommand
```

```
Client顾客 -> Invoker服务员 -> Command 
                                ⬆
          -> Receiver厨师  <- ConcreteCommand 订单 
```


