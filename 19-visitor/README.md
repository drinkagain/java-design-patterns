### 访问者模式

#### 五个角色：

- Visitor 抽象访问者
    
    抽象类或接口，声明访问者可以访问哪些元素。
- ConcreteVisitor 具体访问者

    它影响访问者访问到一个类后该干什么，要做什么事情。
- Element 抽象元素

    接口或抽象类，声明接受哪一类访问者访问，程序上是通过 accept 方法中的
    参数来定义的。
- ConcreteElement 具体元素

    实现accept方法，通过是visitor.visit(this)，基本上都形成了一种
    模式了。
- ObjectStructure 结构对象

    元素产生者，一般容纳在多个不同类、不同接口的容器中，如List、Set、Map等，
    在项目中，一般很少抽象出这个角色。