import java.time.Year;

public class StringTest
{
    public static void main(String[] args)
    {
        String s1 = "嘿嘿嘿😁";
        System.out.println(s1);

        //String练习1
        char c = 'a';
        int num = 10;
        String str = "Hello";
        System.out.println(c + num + str);//a=97 A65 107Hello
        System.out.println(c + str + num);//aHello10
        System.out.println(c + (num + str));//a10Hello
        System.out.println((c + num) + str);//107Hello
        System.out.println( str + num + c );//Hello10a
        //数字和字符串在一起是连接，和字符在一起是运算

        //String练习2
        char c2 = '*';
        String str2 = " ";
        char c3 = '*';
        System.out.println(c2 + str2 +c3);
        System.out.println('*' + "\t" + '*');

        //String练习3
        String str3 = 3.5f + "";
        System.out.println(str3);

    }
}
