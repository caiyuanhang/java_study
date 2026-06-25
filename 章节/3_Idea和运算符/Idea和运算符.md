# 1 Idea 的使用

## 1.1 Idea 的介绍

Idea 是一个开发工具，它可以加速我们的开发。

其有如下特点：

*   用 Java 写的，强依赖于 jdk 环境（也就是 JAVA_HOME 环境变量的设置）；
*   可以让我们避免手动输入 javac 和 java 命令；
*   有强大的快捷键、生成代码和纠错等；
*   会自动管理我们写的代码；
*   可以自动保存文件。

除了Idea，还有其他相关工具，类似：`eclipse`、`myeclipse`（这两款基本是老式的开发工具了）

Idea 的安装：

*   到 [Idea官网](https://www.jetbrains.com/zh-cn/idea/download/?section=windows) 下载 IDEA 安装包；
*   点开安装包，选择目录结构 -> 选择安装选项（一般勾个快捷键就差不多了）-> 安装；
*   安装 [pj](https://pan.baidu.com/s/1s-VXkkIycyDNCCBgBU8KaQ?pwd=6666) 软件，解锁 idea 使用权限。

## 1.2 Idea 的目录结构

![image.png](./图片/Idea的目录结构.webp)

先创建 Project，然后在 Project 下创建 Module，最后再在 Module 下创建 Package。

## 1.3 如何创建一个 Project

### 1.3.1 创建 Project

*   方式1：从项目根视图创建新项目；

`Idea` 项目视图 -> 新建项目 -> 空项目 -> 输入项目名称和位置 -> 确定

![image.png](./图片/创建Project_方式1_1.webp)

![image.png](./图片/创建Project_方式1_2.webp)

![image.png](./图片/创建Project_方式1_3.webp)

*   方式2：在已有项目视图创建新项目

点击左上角主菜单 icon -> 新建 -> 项目... -> 空项目 -> 输入项目名称和位置 -> 确定

![image.png](./图片/创建Project_方式2_1.webp)

![image.png](./图片/创建Project_方式2_2.webp)

![image.png](./图片/创建Project_方式2_3.webp)

*   方式3：在工作区项目视图创建新项目

![image.png](./图片/创建Project_方式3_1.webp)

![image.png](./图片/创建Project_方式3_2.webp)

### 1.3.2 移除 Project

关闭项目 -> 从最近项目中移除。

**注意：** 这只是将项目从 Idea 中移除，并不是真的删除项目，项目文件夹还是在之前创建时所在的目录位置。

![image.png](./图片/移除Project_1.webp)

![image.png](./图片/移除Project_2.webp)

### 1.3.3 打开 Project

*   方式1：从项目根视图创建新项目；

![image.png](./图片/打开Project_方式1.webp)

*   方式2：在已有项目视图打开项目；

![image.png](./图片/打开Project_方式2.webp)

*   方式3：在工作区项目视图打开项目；

![image.png](./图片/打开Project_方式3.webp)

## 1.4 如何创建一个 Module

### 1.4.1 创建 Module

*   方式1：通过右键创建；

对项目根文件夹，单击右键 -> 新建 -> 模块... -> 输入模块名和确认位置 -> 选择 JDK 版本以及是否要添加示例代码 -> 点击创建

![image.png](./图片/创建Module方式1_1.webp)

![image.png](./图片/创建Module方式1_2.webp)

*   方式2：通过项目结构创建

点击左上角主菜单 icon -> 项目结构... -> 项目设置，模块 -> 点击 "+" -> 新建模块 -> 输入模块名和确认位置 -> 选择 JDK 版本以及是否要添加示例代码 -> 点击创建

![image.png](./图片/创建Module方式2_1.webp)

![image.png](./图片/创建Module方式2_2.webp)

![image.png](./图片/创建Module方式2_3.webp)

### 1.4.2 删除 Module

右键 Module 文件夹 -> 移除模块弹窗 -> 移除 -> 右键 Module 文件夹 -> 删除 -> 删除模块弹窗 -> 删除。

![image.png](./图片/删除Module_1.webp)

![image.png](./图片/删除Module_2.webp)

![image.png](./图片/删除Module_3.webp)

![image.png](./图片/删除Module_4.webp)

### 1.4.3 导入已有 Module

点击左上角主菜单 icon -> 项目结构... -> 项目设置，模块 -> 点击 "+" -> 导入模块 -> 选择导入的文件或目录，点击确定 -> 导入模块，从现有项目创建模块，点击下一步 -> 导入模块，选择导入模块文件或文件夹，点击下一步 -> 创建 -> 确定

![image.png](./图片/导入Module_1.webp)

![image.png](./图片/导入Module_2.webp)

![image.png](./图片/导入Module_3.webp)

![image.png](./图片/导入Module_4.webp)

![image.png](./图片/导入Module_5.webp)

![image.png](./图片/导入Module_6.webp)

### 1.4.4 关于 Module 的注意点

对项目根文件夹右键创建的 Module，其下的 src 文件夹默认为 `源代码根目录`（文件夹 icon 会显示有颜色），而通过项目结构创建的 Module，其 src 文件夹需要将其设置为 `源代码根目录`（文件夹 icon 为灰色，设置之后才会有颜色）

Module3 是通过 `项目结构` 创建的Module，其 src 是灰色，默认没有被设置为`源代码根目录`，如图：

![image.png](./图片/Module的注意点_1.webp)

![image.png](./图片/Module的注意点_2.webp)

![image.png](./图片/Module的注意点_3.webp)

## 1.5 如何创建一个 Package

### 1.5.1 Package命名规则和结构

#### Package 命名规则

一般是域名倒写，比如：`www.baidu.com`，包名就是：`com.baidu.XXX`（一般 `www` 会忽略掉，不用加入 Package name）

#### Package 结构

关于 Package 的命名，每个字符名称代表一个文件夹层级，`.` 前后对应父子文件夹，还是 `com.baidu.XXX` 为例：

`com.baidu.XXX` 表示 `com` 文件夹下有 `baidu` 文件夹，`baidu` 下面又有 `XXX` 文件夹。

### 1.5.2 创建 Package

右键 Module 下面的 src -> 新建 -> 软件包 -> 输入 Package name，按下 enter

![image.png](./图片/创建Package_1.webp)

![image.png](./图片/创建Package_2.webp)

### 1.5.3 删除 Package

右键 Package -> 删除(D)... -> 确认删除弹窗，点击删除

![image.png](./图片/删除Package_1.webp)

![image.png](./图片/删除Package_2.webp)

## 1.6 Idea 类的创建、运行及快捷编写

右键 Package -> 新家(N) -> Java 类 -> 输入类名，点回车 -> 生成对应的 class 的 java 文件。

![image.png](./图片/创建Java类_1.webp)

![image.png](./图片/创建Java类_2.webp)

![image.png](./图片/创建Java类_3.webp)

### 快捷生成代码

*   `psvm` -> 快速生成 `public static void main(String[] args) {}`；
*   `sout` -> 快速生成 `System.out.println()`；
*   `变量名.sout` -> 快速生成 `System.out.println(变量)`；
*   `变量名.soutv` -> 快速生成 `System.out.println("变量名 = " + 变量)`，这种打印方式格式更好看；
*   `psvm` -> 快速生成；

### 在 Idea 中运行 class

右键 java 文件 -> 运行'XXX.main()'，即可运行对应的类

![image.png](./图片/Idea中运行Java类.webp)

```java
package com.testing;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("Hello World" + '!');
        int num = 10;
        System.out.println(num);
        System.out.println("num = " + num);
    }
}
```

运行完，即可在 Idea 终端看到运行结果：

![image.png](./图片/Idea运行Java类后的结果.webp)

## 1.7 Idea 基本设置和快捷键

### 1.7.1 Idea 基本设置

*   设置字体大小；

左上角主菜单 Icon -> 文件 -> 设置 -> 编辑器 -> 字体

![image.png](./图片/Idea基本设置_设置字体_1.webp)

![image.png](./图片/Idea基本设置_设置字体_2.webp)

*   更改注释的设置；

左上角主菜单 Icon -> 文件 -> 设置 -> 编辑器 -> 配色方案 -> 语言默认设置 -> 注释。

![image.png](./图片/Idea基本设置_设置注释_1.webp)

![image.png](./图片/Idea基本设置_设置注释_2.webp)

### 1.7.2 Idea 快捷键

| 快捷键                | 作用                         |
| ------------------ | -------------------------- |
| Alt + Enter        | 自动修正代码                     |
| Ctrl + Y           | 删除光标所在行的代码                 |
| Ctrl + D           | 复制当前行代码，并将复制的代码插在光标所在行的下一行 |
| Alt + Shift + 上下箭头 | 移动当前行代码                    |
| Ctrl + /           | 单行注释                       |
| Ctrl + Shift + /   | 多行注释                       |
| Ctrl + Alt + L     | 格式化代码                      |

## 1.8 Idea 注意事项

*   在运行代码时，会出现 “找不到对应发行源” 、“不支持发行版本”、“无效的发行源版本” 等问题，这是由于本地 JDK 版本和 Idea 中的语言级别不匹配导致的。

解决：右键 ModuleXX -> 打开模块设置 -> 项目设置，模块 -> 选择对应的模块 -> 设置语言级别。这样让 Idea 中的 JDK 版本跟本地保持一致就可以解决这个问题了。

*   没有 out 路径，out 路径是专门用来存放 Idea 自动编译生成的 .class 文件的，所以需要指明 out 路径。

解决：左上角文件菜单 -> 项目结构 -> 项目设置，项目 -> 编译器输出 -> 设置输入目录

*   src icon 是灰色的，代表着 Idea 不会将它识别为源代码根目录。

解决：对 src 右键 -> 将目录标记为 -> 源代码根目录。

*   刚使用 Idea，JDK 没有配置。

解决：左上角文件菜单 -> 项目结构 -> 项目设置，项目 -> SDK

# 2 运算符

## 2.1 算数运算符

| 符号 | 说明                                     |
| -- | -------------------------------------- |
| +  | 加                                      |
| -  | 减                                      |
| \* | 乘                                      |
| /  | 除，符号前后都是整数，结果取整数部分；符号前后有一个为小数，结果就是正常小数 |
| %  | 模，取余数部分                                |

```java
public class Demo01 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 3;
        int addition = num1 + num2;
        System.out.println("算术运算符-加法=="+addition);

        int sub = num1 - num2;
        System.out.println("算术运算符-减法=="+sub);

        int mul = num1 * num2;
        System.out.println("算术运算符-乘法=="+mul);

        int div = num1 / num2;
        System.out.println("算术运算符-除法=="+div);

        int mod = num1 % num2;
        System.out.println("算术运算符-模=="+mod);

        // 注意：当 + 的左右某一侧有字符串时，它的作用就变成了拼接
        String str = num1 + "1";
        System.out.println("关于 + 的拼接功能=="+str);
    }
}

/** 算术运算符-加法==13
    算术运算符-减法==7
    算术运算符-乘法==30
    算术运算符-除法==3
    算术运算符-模==1
    关于 + 的拼接功能==101
* */
```

## 2.2 自增自减运算符

### 2.2.1 格式

*   变量++ -> 后自加；
*   ++变量 -> 前自加；
*   变量-- -> 后自减；
*   \--变量 -> 前自减；

**注意：** 自增和自减都是只变化 1。

### 2.2.2 使用

#### 2.2.2.1 单独使用

`++`、`--` 单独为一句，没有与其他语句混合使用，此时，符号在前在后都是先运算。

```java
public class Demo02 {
    public static void main(String[] args) {
        int num = 10;
        num++;
        System.out.println("num++ == " + num);

        ++num;
        System.out.println("++num == " + num);

        num--;
        System.out.println("num-- == " + num);

        --num;
        System.out.println("--num == " + num);
    }
}

/*
* num++ == 11
  ++num == 12
  num-- == 11
  --num == 10
* */
```

#### 2.2.2.2 混合使用

`++`、`--` 和其他语句混合使用。

此时，符号在前：先运算，再使用运算后的值；符号在后：先使用原值，使用完之后，自身再运算。

```java
public class Demo03 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int res = num1++ + --num2 + ++num1;
        System.out.println("res == " + res);
    }
}

// res == 41，分析：num1 先和自减之后的 num2 做运算，然后 num1 自加，自加完之后，再将上一步得出的结果跟 ++num1 做运算，得出结果 41。
```

#### 2.2.2.3 `c = c++`分析

```java
public class Demo04 {
    public static void main(String[] args) {
        int c = 10;
        byte var10000 = c;
        int var2 = c + 1;
        c = var10000;
        System.out.println("c = " + c);
    }
}

// res == 10
```

## 2.3 赋值运算符

### 2.3.1 基本赋值运算符

`=` -> 先处理等号右边的运算/表达式等内容，再将右边的最终结果赋值给左边的变量。

### 2.3.2 复合赋值运算符

`+=` \ `-=` \ `*=` \ `/=` \ `%=`，分别是加等、减等、乘等、除等（取整数部分）、模等（取余数部分）。

这些复合赋值运算符的意思基本相同，`+=` 就是先将一个变量做完加法运算后再重新赋值给自身。

```java
public static void main(String[] args) {
    int num = 10;
    num+=1;
    System.out.println("num = " + num);
}

// num = 11
```

`num+=1` 可以看作是 `num = num + 1`，但要看情况，下面这种情况涉及到 `byte`、`short` 类型强转，就不能完全这么类比：

```java
public class Demo06 {
    public static void main(String[] args) {
        byte b = 10;
        // b = b + 1; // 这里会报错，是因为 byte 在运算的时候，会被 jvm 自动转成 int，所以这里需要我们将 b + 1 的结果进行强转。
        b = (byte)(b + 1); // 此时就没有报错了
        System.out.println("b = " + b);
        
        short s = 5;
        s+=1; // s+=1 没有问题，就是因为上面的过程在 jvm 里面自动处理了
        System.out.println("s = " + s);
    }
}

/*
* b = 11
  s = 6
* */
```

所以，`num = num + 1` 可以简单理解成 `num+=1`，但遇到类似 `byte`、`short` 这种强转场景的时候，就不能这么类比了，因为中间涉及到强转的过程，只是 `jvm` 自动帮我们处理了。

## 2.4 比较运算符

比较运算符的结果必然是 `Boolean` 类型，主要用于条件判断使用。

| 符号   | 说明                                        |
| ---- | ----------------------------------------- |
| `==` | 如果符号前后数据相等，则为 `true`，否则为 `false`          |
| `>`  | 如果符号前的数据大于符号后的数据，则为 `true`，否则为 `false`    |
| `<`  | 如果符号前的数据小于符号后的数据，则为 `true`，否则为 `false`    |
| `>=` | 如果符号前的数据大于或等于符号后的数据，则为 `true`，否则为 `false` |
| `<=` | 如果符号前的数据小于或等于符号后的数据，则为 `true`，否则为 `false` |
| `!=` | 如果符号前后数据不相等，则为 `true`，否则为 `false`         |

```java
public class Demo07 {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        System.out.println("num1 == num2 " + (num1 == num2));
        System.out.println("num1 > num2 " + (num1 > num2));
        System.out.println("num1 >= num2 " + (num1 >= num2));
        System.out.println("num1 < num2 " + (num1 < num2));
        System.out.println("num1 <= num2 " + (num1 <= num2));
        System.out.println("num1 != num2 " + (num1 != num2));
    }
}

/*
    num1 == num2 false
    num1 > num2 false
    num1 >= num2 false
    num1 < num2 true
    num1 <= num2 true
    num1 != num2 true
* */
```

## 2.5 逻辑运算符

逻辑运算符的结果也是 `Boolean` 类型，主要用于连接多个条件判断。

| 符号     | 说明                                                                                                                                                                             |
| ------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| `&&`   | 结果有假则假，符号前后条件结果有一个结果为 `false`，整体就为 `false`                                                                                                                                     |
| `||` | 结果有真则真，符号前后条件结果有一个结果为 `true`，整体就为 `true`                                                                                                                                       |
| `!`    | 结果为符号前条件结果的反值，如果是 `true`，则为 `false`；如果是 `false`，则为 `true`                                                                                                                      |
| `^`    | 符号前后条件结果一样，为 `false`，不一样为 `true`<br /> `true` \^ `true` -\> `false`<br /> `true` \^ `false` -\> `true`<br /> `false` \^ `true` -\> `true`<br /> `false` \^ `false` -\> `false` |

```java
public class Demo08 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int n3 = 10;

        boolean res1 = (n1>n2) && (n1==n3);
        boolean res2 = (n1>n2) || (n1==n3);
        boolean res3 = !(n1<n2);
        boolean res4 = (n1>n2) ^ (n1!=n3);

        System.out.println("&& -> " + res1); // false
        System.out.println("||-> " + res2); // true
        System.out.println("! -> " + res3); // false
        System.out.println("^ -> " + res4); // false
    }
}
```

### 关于 `&` 和 `&&`、`|` 和 `||` 的区别

| 符号     | 说明                                                                                                    |
| ------ | ----------------------------------------------------------------------------------------------------- |
| `&`    | 单与<br />1、，如果前后都是 `boolean`，有假则假。**注意：** 符号前为 `false`，符号后的判断还是会继续执行；<br /> 2、如果符号前后都是数字，则会看作是 `位运算符`。 |
| `&&`   | 双与<br /> 有假则假，有短路效果，即符号前为 `false`，符号后的判断不会执行。                                                         |
| `|`   | 单或<br />1、，如果前后都是 `boolean`，有真则真。**注意：** 符号前为 `true`，符号后的判断还是会继续执行；<br /> 2、如果符号前后都是数字，则会看作是 `位运算符`   |
| `||` | 双或<br /> 有真则真，有短路效果，即符号前为 `true`，符号后的判断不会执行。                                                          |

```java
public class Demo09 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        boolean res1 = (n1 > n2) & (++n1>n2);
        System.out.println("单与-&-判断 == " + res1 + " n1 == " + n1); // false，后面 ++n1 继续执行，n1 为 11

        boolean res2 = (n1 > n2) && (++n2>n1);
        System.out.println("双与-&&-判断 == " + res2 + " n2 == " + n2); // false，后面 ++n2 不会执行，n2 还是为 20

        boolean res3 = (n1 < n2) | (++n1>n2);
        System.out.println("单或-|-判断 == " + res3 + " n1 == " + n1); // true，后面 ++n1 继续执行，n1 为 12

        boolean res4 = (n1 < n2) || (++n2>n1);
        System.out.println("双或-||-判断 == " + res4 + " n2 == " + n2); // true，后面 ++n2 不会执行，n2 还是为 20
    }
}
```

## 2.6 三元运算符

*   格式：表达式 ? 表达式1 : 表达式2
*   执行流程，判断表达式，如果表达式为 `true`，就走 `?` 后面的表达式1，否则就走 `:` 后面的表达式2。

```java
public class Demo10 {
    public static void main(String[] args) {
        int grade = 59;
        String res = grade > 60 ? "及格": "不及格";
        System.out.println("res = " + res); // res = 不及格
    }
}
```
