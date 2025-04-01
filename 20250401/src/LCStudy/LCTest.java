package LCStudy;

public class LCTest {
    public static void main(String[] args) {
        LC test = new LC();
        String s1 = "XIII";
        int res = test.romanToInt(s1);
        System.out.println(res);
        int mynums[] = {1,1,2,6,6,5,7,7,3};
        System.out.println(test.removeDuplicates(mynums));
    }
}
