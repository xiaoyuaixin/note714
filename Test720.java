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
	public static void returnWork(){//return�����ã�����forѭ�������ص��õķ�����
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
	public static void conWork(){//continue�����ã���ִ���������䣬����ѭ����һ��
		System.out.println();
		for(int  i=1;i<=10;i++){
		if (i<5)
			continue;
		System.out.println("Java������");//����6��java������
	        }	
	}
	
	public static void wh(){
	//��1-10 0������ ż���� �ֱ��ۼӽ��
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
		System.out.println("�����ĺ�Ϊ��" + jsum);
		System.out.println("ż���ĺ�Ϊ��" + osum);
	}
	public static void cheng(){
		//99�˷���
		for(int i = 1;i < 10 ;i++){
			for(int j = 1;j <= i;j++){
				System.out.print(i + "*"+ j  + "=" + i * j + "\t");
			}	
			System.out.println("\n");
		}	
	}
	/*
		��while��forѭ�����1-1000֮���ܱ�5������������ÿ�����3����
	
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
		����󣺡�1+��2+����+��100
		
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
		System.out.println("��1+��2+...+��100= " + sum);
		
	
	}	
	/*
		�����1��+2��+����+10!
	*/
	public static void jiechenghe(){
		//�׳������ȿ����Ƿ񳬳���Χ,��ע���м�ֵ��������
		int sum = 0;
		int as = 1;
		for(int i = 1;i <= 10;i++){
			as = 1;
			for(int j = 1;j <= i;j++){
				as = as * j; 	
			}
			//System.out.println(i+"ÿһ��:as="+as);
			sum = sum + as;
			//System.out.println("sum="+sum);
		}
		System.out.println("1!+2!+...+10!= " + sum);
	}
	public static void scorecard(){
	//�Գɼ����еȼ�����   ������벻�����֣�������try catch �����쳣
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ĳɼ���");
		//String s = sc.next();
		int score = 0;
		try{
			score = sc.nextInt();
		}catch(Exception e){
			System.out.println("�������������");
			System.exit(0);
		}
		if(score < 0 || score > 100){
			System.out.println("����ɼ����󣡳����˳���");
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
			default:str = "���ϸ�";	
			
		}
		System.out.println("��ĳɼ��ȼ�Ϊ��" + str);
	}
	public static void datatype(){
		char c1 = 65 + 2;//������ӻ��ǳ��� ������ֱ�Ӹ�ֵ
		//char c2 = c1 + 3;//�����������ʽ��ӣ��˴�Ϊint����
		 	
	}
	public static void change(){
		//�������ݣ����÷��������ύ��
		//�����ַ�ʽ��һ�� ������   ���� �ó�Ա����
		//����: �޷�ͨ������ʵ�����������������ݵĽ�����
		//��Java�У����������Ĵ�����һ��ֵ���ݡ���ˣ��޷�ʵ�ֻ����������ݵĸı�(��: ����)��
	
		
		int a = 2, b =  1;
		System.out.println("����ǰab�ֱ�Ϊ��"+ a +" "+ b);
		changedata(a , b);
		System.out.println("������ab�ֱ�Ϊ��"+ a +" "+ b);
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

		//byte ===>>> [-128, 127], ���а���������
		//char ===>>> [0, 65535],  �ַ��ı���û�и�����
		//���, ��byte ������ֵΪ����ʱ����ֱ�Ӹ���char�ͱ�����֮��ȥѰ�Ҹ�����Ӧ���ַ���������
		
	}
	/*
		1��ʲô��Ƕ��ѭ����
			
		
		2��Ϊʲô��ҪǶ��ѭ����
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
		int row = (int)(26 * Math.random() ) + 1 ; //������
		
		for(int r = 1; r <= row;  r++ ){ //��������
			//ÿ�пո�Ĵ�ӡ
			for( int k = 1; k <= row-r ;  k++ ){
				System.out.print(" "); 
			}
			 
			for( int n = 1; n <= r;  n++ ){ //����ÿ�еĸ���
				System.out.print( ch + " " );
			}
			System.out.println();
			ch++;
		
		}
	}
}