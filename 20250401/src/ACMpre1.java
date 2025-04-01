import java.util.*;
import java.util.Scanner;

public class ACMpre1 {
    // 最大公约数
    int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
    // 最小公倍数
    int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
    public static void main(String[] args) {
        //I/O相关知识点
        Scanner scanner = new Scanner(System.in);

        // 读取不同类型的数据
        String str = scanner.next(); // 读取字符串(空格分隔)
        String line = scanner.nextLine(); // 读取整行
        int num = scanner.nextInt(); // 读取整数
        double d = scanner.nextDouble(); // 读取双精度浮点数
        boolean b = scanner.nextBoolean(); // 读取布尔值

        scanner.close(); // 使用完毕后关闭

        //数组和列表
        int[] arr = new int[1000];  // 固定大小数组
        ArrayList<Integer> list = new ArrayList<>();  // 动态数组

        //字符串处理
        String s = "hello";
        char[] chars = s.toCharArray();  // 转为字符数组
        String sub = s.substring(1, 3);  // 子串

        //集合类
        Set<Integer> set = new HashSet<>();  // 去重集合
        Map<String, Integer> map = new HashMap<>();  // 键值对
        Queue<Integer> queue = new LinkedList<>();  // 队列
        Stack<Integer> stack = new Stack<>();  // 栈
        PriorityQueue<Integer> pq = new PriorityQueue<>();  // 最小堆

        //排序
        int[] arr2 = {5, 2, 9, 1};
        Arrays.sort(arr);  // 数组排序

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(5, 2, 9, 1));
        Collections.sort(list);  // 列表排序

        //二分查找
        int target = 8;
        int index = Arrays.binarySearch(arr, target);  // 数组二分查找
        int index2 = Collections.binarySearch(list, target);  // 列表二分查找

        //求最大值最小值
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        //统计字符出现次数
        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
    }
}
