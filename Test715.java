import java.util.Scanner;
public class Test715{
	public static void main( String[] args){
		//show("5678");	//调用有参数的方法
		//zhuan();//数据类型转换
		//input();//怎么输入
		//Te.main(args);//不要忘记参数,
		//addTest();//char类型相加，测试加号作用
		//ZhuanYi.zhuan();//转义字符
		//DataType.suan();//数据类型的默认值
		//Jiajia.jiajia();//自增自减
		//D.d();//与或非
		E.e();
		
	}
	//方法的调用
	public static void show( String str ){
		System.out.println("str 接收到的信息为： " + str);	
	}
	//类型的转换
	public static void zhuan(){
		long tt = 21474836489999L;
		float f1 = tt;
		System.out.println("f1 = " + f1);
		short s1 = 32767;
		System.out.println("float管理的最大数据是："+ Float.MAX_VALUE);	
		System.out.println("float管理的最小数据是："+ Float.MIN_VALUE);	
	}
	//如何实现键盘输入
	/*
		三步：
		1）导入：import java.util.Scanner;
		2) 创建：Scanner sc = new Scanner(System.in);
		3) 录入：int i = sc.nextInt();
		         String s = sc.next();
	*/
	public static void input(){
		System.out.println("输入信息：");
		Scanner sc = new Scanner(System.in);//谨记括号内的内容System.in
		String str = sc.next();
		System.out.println("输入的数据为：" + str);
	}
	//+号 的作用
	public static void addTest(){
		int a = 10,b = 20;
		char xing = '石';
		char ming = '晓';
		char ming2 = '娟';
		//System.out.println("名字为(中间没有空格隔开):"+ xing + ming +ming2);
		System.out.println( xing + ming +ming2);
		System.out.println("有空格隔开:" + xing +"" + ming + "" + ming2 );
	}
}
//调用别的类的主方法
class Te{
	public static void main( String[] args){
		System.out.println("我在Te类中");	
	}
}
//转义字符的作用
/*
	\n  换行
	\r  回车   光标回到初始状态
	\b  退格   不会删除数据  如果后面有数据，则会覆盖掉前面格的数据
	\t  制表符  一个制表符占8个空格，并不是空八个格
	\\  \
	\"  "
	\'  '
*/
class ZhuanYi{
	public static void zhuan(){
		System.out.println("abcd\n1234" );
		System.out.println("abcd\r12" );
		System.out.println("abcd\b1234\b" );//字符d被1覆盖，数字4不会消失
		System.out.println("abcdefgh\t1234\t5\t678" );
		
			
	}	
}
//各种数据类型的默认值
class DataType{
static byte by;
	static short sh;
	static int in;
	static long lo;
	static char ch;
	static float fl;
	static double dou;
	static boolean b;
	public static void suan(){
	    System.out.println("byte:"+by);
	    System.out.println("short:"+sh);
	    System.out.println("int:"+in);
	    System.out.println("long:"+lo);
	    System.out.println("float:"+fl);
	    System.out.println("double:"+dou);
	    System.out.println("char:"+ch);
	    System.out.println("boolean:"+b);
	}
}
//自增自减
class Jiajia{

	public static void jiajia(){
		
	    show1();
	    show2();
	    show3();
	}
	//趣味思考1: 已知 a = 2; 执行 a = a++; 之后，问a是多少，并告诉我执行的过程。
	public static void show1(){
		int a = 2;
		a = a++;
		System.out.println("结果为:"+a);
	}
	//趣味思考2: 已知 a = 2; 执行 int b = a++ + a++ + a++; 之后，问a和b是多少，并告诉我执行的过程。
	public static void show2(){
		int a = 2;
		int b = a++ + a++ + a++;
		System.out.println("a:" + a +" " + "b:" + b);
	}
	//课堂练习: 根据当前案例完成 自减运算符的应用。
	public static void show3(){
		int a = 2;
		System.out.println("自减结果为：" + a);
	}
}
//短路与  短路或  非
/*
	&&:短路与  左右同为true，结果为true  否则为false，当左面为false，右面不计算，节省时间，提高效率
	||:短路或  左右有一边为true，结果为true  都为false时，结果为false   当左面为true时,结果为true
	!:非    
*/
class D{
	public static void d(){
		int a = 5;
		int b = a++;
		boolean flag = 5 >= 3;
		System.out.println("flag = " + flag );
		flag = "ABC" instanceof String ;//instanceof 属于
		System.out.println("flag = " + flag );		
		a = 5; 
		b = 6;
		//flag =  a++ >= 3+2 && ++a > b++;
		
		flag =  a++ > 3+2 && ++a > b++;
		System.out.println("a = " + a + "\tb = " + b + "\tflag = " + flag );	
	}
}
//fianl 最终   不可修改
class E{
	public static void e(){
		final double PI = 3.14;
		double c = 3;//半径
		System.out.println("半径为:" + c +"的圆的面积为:" + c * PI * PI);
	}
}