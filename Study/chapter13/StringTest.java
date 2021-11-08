import javax.swing.plaf.synth.SynthSplitPaneUI;

public class StringTest {
    public static void main(String[] args) {
        String str1 = ""; // 空字符串不等于 null
        // String str1 = null;
        System.out.println(str1.length()); // 获取字符串的长度

        // String 字符串常量类型：字符串的值不可以修改
        // 但可以修改 String 引用类型指向的对象
        String str2 = "abc"; // 字符串字面值常量存储在常量区
        String str3 = "abc";

        // 判等
        // System.out.println(str2 == str3); // true
        // System.out.println(str2.equals(str3)); // true

        String str4 = new String("abc");
        String str5 = new String("abc");

        System.out.println(str4 == str5); // false
        System.out.println(str4.equals(str5)); // true

        // 字符串变量类型 StringBuffer
        // 针对同一个字符串做出修改
        StringBuffer strBuf = new StringBuffer("abc");
        strBuf.append("def");
        System.out.println(strBuf);

        strBuf.insert(1, "123");
        System.out.println(strBuf);

        strBuf.delete(1, 4);
        System.out.println(strBuf);

        strBuf.reverse();
        System.out.println(strBuf);

    }
}
