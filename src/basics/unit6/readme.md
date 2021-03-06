### 第六章（方法）
- 程序模块化和可重用性是软件工程的目标之一，java提供了很多有助于完成这一目标的有效结构。方法就是这样一个结构
- 方法头指定方法的修饰符、返回值类型、方法名和参数。本章所有的方法都使用静态修饰符static
- 方法可以返回一个值。返回值的类型returnValueType是方法要返回的值得数据类型。如果方法不返回值，则返回值类型就是关键字void
- 参数列表是指方法中参数的类型，次序和数量，方法名和参数列表一起构成方法签名。参数是可选的。也就是说，一个方法可以不包含参数
- return语句也可以用在void方法中，用来终止方法并返回到方法的调用者。在方法中，有时用于改变正常流程控制室很有用的
- 传递给方法的实际参数应该与方法签名中的形式参数具有相同的数目，类型和顺序
- 当程序调用一个方法时，程序控制就转移到被调用的方法。被调用的方法执行到该方法的是return语句或者到达方法结束的右括号时，将程序控制交还给调用者
- 在java中，带返回值的方法也可以当做语句调用。在这种情况下，调用函数只要忽略返回值即可
- 方法可以重载，这就意味着两个方法可以同时拥有相同的方法名，只要它们的方法参数列表不同即可
- 在方法中声明的变量称作为局部变量，局部变量的作用域是从声明它的地方开始，到包含这个变量的块结束为止，局部变量在使用前必须声明和初始化
- 方法抽象是指把方法的应用和实现分离，用户可以在不知道方法时如何实现的情况下使用方法，方法的实现细节封装在方法内，对调用该方法的用户隐藏，这称为信息隐藏或者封装
- 方法抽象将程序模块化为整齐、层次分明的形式，将程序写成简洁的方式构成的集合会比其他方式更容易编写，调试，维护和修改，这种编写风格也会提高方法的可重用性
- 当实现一个大型程序时，可以使用自顶向下或者自底向上的编码方法，不要一次性编写完整的程序，这种方式似乎是浪费了更多的编码时间，但实际上，它会更节省时间并使用调试更容易

## 代码示例
- CheckCreditCard.java
检查信用卡号是否合法
- CheckPassword.java
检查密码是否合法
- DoublePrimeNumber.java
获取双素数
- GreatestCommonDivisorMethod.java
获取最大公约数
- Millis2Hour.java
格式化毫秒
- RandomCharacter.java
- TextRandomCharacter.java
生成各种随机数
- TestMethodOverloading.java
方法重载