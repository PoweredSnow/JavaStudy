import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        // Set 不能存储重复元素

        // HashSet 存储的数据是无序的（不关心数据的顺序）
        Set<String> citys = new HashSet<String>();
        // 添加数据
        citys.add("Beijing");
        citys.add("Tianjin");
        citys.add("Nanjing");
        citys.add("Shijiazhuang");
        // 不能存储重复
        citys.add("Shijiazhuang");

        // 删除数据
        // citys.remove("Shijiazhuang");

        System.out.println(citys);

        // LinkedHashSet 存储的数据是无序的（不关心数据的顺序）
        Set<String> citys1 = new LinkedHashSet<String>();
        // 添加数据
        citys1.add("Beijing");
        citys1.add("Tianjin");
        citys1.add("Nanjing");
        citys1.add("Shijiazhuang");
        System.out.println(citys1);

        TreeSet<String> citys2 = new TreeSet<String>();
        // 添加数据
        citys2.add("Beijing");
        citys2.add("Tianjin");
        citys2.add("Nanjing");
        citys2.add("Shijiazhuang");

        System.out.println(citys2);
        System.out.println(citys2.first());

        Book book1 = new Book("Java编程思想", 100.0f);
        Book book2 = new Book("数据结构", 100.0f);
        Book book3 = new Book("Web编程", 100.0f);
        Book book4 = new Book("Java编程思想", 100.0f);
        System.out.println(book1.equals(book2));
        System.out.println(book1.equals(book4));

        /**
         * 存储数据时根据 equals 和 hashCode 两个方法的返回值决定是否存储该数据
         * 如果 equals 返回 false，一定存储，hashCode 返回值相同，解决哈希冲突
         * 如果 equals 返回 true，hashCode 相同， 不存储
         * 如果 equals 返回 true，hashCode 不同，存储
         */
        Set<Book> bookSet = new HashSet<Book>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        System.out.println(bookSet);

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
    }
}
