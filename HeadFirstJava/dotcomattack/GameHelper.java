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
            System.out.println(" try " + location);
            int x = 0;                                  // 第n个位置
            success = true;                             // 假定成功
            while (success && x < comSize) {            // 查找未使用的点
                if (grid[location] == 0) {              // 如果没有使用
                    coords[x++] = location;             // 存储位置
                    location += incr;                   // 尝试下一个点
                    if (location >= gridSize) {         // 超出下边缘
                        success = false;                // 失败
                    }
                    if (x > 0 && (location % gridLength == 0)) { // 超出右边缘
                        success = false;                // 失败
                    }
                } else {                                // 找到已经使用的位置
                    System.out.println(" used " + location);
                    success = false;                    // 失败
                }
            }
        }

        int x = 0;
        int row = 0;
        int column = 0;
        System.out.println("\n");
        while (x < comSize) {
            grid[coords[x]] = 1;                        // 标识格子已用
            row = (int) (coords[x] / gridLength);       // 得到行的值
            column = coords[x] % gridLength;            // 得到列的值
            temp = String.valueOf(alphabet.charAt(column)); // 转换成字符串

            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
            System.out.println(" coord " + x + " = " + alphaCells.get(x - 1));
        }

        System.out.println("\n");

        return alphaCells;
    }
}
