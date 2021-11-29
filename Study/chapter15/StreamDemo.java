import java.io.InputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamDemo {
    public static void main(String[] args) {
        // 文件字节输入流（以字节为单位读取文件内容）
        try {
            InputStream fis = new FileInputStream("test.txt");
            // 读取 1 个字节
            // int content = fis.read();
            // System.out.println((char)content);

            // 读取多个字节
            byte[] buffer = new byte[100]; // 最多读取 100 个字节
            // int len = fis.read(buffer); // 读取到的内容存储在字节数组中，返回读取字节的个数
            // 将字节数组转成 String
            // String con = new String(buffer, 0, len);
            // System.out.println(con);

            // 带缓冲的字节输入流
            BufferedInputStream bis = new BufferedInputStream(fis);
            System.out.println((char)bis.read());

            // 关闭流
            fis.close();
            bis.close();

            // 文件字节输出流
            // FileOutputStream fos = new FileOutputStream("test.txt"); // 覆盖原来文件的内容
            FileOutputStream fos = new FileOutputStream("test.txt", true);
            // 写入1个字节
            fos.write((int)'e');
            // 写入字节数组（字符串转字节数组）
            fos.write("abcdefg\n".getBytes());

            // 带缓冲的字节输入输出流
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            bos.write("0123456789".getBytes());

            bos.close();
            fos.close();

            // 使用字节流实现文件复制
            FileInputStream jpgIS = new FileInputStream("SD_1.png");
            FileOutputStream jpgOS = new FileOutputStream("SD_2.png");

            byte[] buf = new byte[1024];
            int length = 0; // 存储读取的实际的字节的个数
            while ((length = jpgIS.read(buf)) != -1) {
                // 每次循环将读到的数据保存在 buf 数组中，再写入新
                jpgOS.write(buf, 0, length);
            }

            jpgIS.close();
            jpgOS.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
