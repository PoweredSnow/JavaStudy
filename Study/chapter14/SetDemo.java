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

        //删除数据
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


        Set<String> citys2 = new TreeSet<String>();
        // 添加数据
        citys2.add("Beijing");
        citys2.add("Tianjin");
        citys2.add("Nanjing");
        citys2.add("Shijiazhuang");
        System.out.println(citys2);
    }
}
