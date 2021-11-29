import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class ReaderAndWriterDemo {
    public static void main(String[] args) {
        try {
            // 文件字符输入流
            Reader reader = new FileReader("name.txt");
            // 读取一个字符
            // int ch = reader.read();
            // System.out.println((char)ch);
            // char[] chs = new char[3];
            // int len = reader.read(chs); // 读取多个字符
            // System.out.println("读取到的字符个数 " + len);
            // System.out.println("读取的内容 " + new String(chs, 0, len));

            // 带缓冲的字符输入流
            BufferedReader br = new BufferedReader(reader);
            // char[] chs1 = new char[3];
            // int len1 = reader.read(chs1);
            // System.out.println("带缓冲的流读取的内容" + new String(chs1, 0, len1));

            // 读取一行内容
            // String line = br.readLine();
            // System.out.println(line);
            // String line1 = br.readLine(); // 返回null时表示读到文件末尾
            // System.out.println(line1);

            ArrayList<String> names = new ArrayList<String>();
            // 循环读取文件的内容
            String content = null;
            while ((content = br.readLine()) != null) {
                names.add(content);
            }
            for (int i = 0; i < names.size(); i++) {
                if (names.get(i).equals("袁敬卓")) {
                    names.set(i, "***欧尼酱***");
                }
            }

            // System.out.println(names);

            // 关闭流
            reader.close();
            br.close();

            // 文件字符输出流
            FileWriter fw = new FileWriter("text.txt");
            fw.write("这是通过文件字符流写入的内容\r\n");

            // 带缓冲的字符输出流
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("这是通过带缓冲的字符流写入的内容\r\n");

            for (String str : names) {
                bw.write(str + "\r\n");
            }

            bw.flush();
            bw.close();
            fw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
