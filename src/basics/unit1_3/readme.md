## 章后总结
### 第一章总结（计算机、程序、和java概述）
- 计算机是存储和处理数据的电子设备
- 计算机包括硬件和软件两部分
- 硬件是计算机中可以触摸的物理部分
- 计算机程序，也就是通常所说的软件，是一些不可见的指令，他们控制硬件完成任务
- 计算机程序设计就是编写让计算机执行的指令（代码）
- cpu是计算机的大脑。它从内存获取指令并且执行这些指令
- 计算机使用0和1，因为数字设备有两个稳定的状态，习惯上就是指的0和1
- 一个比特指的二进制数0和1
- 一个字节是指的8个比特的序列
- 千字节大约是1000字节，兆字节大约是100万字节，千兆字节大约是10亿字节，万亿字节大约是1万亿字节
- 内存存储cpu要执行的数据和程序指令
- 内存单元是字节的有序序列
- 内存是不能长久保存数据的，因为断电时信息就会丢失
- 程序和数据永久地保存存储设备里，当计算机确实需要使用它们时被移入内存
- 机器语言是一套内嵌在每台计算机的原始指令集
- 汇编语言是一种低级程序设计语言，它用于助记符表示每一条机器语言的指令
- 高级语言类似于英语，易于学习和编写程序
- 用高级语言编写的程序叫做源程序
- 编译器是将源程序翻译成机器语言程序的软件
- 操作系统是管理和控制计算机活动的程序
- java是平台无关的，这意味着只需编写一次程序，就可以在任何计算机上运行
- java程序可以内嵌在html网页内，通过web浏览器下载，给web客户带来生动的动画和灵活的交互性
- java源程序文件名必须和程序中的公共类名一致，并且以拓展名.java结束
- 每个类都被编译成一个独立的字节码文件，该文件名与类名相同，拓展名为.class
- 使用javac命令可以从命令行编译java源代码文件
- 使用java命令可以从命令行运行java类
- 每个java程序都是一套类的定义集合。关键字class引入类的定义，类的内容包含在块内
- 一个块以左花括号({)开始，以右花括号(})结束
- 方法包含在类中，每个可执行的java程序必须有一个main方法，main方法是程序开始执行的入口
- java中每条语句都是以分好结束的，也称该符号为语句结束符
- 保留字或者称关键字，对编译器而言都有特殊含义，在程序中不能用于其他的目的
- 在java中，在单行上用两个斜杠引导注释，也称行注释；在一行或者多行用/*  */包含注释，称为块注释或者段注释，编译器会忽略
- java源程序区分大小写
- 编程错误可以分为三类：语法错误，运行时错误，和逻辑错误。编译器报告的语法错误或者是编译错误，运行时错误指引起程序非正常结束的错误。当一个程序没有按照预期的方式执行时，产生逻辑错误

### 第二章（基本程序设计）
- 标识符是程序中用于命名的诸如变量，常量，方法，类，包之类的元素的名称
- 标识符是由字母、数字、下划线和美元符号构成的字符序列。标识符必须以字母或者下划线开头，不能以数字开头，标识符不能是保留字，标识符可以为任意长度
- 变量用于存储程序中的数据。声明变量就是告诉编译器变量可以存储何种数据类型
- 有两种类型的import语句，明确导入和通配符导入。明确导入是在import语句中指定导入单个类；通配符导入是将包中所有类导入
- 除非要在程序中使用某个类，否则关于被导入包中的这些类的信息在编译时或者运行时是不被读入的。导入语句只是告诉编译器在什么地方能导出这些类。声明明确导入和声明通配符导入在性能上是没有什么差别的
- 在java中（=）被用做赋值操作符
- 方法中声明变量必须使用前被赋值
- 命名常量表示从不改变数据的永久数据
- 用关键字final声明命名常量
- java提供四种整数类型（byte，short，int，long）表示四种不同长度范围的整数
- java提供了两种浮点类型（float，double）表示两种不同精度的浮点数
- java提供操作符完成数值运算：加号+，减号-，乘号*，除号/，求余符号%
- 整数运算（/）得到的结果是一个整数
- java表达式中的数值操作符合算术表达式中的使用方法是完全一致的
- java提供拓展赋值操作符：+=、-=，*=，/=，%=
- 自增操作符（++）和自减操作符（--）分别对变量加1和减1
- 当计算的表达式中有不同类型的值，java会自动的将操作数转换成恰当的类型
- 可以使用（type）value这样的表达法显示的将数值从一个类型转换到另一个类型
- 将一个较小范围类型的变量转换为较大范围类型的变量成为拓宽类型
- 将一个范围较大类型的变量转换为较小范围类型的变量成为缩窄类型
- 拓宽类型不需要显示转换，可以自动完成，缩窄类型必须显示完成
- 在计算机科学中。1970年1月1日午夜零点成为UNIX时间戳。因为1970年是UNIX操作系统正式发布的时间

### 第三章（选择）
- boolean类型变量可以存储值true或者false
- 关系操作符(< <= == != > >=)产生一个布尔值
- 选择语句用于可选择的动作路径的编程，选择语句有以下几种类型：单分支if语句，双分支if-else语句，嵌套if语句，多分支if-else语句，switch语句和条件表达式
- 各种if语句都是基于布尔表达式来控制的，根据表达式的值是true或者false，这些语句选择两种可能路径中的一种
- 布尔操作符 && 、||、|、 ^，对布尔值和布尔变量进行计算
- 当对p1 && p2求值时，java先对p1进行求值，如果p1为true，再对p2进行求值。如果p1为false，就不再对p2求值。当对p1||p2求值时，java先求p1的值，如果p1是false，再对p2进行求值，如果p1是true，就不对p2进行求值计算了。因此&&也称条件与操作符或者是短路与操作符。||也称条件或操作符或者短路或操作符
- switch语句中，char，byte，short，int或者String类型的switch表达式来进行控制决定的
- 在switch语句中关键字break是可选的，但它通常用在每个分支的结尾，以终止执行switch语句的剩余部分。如果没有出现break语句，则执行接下来的case语句
- 表达式中的操作符按照括号、操作符优先级以及操作符结合规则所确定的次序进行求值
- 括号用于强制求值的顺序以任何顺序进行
- 具有更高级优先权的操作符更早的进行操作。对于同样优先级的操作符，他们的结合规则确定操作的顺序
- 除开赋值操作符的所有二元操作符都是左结合的。赋值操作符是右结合的

## 代码示例
- AdditionQuiz.java
计算加法
- ChineseZodiac.java
根据年龄获取属相
- ComputeAndInterpretBMI.java
计算身体指数
- ComputeArea.java
计算圆的面积
- ComputeAverage.java
计算平均数
- ComputeLoan.java
计算贷款利率
- ComputeNum.java
计算数值
- Epsilon.java
如果将两个浮点型进行判断相等
- GetLastWeek.java
计算几天后是周几
- LeapYear.java
判断是否是闰年
- PointIsIntoCircle.java
判断一个点是否在圆内
- ShowCurrentTime.java
获取当前时间
- Test.java
0.1+0.2 != 0.3