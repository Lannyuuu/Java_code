import java.util.*;
import java.lang.*;
//对字符串操作使用：Vector 往往都需要用到StringBuilder
public class StringTask {


    public static String processString(String input){
        /*//把每个单词首字母变成大写
         //把数字与字母之间用下划线分开
        //把单词中构建有多个空格的部分调整为一个空格
        * */
        //首先将多个空格缩减为一个空格
        String processed = removeExtraSpaces(input);
        //分割单词split() -> 字符串数组
        String[] words = processed.split(" "); //最后再append(改之后的单词).append(" ")
        //首字母大写
        StringBuilder result = new StringBuilder(); //修改之后把满足的append进入result
        for (String word : words){
            if (word.isEmpty()) continue;
            //处理首字母大写
            String processedWord = capitalizeFirstLetter(word);
            //处理数字和字母之间的下划线
            processedWord = separateDigitAndLetters(processedWord);
            result.append(processedWord).append(" ");
        }
        return result.toString().trim();
    }
    public static String capitalizeFirstLetter(String input){
        //一定要记得先判断空的时候：
        if (input.isEmpty()) return input;
        StringBuilder upperResult = new StringBuilder();
        char[] inputchar = input.toCharArray();
        Character.toUpperCase(inputchar[0]);
        //错误：return inputchar.toString();
        //不能直接把char[]类型直接toString(),会返回对象哈希码，而不是数组的内容
        //字符数组变成字符串的方法：
        String res = new String(inputchar);
        return res;
    }
    public static String separateDigitAndLetters(String word){
        //先判断不符合该函数操作的条件
        if (word.length() < 2) return word;
        StringBuilder sb = new StringBuilder();
        sb.append(word.charAt(0));
        for (int i = 1; i<word.length();i++){
            char prev = word.charAt(i-1);
            char cur = word.charAt(i);
            if (Character.isDigit(prev) && Character.isLetter(cur)||
                Character.isLetter(prev)&& Character.isDigit(cur)){
                sb.append("_");
            }
            sb.append(cur);
        }
        return sb.toString();
    }
    public static String removeExtraSpaces(String input){
        StringBuilder sb = new StringBuilder();
        boolean lastWasSpace = false;
        for (int i = 0;i < input.length();i++){
            char c = input.charAt(i);
            if (input.charAt(i) == ' '){
                //如果递归到的字符串是空格的话
                //上一个加入到字符串的字符是不是空格
                //要是不是空格的话：就append到字符串里，然后把lastWasSpace设置为空格
                if (!lastWasSpace){
                    sb.append(c);
                    lastWasSpace = true;
                }
            }else { //要是递归到的不是空格
                sb.append(c);
                lastWasSpace = false;
            }
        }
        return sb.toString().trim();
    }
    public static void main(String[] args) {
        //最开始先在main函数写出大框架
        //直接调用函数，表示出题目最基本的逻辑：
        //一个processString函数实现题目的要求
        //再在函数内部细分功能
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); //输入一行字符串
        String output = processString(input);
        System.out.println(output);
    }
}
