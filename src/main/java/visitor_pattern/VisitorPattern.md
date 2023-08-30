# Visitor Pattern 访问者模式


抽象元素类(Element)：定义一个accept 方法，接收一个访问者对象

具体元素类(ConcreteElement)：实现了accept方法

抽象访问类(Visitor)：为该对象结构中的ConcreteElement的每一个类声明一个visit操作

具体访问类(ConcreteVisitor)：实现Visitor声明的操作，是每个操作实现的部分

对象结构(ObjectStructure)：对象结构是一个抽象表述，它内部管理了元素集合，并且可以迭代这些元素提供访问者访问
