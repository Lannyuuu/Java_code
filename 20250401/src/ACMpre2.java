import java.util.Random;
public class ACMpre2 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(1,5);
        System.out.println("随机生成整数为："+ randomInt);
        float randomFloat = random.nextFloat(1,10);
        System.out.println("随机float值："+ randomFloat);
        boolean randomBoolean = random.nextBoolean();
        System.out.println(randomBoolean);
    }
}
