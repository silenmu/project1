/*
运算符之三：比较运算符

结论：
1.比较运算符的结论都是boolean型
2.区分==和=

 */
public class CompareTest {
    public static void main(String []args){
        int i = 10;
        int j = 20;

        System.out.println(i == j);
        System.out.println(i = j);//先赋值后输出

        boolean b1 = true;
        boolean b2 = false;
        System.out.println(b2 ==b1);
        System.out.println(b2 = b1);
    }
}
