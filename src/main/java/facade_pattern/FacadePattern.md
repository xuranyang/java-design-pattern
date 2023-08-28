# 外观模式 Facade Pattern

外观模式 (Facade Pattern) 提供了一个统一的接口，用来访问子系统中的一群接口。外观定义了一个高层接口，让子系统更容易使用。

想要使用外观模式，我们需要创建一个接口来简化和统一包装一个子系统的一个或多个类。外观模式允许我们让客户和子系统之间避免紧耦合。

- 客户 (Client):通过调用 Facede 来完成要实现的功能。
- 外观 (Facade)：外观模式的核心。它被客户角色调用，它熟悉子系统的功能。内部根据客户角色的需求预定了几种功能的组合。外观类是外部客户端访问子系统的入口。它封装了子系统的复杂性，并提供简化的方法供客户端使用。
- 子系统(Subsystem):实现了子系统的功能。它对客户角色和 Facade 是未知的。它内部可以有系统内的相互交互，也可以由供外界调用的接口。子系统是一组相关的类或模块，负责实现子系统的功能。外观模式通过外观类将客户端的请求委派给子系统来处理。


外观模式的优点包括：
1. 简化客户端与子系统之间的交互，客户端只需要与外观类进行交互，而无需了解子系统的复杂性和具体实现细节。
2. 将子系统的复杂性封装起来，降低了客户端的复杂性和耦合度。
3. 提供了一个统一的接口，使得子系统的功能更加易于使用和理解。

外观模式的缺点包括：
1. 如果需求变更，可能需要修改外观类的代码，这可能会影响到客户端代码的稳定性。
2. 外观模式并不限制客户端直接访问子系统，因此客户端仍然可以绕过外观类直接访问子系统，这可能会导致一些意想不到的问题。

适用场景：
1. 当存在复杂的子系统并希望将其封装起来，使得客户端可以更简单地使用子系统时，可以考虑使用外观模式。
2. 当需要对外部客户端隐藏子系统的复杂性，提供一个简化的接口时，可以使用外观模式。
3. 当希望将子系统与客户端代码解耦，减少代码依赖和耦合时，可以使用外观模式。