import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;

public class FileDemo {
    public static void main(String[] args) {
        // Java 中使用 File 表示文件
        // 文件的常见操作：创建文件夹、创建文件、查看文件属性、删除文件

        File file = new File("D:/a/b");
        if (!file.exists()) {
            // boolean succ = file.mkdir();   // 创建目录
            boolean succ = file.mkdirs();   // 创建多级目录
            if (succ) {
                System.out.println("创建成功！");
            }
        }

        File file1 = new File("D:/test/a.txt");
        try {
            if (!file1.exists()) {
                boolean isSucc = file1.createNewFile();
                if (isSucc) {
                    System.out.println("创建成功！");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isFile());         // 判断是否是一个文件
        System.out.println(file1.isDirectory());    // 判断是否是一个路径
        System.out.println(new Date(file1.lastModified()));   // 获取文件的最后修改时间

        // 删除文件
        // System.out.println(file1.delete());
        // 删除文件夹
        File dir = new File("D:/test");
        // System.out.println(dir.delete());

        File dir1 = new File("D:/a");   // 非空文件夹
        // System.out.println(dir1.delete());

        // 查看文件夹的内容列表
        String[] con = dir1.list();
        System.out.println(Arrays.toString(con));

        // 设计到文件内容读写操作使用流
    }
}
