public class SanyuanTest {
    public static void main(String[] args) {
        int m = 12;
        int n = 5;

        int max = (m > n)? m : n;
        System.out.println(max);

        String maxStr = (m > n)? "m大" : ((m == n)? "m = n" : "n大");
        System.out.println(maxStr);
    }
}
