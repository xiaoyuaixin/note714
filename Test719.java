public class Test719{
	public static void  main ( String[] args ){
		chToint();
		intToDouble();
		ifTest();
		score();
		work();
		work2();
	}
	/**
		1、概念
			扩展的赋值运算符: 由赋值运算符 (=) 和 其它运算符(如: 算术运算符)组成的运算符。
			如:  +=  -=  *=  /=  %=   等   
		
		2、格式:
			变量 扩展的赋值运算符 表达式;
			如:  a *= 3 + 2; 
			它最终等价于 a = a * (3 + 2);
			
		3、扩展的运算符，其最大特点是什么？
		
			
	*/
	public static void chToint(){
		char ch = 'A';
		int x = ch + 1;
		System.out.println("x = " + x );
		
		//ch = ch + 1;//此结果类型为int
		//ch += 1;  //最终相当于 ch = ch + 1; += 自动转换为char类型
		ch++;//++自动转换类型为char 
		System.out.println("ch = " + ch );
	
	}
	public static void  intToDouble(){
		int i = 2;
		double d = -i;
		System.out.println(d);	
		
	}
/*	有关if语句的思考:
		题: 产生三个随机整数，只能使用if对这三个整数由小到大排列。最后输出排序前和排序后的数。
			若产生的四个随机整数或五个随机整数，则只使用if对它们排序，那是如何进行的？
		
		最终: 同学寻找多个数排序的规律(？)。
*/
	public static void ifTest(){
		int a = (int)(100*Math.random());
		int b = (int)(100*Math.random());
		int c = (int)(100*Math.random());
		
		System.out.println("a,b,c三个数分别为:" + a + " " + b + " " + c);
		System.out.println("排序后顺序为：");
		//int max = ifTest2(ifTest2(a , b),c);
		ifTest2(a , b , c );
	}
	public static void ifTest2(int a , int b , int c ){
		int temp = 0 ;
		if(a>b){
			temp = a;
			a = b ;
			b = temp ;
		}
		if(a>c){
			temp = a;
			a = c ;
			c = temp ;
		}
		if(b>c){
			temp = b;
			b = c ;
			c = temp ;
		}
		System.out.println(a+","+b+","+c);
			
	}
	/*
	思考:
			产生一个成绩（可输入或随机产生），它在[0, 100]范围中，只用switch语句判断此成绩，得出该属性A、B、C、D、其它。
			要求: [90, 100] 时，则结果为A
			 [80, 89] 时，则结果为B
			 [70, 79] 时，则结果为C
			 [60, 69] 时，则结果为D
			 [0,  59] 时，则结果为: 继续努力！
			 			 
			
	*/
	public static void score(){
		int sc = (int)(100 * Math.random());
		System.out.println("你的成绩为： " + sc);
		int scc = (int) sc / 10;
		String str = null;
		switch(scc){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:str = "继续努力";break;
			case 6:str = "D";break;
			case 7:str = "C";break;
			case 8:str = "B";break;
			case 9:
			case 10:str = "A" ;break;
			default:str = "成绩有问题！";	
		}	
		System.out.println("你的成绩等级为：" + str);
		//String stt = "one" + 'one';
	}
	public static void work() {
		int i = 0, sum = 0;
		while (i <= 10) {
			sum += i;
			i++;
			if (i % 2 == 0)
				continue;
		}
		System.out.println(sum);
	}
	public static void work2() {
		int sum=0;
		for(int i=1;i<10;i++){
			do{
			
			System.out.println("这是:" + i);
				i++;
				if(i%2!=0)
					sum+=i;
			}while(i<6);
		}
		System.out.println(sum);
		//char a = 2 ;
		//char c = a + '2';//
		//System.out.println("char :"+  a);
		
	}
}