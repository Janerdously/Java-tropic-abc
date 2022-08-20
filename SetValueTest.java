public class SetValueTest
{
    public static void main(String[] args)
    {
        //赋值符号
        int i1 = 10;
        int j1 = 10;

        //连续赋值
        int i2,j2;
        i2 = j2 = 10;

        int i3 = 10,j3 = 20;

        int num1 = 10,num2 = 10,num3 = 10,num4 = 10,num5 = 10;
        num1 += 2; //num1 = num1 + 2 ;
        num2 -= 2; //num2 = num2 - 2;
        num3 *= 2; //num3 = num3 * 2;
        num4 /= 2; //num4 = num4 / 2;
        num5 %= 2; //num5 = num5 % 2;
        System.out.println(num1+"\n"+num2+"\n"+num3+"\n"+num4+"\n"+num5);

        short s1 = 10;
        //s1 = s1 + 2;编译不通过，数据类型有问题
        //s1 += 2;//不会改变变量本身的数据类型
        System.out.println(s1);

        //在开发中，希望实现变量+2，有几种方式？
        int num = 10;
        //num = num + 2;
        //num += 2;//推荐此种方式
        //num = ++(++num);编译不通过
        //num = ++num;
        //num = ++num;
        ++num;
        System.out.println(num);

        //练习
        int m = 2, n = 3;
        n *= m++;//n = n * m++
        System.out.println("m=" + m + ", n=" + n);//m=3,n=6

        int o = 10;
        o += (o++) + (++o);
        System.out.println(o);//32
    }
}
