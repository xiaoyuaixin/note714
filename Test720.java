import java.util.Scanner;
public class Test720{
	public int a,b;
	public static void main( String[] args ){
		//returnWork();
		//conWork();
		//wh();
		//cheng();
		//zhengchu5();
		//leijia();
		//jiechenghe();
		//scorecard();
		change();
	}
	public static void returnWork(){//return的作用：跳出for循环，返回调用的方法处
		for(int i=0;i<10;i++){
			int j = i%2;
			//System.out.println("j=" + j);
			if (i%2!=0)
			{ 
				//System.out.println(" I= " + i);
				return;
			
			}
			System.out.print(i);
		}
	}
	public static void conWork(){//continue的作用：不执行下面的语句，继续循环下一次
		System.out.println();
		for(int  i=1;i<=10;i++){
		if (i<5)
			continue;
		System.out.println("Java基础班");//会打出6次java基础班
	        }	
	}
	
	public static void wh(){
	//求1-10 0的奇数 偶数的 分别累加结果
		int jsum = 0;
		int num = 1;
		int osum = 0;
		while( num <= 100){
			if( num % 2 == 0){
				osum = osum + num;	
			}else{
				jsum = jsum + num;
			}
			
			num++;	
		}
		System.out.println("奇数的和为：" + jsum);
		System.out.println("偶数的和为：" + osum);
	}
	public static void cheng(){
		//99乘法表
		for(int i = 1;i < 10 ;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i + "*"+ j  + "=" + i * j + "\t");
			}	
			System.out.println("\n");
		}	
	}
	/*
		用while和for循环输出1-1000之间能被5整除的数，且每行输出3个。
	
	*/
	public static void zhengchu5(){
		int i = 1,j = 1;
		while(i <= 100){
			if(i % 5 == 0){
				System.out.print(i + " ");
				j++;
			}
			if(j == 4){
				j = 1;	
				System.out.println("\n");
			}
			i++;
			
		}
		System.out.println("\nEND");
		
	} 
	/*
		编程求：∑1+∑2+……+∑100
		
	*/
	public static void leijia(){
		System.out.println();
		//int sum = 0;
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			//as = 0;
			for(int j = 1;j <= i;j++){
				sum = sum + j;
			}	
			//sum = sum + as;
		}	
		System.out.println("∑1+∑2+...+∑100= " + sum);
		
	
	}	
	/*
		编程求：1！+2！+……+10!
	*/
	public static void jiechenghe(){
		//阶乘问题先看看是否超出范围,在注意中间值的作用域
		int sum = 0;
		int as = 1;
		for(int i = 1;i <= 10;i++){
			as = 1;
			for(int j = 1;j <= i;j++){
				as = as * j; 	
			}
			//System.out.println(i+"每一次:as="+as);
			sum = sum + as;
			//System.out.println("sum="+sum);
		}
		System.out.println("1!+2!+...+10!= " + sum);
	}
	public static void scorecard(){
	//对成绩进行等级分类   如果输入不是数字，可以用try catch 捕获异常
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入你的成绩：");
		//String s = sc.next();
		int score = 0;
		try{
			score = sc.nextInt();
		}catch(Exception e){
			System.out.println("不能输入非数字");
			System.exit(0);
		}
		if(score < 0 || score > 100){
			System.out.println("输入成绩有误！程序退出！");
			System.exit(0);	
		}
		String str = null;
		int sco = score / 10;
		switch(sco){
			case 10:
			case  9:str = "A";break;
			case  8:str = "B";break;
			case  7:str = "C";break;
			case  6:str = "D";break;
			default:str = "不合格";	
			
		}
		System.out.println("你的成绩等级为：" + str);
	}
	public static void datatype(){
		char c1 = 65 + 2;//常量相加还是常量 ，可以直接赋值
		//char c2 = c1 + 3;//会编译出错，表达式相加，此处为int类型
		 	
	}
	public static void change(){
		//交换数据，调用方法并不会交换
		//有两种方式，一是 用数组   二是 用成员变量
		//结论: 无法通过方法实现两个基本类型数据的交换。
		//在Java中，方法参数的传递是一种值传递。因此，无法实现基本类型数据的改变(如: 交换)。
	
		
		int a = 2, b =  1;
		System.out.println("交换前ab分别为："+ a +" "+ b);
		changedata(a , b);
		System.out.println("交换后ab分别为："+ a +" "+ b);
	}
	public static void changedata(int a, int b){
		int temp = 0;
		if( a > b){
			temp = a;
			a = b;
			b = temp;
		}
		
	}
	public static void bytetochar(  ) {
		char ch = 65;
		char ch2 = (char)(ch + 1);
		System.out.println( ch );	
		System.out.println( ch2 );	

		//byte ===>>> [-128, 127], 其中包含负数。
		//char ===>>> [0, 65535],  字符的编码没有负数。
		//因此, 若byte 变量的值为负数时，则直接赋给char型变量，之后，去寻找负数对应的字符，存在吗？
		
	}
	/*
		1、什么是嵌套循环？
			
		
		2、为什么需要嵌套循环？
			A
			
			A A A A A  
			
			A A A A A 
			A A A A A 
			A A A A A 
			A A A A A 
			A A A A A 
			
			
			A  
			A A  
			A A A  
			A A A A  
			A A A A A 
			
			
			    A  
			   A A  
			  A A A  
			 A A A A  
			A A A A A 
	*/
	public static void chartree(  ){
		char ch = 'A';
		int row = (int)(26 * Math.random() ) + 1 ; //总行数
		
		for(int r = 1; r <= row;  r++ ){ //控制行数
			//每行空格的打印
			for( int k = 1; k <= row-r ;  k++ ){
				System.out.print(" "); 
			}
			 
			for( int n = 1; n <= r;  n++ ){ //控制每行的个数
				System.out.print( ch + " " );
			}
			System.out.println();
			ch++;
		
		}
	}
}