package LCStudy;

import java.util.HashMap;
import java.util.Map;

public class LC {
    /*20250401-task1
    * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
    字符          数值
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    */
    public int romanToInt(String s){
        Map<Character,Integer> mymap = new HashMap<>();
        mymap.put('I',1);
        mymap.put('V',5);
        mymap.put('X',10);
        mymap.put('L',50);
        mymap.put('C',100);
        mymap.put('D',500);
        mymap.put('M',1000);

        int result = 0;
        int prevalue = 0; //要是定义了前一个值，记得操作最后更新prevalue

        //从右向左遍历
        for (int i = s.length()-1;i>=0;i--){
            char curchar = s.charAt(i);
            int curvalue = mymap.get(curchar);

            if (prevalue > curvalue){
                result -= curvalue;
            }else{
                result += curvalue;
            }
            prevalue = curvalue;
        }
        return result;
    }
    public int removeDuplicates(int[] nums) {
        /*题目： 20250401-task2
        * 非严格递增排列的数组，原地删除重复出现的元素，返回删除后数组的新长度
        * 元素的相对顺序保持一致，返回nums中唯一元素的个数*/

        //思路：
        //0.当数组长度为0的时候返回0
        //1.slow, fast指针
        //2.slow指向当前唯一元素的位置
        //3.fast指针指向整个数组
        //4.如果fast和slow位置的元素不同：slow++slow指向下一个位置
        //5.nums[slow] = nums[fast]
        //最后返回slow+1(slow是下标，最后要返回数组的长度：下标+1)
        if (nums.length == 0) return 0;
        int slow = 0;

        for (int fast = 0;fast < nums.length;fast++){
            if (nums[fast] != nums[slow]){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow+1;
    }
    public int removeElement(int[] nums, int val) {
        /*20250401-task3
        数组nums，值val，原地移除所有数值等于val的元素，元素的顺序可能发生改变
        * 返回nums中与val不同的元素的数量*/
        if (nums.length == 0) return 0;
        int slow = 0;
        for (int fast = 0;fast< nums.length;fast++){
            if (nums[fast] != val){
                slow++;
                nums[slow] = nums[fast];
            }
        }
        return slow;
    }
    public int strStr(String haystack, String needle) {
        /* 20250401-task4
        * indexOf(String str)/lastIndexOf()：查找子串位置（未找到返回-1）。
         */
        int lenh = haystack.length();
        int lenn = needle.length();

        if (lenn == 0) return 0;
        if (lenh == 0 || lenn > lenh) return -1;

        for (int i = 0; i <= lenh - lenn; i++){
            if(haystack.substring(i,i+lenn).equals(needle)) return i;
        }
        return -1;
    }
    public int searchInsert(int[] nums, int target) {
        //二分查找 20250401-task5
        int low = 0;
        int high = nums.length-1;

        while(low <= high){
            int mid = low + (high-low)/2;
            if(nums[mid] == target){
                return mid;
            }else if (nums[mid] < target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return low;
    }
}
