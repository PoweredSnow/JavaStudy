import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        /**
         * 存储 key-value (键值对)
         */

        // HashMap 不关心数据的顺序
        Map<String, Object> map = new HashMap<String, Object>();
        // 添加数据
        map.put("name", "zhangsan");
        map.put("gender", "men");
        map.put("age", "15");
        // key 值不允许重复，如果多次添加同一个 key 值，会覆盖掉原来的 value 值
        map.put("age", "18");
        map.put("nickName", "zhangsan");

        // 删除某个 key-value
        map.remove("nickName");

        // 根据 key，查询 value
        String gender = (String) map.get("gender");
        System.out.println(gender);

        System.out.println(map);

        // 获取所有的 key 值
        Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }

        // 获取所有的 value
        Collection<Object> values = map.values();
        System.out.println(values);

        // TreeMap 存储的数据的顺序是 key 值的自然升序
        Map<String, Object> treeMap = new TreeMap<String, Object>();
        // 添加数据
        treeMap.put("name", "zhangsan");
        treeMap.put("gender", "men");
        treeMap.put("age", "15");
        System.out.println(treeMap);

        // LinkedHashMap 存储数据的顺序是添加的顺序
        Map<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        // 添加数据
        linkedHashMap.put("name", "zhangsan");
        linkedHashMap.put("gender", "men");
        linkedHashMap.put("age", "15");
        System.out.println(linkedHashMap);
    }
}
