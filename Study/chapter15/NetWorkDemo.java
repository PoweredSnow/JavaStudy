import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class NetWorkDemo {
    public static void main(String[] args) {
        // 下载网络图片
        String url = "https://www.pixiv.net/artworks/93765623";
        String url1 = "https://twitter.com/harumaki_gohan/status/1464901243566837763/photo/1";
        // 网络操作API
        try {
            URL imgUrl = new URL(url);
            InputStream is = imgUrl.openStream(); // 读取网络图
            FileOutputStream fos = new FileOutputStream("test.jpg");
            byte[] buf = new byte[1024];
            int length = 0; // 存储读取的实际的字节的个数
            while ((length = is.read(buf)) != -1) {
                fos.write(buf, 0, length);
            }
            fos.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
