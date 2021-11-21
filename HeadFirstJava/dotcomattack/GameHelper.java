import java.io.*;
import java.util.*;

public class GameHelper {

    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int [] grid = new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.print(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
        return inputLine.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int comSize) {
        ArrayList<String> alphaCells = new ArrayList<String>();
        String [] alphacoords = new String [comSize];   // 保存字符串
        String temp = null;                             // 临时字符串
        int [] coords = new int[comSize];               // 现有字符串
        int attempts = 0;                               // 目前测试的字符串
        boolean success = false;                        // 找到合适位置吗？
        int location = 0;                               // 目前起点

        comCount++;                                     // 现在处理到第n个
        int incr = 1;                                   // 水平增量
        if ((comCount % 2) == 1) {
            incr = gridLength;                          // 垂直增量
        }

        while (!success & attempts++ < 200) {           // 主要搜索循环
            location = (int) (Math.random() * gridSize);// 随机起点

        }
    }
}
