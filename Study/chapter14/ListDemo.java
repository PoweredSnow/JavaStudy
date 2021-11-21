import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        /**
         * List 存储数据的特点：
         * 关心数据的索引（同数组下标一致）
         * 提供了跟索引相关的一系列方法：在某个下标处插入、删除、修改、获取数据
         * 可以存储重复数据，跟 Set 不同
         */

         // ArrayList
         ArrayList<String> citys = new ArrayList<String>();
         // 添加数据
         citys.add("Beijing");
         citys.add("Nanjing");
         citys.add("Shanghai");

         // 插入数据
         citys.add(1, "Shijiazhuang");

         // 修改数据
         citys.set(3, "Tianjin");

         // 删除数据
        //  citys.remove(3); // 删除某个索引处数据元素
        //  citys.remove("Shijiazhuang"); // 删除某个数据元素

        // 根据索引获取元素
        String c = citys.get(3);
        System.out.println(c);

        System.out.println(citys);

        for (int i = 0; i < citys.size(); i++) {
            System.out.println(citys.get(i));
        }

        for (String name : citys) {
            System.out.println(name);
        }



        List<Integer> nums = new ArrayList<Integer>();
        nums.add(10);

        // 存储多本图书
        Book book1 = new Book("Java编程思想", 100.0f);
        Book book2 = new Book("数据结构", 100.0f);
        Book book3 = new Book("Web编程", 100.0f);
        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if (book.getBookName().equals("Java编程思想")) {
                System.out.println("存在");
            }
        }

        for (Book book : books) {
            if (book.getBookName().equals("Java编程思想")) {
                System.out.println(true);
            }
        }

        // LinkedList 数据增删改查方法同 ArrayList 一样
        List<String> cityNames = new LinkedList<String>();
        cityNames.add("Beijing");
        cityNames.add("Nanjing");
        cityNames.add("Tianjin");
        System.out.println(cityNames);
    }
}
