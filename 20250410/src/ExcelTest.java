import java.util.*;
public class ExcelTest {
    //Excel:列表从1开始，不是0,26个字母
    // 1->A
    // 26->Z
    // 27->AA
    // 28->AB
    public static void main(String[] args) {
        //RC格式 -> 常规格式
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i<n;i++){
            String rcAddress = scanner.nextLine();
            String regularAddress = convertRCToRegular(rcAddress);
            System.out.println(regularAddress);
        }
    }
    public static String convertRCToRegular(String input){
        //正则表达式
        String[] parts = input.split("[RC]"); //{"",12,4}
        int row = Integer.parseInt(parts[1]); //12
        int col = Integer.parseInt(parts[2]); //4
        StringBuilder collecters = new StringBuilder();
        //只有列需要改变
        while(col > 0){
            col --; //A对应1，但是计算需要从0开始
            //‘A’ + 数字 ： 目标字符的Unicode码，再(char)，得到目标字符
            char c = (char) ('A' + (col % 26));
            collecters.insert(0,c);
            col /= 26;
        }
        return collecters.toString();
    }

}
