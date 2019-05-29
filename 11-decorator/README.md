### 装饰模式
#### 四个角色：
- Component 抽象构件
    
    Component 是一个接口或者是抽象类，就是定义我们最核心的对象，也就是
    最原始的对象
    > 在装饰模式中，必然有一个最基本、最核心、最原始的接口或抽象类充当
    Component 抽象构件。
- ConcreteComponent 具体构件

    ConcreteComponent 是最核心、最原始、最基本的接口或抽象类的实现，
    需要装饰的对象就是它。
- Decorator 装饰角色

    一般是一个抽象类。它里面不一定有抽象的方法，在它的属性里必然有一个
    private 变量指向Component 抽象构件。  
- ConcreteDecorator 具体装饰类

    具体装饰类，要把最核心、最原始、最基本的东西装饰成其它东西。