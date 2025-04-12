package javahomework;
import java.lang.Math;
public class JavaHomeWork {
    public static boolean bitIsSix(int num){
        //个位数是不是6
        return num % 10 == 6; //3423 % 10 = 3;
    }
    public static boolean threeDiviNumber(int num){
        //能被3整除
        return num % 3 == 0;
    }
    public static int countTheNumber(){
        int count = 0;
        for (int i = 10000;i<100000;i++){
            if (bitIsSix(i) && threeDiviNumber(i)) {
                count ++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countTheNumber());
    }
    /*public static void ThreeDigitSumOfDigitsNumbers() {
        int i = 100;
        while(i < 1000) {
            if (isNumberEqualToDigitSum(i)) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static boolean isNumberEqualToDigitSum(int num) {
        int sum = 0;
        int numcopy = num;
        while (num > 0) {
            sum += Math.pow(num % 10 , 3);
            num /= 10;
        }
        return sum == numcopy;
    }

    public static void main(String[] args) {
        ThreeDigitSumOfDigitsNumbers();
    }*/
}