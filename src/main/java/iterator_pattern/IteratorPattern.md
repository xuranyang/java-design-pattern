# 迭代器模式 Iterator Pattern

定义： 提供一个对象来顺序访问聚合对象中的一系列数据，而不暴露聚合对象的内部表示。


迭代器模式主要包含以下角色：
- 抽象聚合（Aggregate）角色：定义存储、添加、删除聚合元素以及创建迭代器对象的接口。
- 具体聚合（ConcreteAggregate）角色：实现抽象聚合类，返回一个具体迭代器的实例。
- 抽象迭代器（Iterator）角色：定义访问和遍历聚合元素的接 口，通常包含 hasNext()、next() 等方法。
- 具体迭代器（Concretelterator）角色：实现抽象迭代器接口中所定义的方法，完成对聚合对象的遍历，记录遍历的当前位置。


Collection / Aggregate / Container 是一个意思，只是叫法不同 
