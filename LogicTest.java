public class LogicTest {
    public static void main(String[] args) {
        boolean b1 = true;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num1);//11

        boolean b2 = true;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num2);//11

        boolean b3 = false;
        int num3 = 10;
        if (b3 & (num3++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num3);//11

        boolean b4 = false;
        int num4 = 10;
        if (b4 && (num4++ > 0))//&&后面都短路
        {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num4);//10

        boolean b5 = false;
        int num5 = 10;
        if (b5 | (num5++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num5);//11

        boolean b6 = false;
        int num6 = 10;
        if (b6 || (num6++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num6);//11

        boolean b7 = true;
        int num7 = 10;
        if (b7 | (num7++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在北京
        System.out.println(num7);//11

        boolean b8 = true;
        int num8 = 10;
        if (b8 || (num8++ > 0)) {
            System.out.println("我现在在北京");
        } else {
            System.out.println("我现在在南京");
        }//我现在在南京
        System.out.println(num8);//10
    }
}
