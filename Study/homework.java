// import java.util.Scanner;

public class homework {

    public static int generateFibonacci(int n) {
        if (n == 1) {
            return 1;
        } else if (n > 1) {
            return generateFibonacci(n - 1) + generateFibonacci(n - 2);
        } else {
            return 0;
        }
    }

    public static int[] generateFibonacciArray(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = generateFibonacci(i + 1);
        }
        return arr;
    }

    public static int binarySearch(int[] nums, int n) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == n) {
                return mid + 1;
            } else if (nums[mid] < n) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {


        /*
        int[] arr = {7, 12, 34, 38, 40, 66, 72, 84, 99};
        System.out.println(binarySearch(arr, 0));
        */

        /*
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        arr = generateFibonacciArray(n);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        */

        /*
        Scanner input = new Scanner(System.in);
        int[] num = new int[10];
        int even = 0, odd = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = input.nextInt();
            if (num[i] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("偶数的个数为：" + even);
        System.out.println("奇数的个数为：" + odd);
        */
    }
}
