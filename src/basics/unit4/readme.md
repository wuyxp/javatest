### 第四章（数学函数、字符和字符串）
- java提供了在Math类中的数学方法sin、cos、tan、asin、acos、atan、toRadians、toDegree、exp、log、log10、pow、sqrt、cell、floor、rint、round、min、max、abs以及random，用于执行数学函数
- 字符类型char表示单个字符
- 转义序列包含反斜杠\以及后面的字符或者数字组合
- 字符\称为转义字符
- 字符 ' '、 \t、\f、\r和\n都成为空白字符
- 字符可以基于他们的Unicode码使用关系操作符进行比较
- Character类包含方法：isDigit，isLetter，isLetterOrDigit，isLowerCase，isUpperCase用于判断一个字符是否是数字，字母，小写字母还是大写字母。它包含toLowerCase和toUpperCase方法返回小写或者大写字母
- 字符串是一个字符序列，字符串的值包含在一对匹配的双引号"中。字符的值包含在一对单引号'中
- 字符串在java中是个对象，只能通过一个指定对象调用的方法称为实例方法，非实例方法称为静态方法可以不使用对象来调用
- 可以调用字符串的length()方法获取它的长度，使用charAt(index)方法，从字符串中提取特定下标位置的字符，使用indexOf和lastIndexOf找出一个字符串中的某个字符或者某个子串
- 可以使用substring方法从字符串中提取子串
- 可以使用equals和compareTo方法比较字符串。如果两个字符串相等，equals方法返回true；如果它们不相等，则返回false，compareTo方法根据一个字符串等于、大于、或者小于另一个字符串，分别返回0，正整数和负整数
- printf方法可以格式化标识符来显示一个格式化的输出

## 代码示例
- ComputeAreaRegularPolygon.java
计算正多边形的面积
- GuessBirthday.java
猜生日日期
- HexDigit2Dec.java
16进制转成10进制
- OrderTwoCities.java
获取并且排序两个字符串