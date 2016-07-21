public class Test718{
	static char c;
	static String str;
	public static void main ( String[] args){
		zhuanhuan();
		strNull();
		beforjia();
		test();		
		maxOfThree();
	}
	public static void zhuanhuan(){
		//有关于类型范围超出问题
		int a = -2147483648;//int的最小值
		double b = -1L * a;//-1L 取得long的长度  ，乘a ，int 转为long 不会超出范围
		System.out.println("b = " + b);
	}
	public static void strNull(){
		//成员变量默认值问题
		//char 默认值为"" 是一个字符串 为空
		//String 默认值为null  为空  没有字符串
		System.out.println("char 的默认值为：" + c );
		System.out.println("String 的默认值为： " + str);
			
	}
	public static void beforjia(){
		//加加 自增问题
		int a = 2;
		a = a++;
		System.out.println("a = a++ 的结果为: " + a );
		int b = a++ + a++ + a++;
		System.out.println("a = " + a + "\tb = " + b );
			
	}
	public static void test(){
	/**
		1、条件运算(三目运算符)  ? : 
		
			格式:  变量 = (条件) ?  表达式1 : 表达式2;
			
			规则: 先判断条件，当条件为true时，则取表达式1的值作为整个表达式的值。
					若条件为false时，则取表达式2的值作为整个表达式的值。
					
		思考1: 已知三个整数a,b,c和一个max变量；
			要求，用条件运算符 ? : 写一个语句求出三个整数中的最大数并存放于max中。
				最后输出。
				
				业务思想: 先分后合一个思想; 最后，对代码进行优化。
				
		思考2: 已知三个整数a,b,c；
			要求，用来条件运算符 ? : 编写一个方法求出两个整数的最大数；之后，
			想办法求出这三个整数的最大数并输出。
			
			业务思想: 方法拥有返回值值，可作为参数来使用。===>> 方法的嵌套调用。		
	
	*/
	
		int a = -3241;
	 	int b = 10;
	 	
	 	int max = 0;
	 	
	 	max = (a > b) ? a : b ;
	 	
	 	System.out.println( "已知两个整数: " + a + ", " + b + "；其中最大的是: " + max );
	 	
	 	b = a > 0 ? a : -a; //求a的绝对值
	 	System.out.println( a + " 的绝对值是:  " + b );
	 	
	 	byte b1 = 127;
	 	short x = (short)-b1;  // 表达式的数据类型如何确定?
	 	//会报错，可能损失精度,(short)强制转换
	 	//-1 为int > short
	 	
		System.out.println("byte 转为 short : " + x);
	}
	public static void maxOfThree(){
		//求三个数的最大值，先分后和，
		int a = 32;
		int b = 23;
		int c = -789;
		int max;
		max = (max = a > b ? a : b) > c ? max : c;//注意代码的优化,赋值语句的灵活运用
		System.out.println(a + " " + b + " " + c + "三个数的最大值是： " + max);
		
		max = maxOfTwo( maxOfTwo(a , b) , c );//方法的嵌套使用
		System.out.println(a + " " + b + " " + c + "三个数的最大值是： " + max);
			
	}
	public static int maxOfTwo(int a , int b){
		//两个数求最大值的方法	
		int max = a > b ? a : b;
		return max;
	}		
}