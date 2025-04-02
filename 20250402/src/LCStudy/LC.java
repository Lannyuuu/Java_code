package LCStudy;

public class LC {
    public String longestCommonPrefix(String[] strs) {
        /*20250402-task1
        查找字符串数组中最长公共前缀
        如果不存在公共前缀，返回空字符串
        * */
        if (strs == null || strs.length == 0){
            return "";
        }
        //以第一个字符串为基准
        String prefix = strs[0];
        //遍历字符串数组
        for(int i = 1;i<strs.length;i++){
            //如果下一个字符串不以这个字符串开头，就把基准字符串缩短一个字母
            while(strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
        //遍历字符串
        //如果字符串字符相同，
    }
    public int lengthOfLastWord(String s) {
        //20250402-task2
        int length = 0;
        int i = s.length() -1;
        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            length++;
            i--;
        }
        return length;
    }
    public int[] plusOne(int[] digits) {
        //20250402 task3
        int n = digits.length;

        // 从最后一位开始加1
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) { //只需要判断最后一位就可以了
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // 进位处理
        }

        // 处理全为9的情况，如[9,9,9]→[1,0,0,0]
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}
