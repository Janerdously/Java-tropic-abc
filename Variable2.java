public class Variable2
{
    public static void main(String[] args)
    {
        double d1 = 12.2;
        int i1 = (int)d1;
        System.out.println(i1);//使用强转符，此时截断操作，损失精度

        int i2 = 128;
        byte b = (byte)i2;
        System.out.println(b);
    }
}
