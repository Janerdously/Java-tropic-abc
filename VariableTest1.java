public class VariableTest1
{
    public static void main(String[] args)
    {
        int number1 = 25;
        int pay = 20000;
        double account = 0.25;
        long number2 = 596874346666L;
        float number3 = 123.3f;
        double number4 = 164.5;
        char c1 = 'a';
        char c2 = '中';
        char c3 = '\n';
        char c4 = '\u0123';
        boolean isStudent = true;
        if(isStudent)
        {
            System.out.println("恭喜您，您可以享受\"学生优惠\"，折扣是25%，您仅需支付"+pay*(1-account)+"元！");
        }else{
            System.out.println("你不能享受学生优惠折扣，请原价购买。点击下方链接支付20000美元。");
        }
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(c1);
        System.out.println(c2);
        System.out.print(c3);
        System.out.println(c4);
    }
}
