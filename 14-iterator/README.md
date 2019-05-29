### 迭代器模式
#### 四个角色：
- Iterator 抽象迭代器

    抽象迭代器负责定义访问和遍历元素的接口，而且基本上是有固定的3个方法：
    first()获得第一个元素,next() 访问下一个元素，isDone() 是否已经
    访问以底部（Java 叫做 hasNext() 方法）
- ConcreteIterator 具体迭代器

    具体迭代器角色要实现迭代器接口，完成容器元素的遍历。
- Aggregate 抽象容器

    容器角色负责提供创建具体迭代器角色的接口，必然提供一个类似
    createIterator() 这样的方法，在Java中一般是iterator()方法。
- Concrete Aggregate 具体容器

    具体容器实现容器接口定义的方法，创建容纳迭代器的对象