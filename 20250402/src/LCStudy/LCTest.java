package LCStudy;

public class LCTest {
    public static void main(String[] args) {
        LC mytest = new LC();
        String s[] = {"flower","flow","flight"};
        String res = mytest.longestCommonPrefix(s);
        System.out.println(res);
        String s2 ="   fly me   to   the moon  ";
        System.out.println(mytest.lengthOfLastWord(s2));
    }
}
