package javahomework;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        //Java实现格式化输出System.out.printf()
        double pi = 3.1415926;
        System.out.printf("%.2f",pi);
        System.out.println();
        int hh = 12,mm = 5, ss = 9;
        System.out.printf("%02d:%02d:%02d",hh,mm,ss);

        //数组操作
        int[] arr = new int[10];
        Arrays.sort(arr);
        Arrays.fill(arr,1);
        //字符串操作
        String s = "hello";
        char c = s.charAt(0);
        String sub = s.substring(1,3); //截取1，2
        StringBuilder sb = new StringBuilder();
        sb.append("a").reverse();//实现字符串拼接和反转
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        list.size();
        String str = "123";
        int num = Integer.parseInt(str);
        String numstr = String.valueOf(123);
        char[] mychar = str.toCharArray();
        String retcharArray = new String(mychar);//把字符数组转换成字符串
        //不能使用toString()
        StringBuilder sb1 = new StringBuilder();
        sb1.append("于");
        sb1.append("大");
        sb1.append("臭");
        sb1.append(" ");
        sb1.append("全");
        sb1.append("世");
        sb1.append("界");
        sb1.append("最");
        sb1.append("臭");
        System.out.println();
        System.out.println(sb1);


        //这里学一下
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.contains(1);

        Map<String, Integer> map = new HashMap<>();
        map.put("a",1);
        map.get("a");

        //数组
        int[] arr2 = new int[10];
        Arrays.sort(arr);
        Arrays.fill(arr,-1);

        //二维数组
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextLine();*/

       /* int[][] matrix = new int[n][m];

        for (int i = 0;i<n;i++){
            for (int j = 0; j< m;j++){
                matrix[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }

        for (int i = 0;i<n;i++){
            for (int j = 0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }*/
        ArrayList<Integer> mylist = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.get(0);
        list.size();
        list.remove(0);


        Test tc = new Test();
        int a = 3;
        int b = 4;
        System.out.println(tc.gcd(a,b));
        System.out.println(tc.lcm(a,b));

        long n = 202420242024L;
        n /= 2;
        long a1 = 24;
        long ans = n * 24;
        System.out.println(ans);

    }
    //二分查找
    int binarySearch(int[] nums,int target){
        int left = 0;
        int right = nums.length-1;

        while(left < right){
            int mid = left + (right -left) /2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid -1;
            else left = mid +1;
        }
        return -1;
    }

    //最大公约数
    int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a%b);
    }
    //最小公倍数
    int lcm(int a, int b){
        return a * (b / gcd(a,b));
    }
}
