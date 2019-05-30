### 解释器模式

#### 四个角色：

- AbstractExpression 抽象解释器

    具体的解释任务由各个实现类完成，具体的解释器分别由 TerminalExpression
    和 NonTerminalExpresion 完成
- TerminalExpression 终结符表达式

    实现也文法中的元素相关联的解释操作，通常一个解释器模式中只有一个终
    结符表达式，但有多个实例，对应不同的终结符。
- NonTerminalExpresion 非终结符表达式

    文法中的每条规则对应于一个非终结表达式。
- Context 环境角色  
    