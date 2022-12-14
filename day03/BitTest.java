/*
运算符之五：位运算符

结论：
1.位运算符操作的都是整型的变量
2. << :在一定范围内，每向左移一位，相当于*2
3. >> :在一定范围内，每向右移一位，相当于/2

面试题：最高效方式计算2 * 8
结论：2 << 3 或 8 << 1
 */
public class BitTest {
    public static void main(String[] args){
        int i = 21;
        i = -21;

        System.out.println("i << 2 ：" + (i << 2));
        System.out.println("i << 3 ：" + (i << 3));
        System.out.println("i << 26 ：" + (i << 26));
        System.out.println("i << 27 ：" + (i << 27));//物极必反


        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;
        System.out.println("num1 = " + num1 + " ; num2 = " +num2);
        //方式一:定义临时变量,推荐使用
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

        //方法二:好处: 不用定义临时变量;
        //      坏处: ① 相加操作可能超出存储范围;
        //           ② 有局限性: 只能对于数值类型使用.
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
        //方法三: 使用位运算符
        num1 = num1 ^ num2;
        num2 = num1 ^ num2;
        num1 = num1 ^ num2;

        System.out.println("num1 = " + num1 + " ; num2 = " +num2);

    }
}
