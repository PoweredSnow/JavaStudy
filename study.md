# 计时攻击

## 另类的字符串比较

在 Java 的 Play Framework 里有一段代码用来验证 cookie(session)中的数据是否合法（包含签名的验证）的代码，如下所示：

```java
boolean safeEqual(String a, String b) {
   if (a.length() != b.length()) {
       return false;
   }
   int equal = 0;
   for (int i = 0; i < a.length(); i++) {
       equal |= a.charAt(i) ^ b.charAt(i);
   }
   return equal == 0;
}
```

相信刚看到这段源码的人会感觉挺奇怪的，这个函数的功能是比较两个字符串是否相等，如果要判断两个字符串是否相等，正常人的写法应该是下面这个样子的（来自 JDK8 的 `String.equals()` -有删减）：

```java
public boolean equals(Object anObject) {
    String anotherString = (String)anObject;
    int n = value.length;
    if (n == anotherString.value.length) {
        char v1[] = value;
        char v2[] = anotherString.value;
        int i = 0;
        while (n-- != 0) {
            if (v1[i] != v2[i]) // <- 遇到第一个不一样的字符时退出
                return false;
            i++;
        }
        return true;
    }
    return false;
}
```

我们可以看到，在比较两个字符串是否相等的正常写法是：

先看一下两个字符串长度是否相等，如果不等直接返回 false。
如果长度相等，则依次判断每个字符是否相等，如果不等则返回 false。
如果全部相等，则返回 true。一旦遇到不一样的字符时，直接返回 false。
然而，Play Framework 里的代码却不是这样的，尤其是上述的第 2 点，用到了异或，熟悉位操作的你很容易就能看懂，通过异或操作 1^1=0 , 1^0=1, 0^0=0，来比较每一位，如果每一位都相等的话，两个字符串肯定相等，最后存储累计异或值的变量 equal 必定为 0（因为相同的字符必然为偶数），否则为 1。

但是，这种异或的方式不是遇到第一个不一样的字符就返回 false 了，而是要做全量比较，这种比较完全没有效率，这是为什么呢？原因是为了安全。

……
