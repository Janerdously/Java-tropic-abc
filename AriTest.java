import java.nio.file.FileSystemLoopException;

public class AriTest
{
    public static void main(String[] args)
    {
        int num1 = 12;
        int num2 = 5;
        int result = num1 / num2;
        System.out.println(result);//2

        int result2 = num1 / num2 * num2;
        System.out.println(result2);//10

        double result3 = num1 / num2;
        System.out.println(result3);//2.0

        double result4 = num1 / (num2 + 0.0);
        System.out.println(result4);//2.4

        double result5 = (double)num1 / num2;
        System.out.println(result5);//2.4

        int a1 = 10;
        int b1 = ++a1;
        System.out.println(b1);//11

        int a2 = 10;
        int b2 = a2++;
        System.out.println(b2);//10

        //练习
        int number = 367;
        int bai = number / 100;
        int shi = number % 100 / 10;
        int ge = number % 100 % 10;//可直接%10，即：int ge = number % 10;
        System.out.println("数字367的情况如下：\n百位数是：" + bai + "\n十位数是：" + shi + "\n个位数是：" + ge);

    }
}
