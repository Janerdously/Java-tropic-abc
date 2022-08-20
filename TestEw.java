public class TestEw {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 42;
            if ((z++ == 42) && (y = true)) {
                z++;//z == 44
            }
            if (x = false || (++z == 45)) {
                z++;
            }
            System.out.println("z=" + z);
    }
}
