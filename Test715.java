import java.util.Scanner;
public class Test715{
	public static void main( String[] args){
		//show("5678");	//�����в����ķ���
		//zhuan();//��������ת��
		//input();//��ô����
		//Te.main(args);//��Ҫ���ǲ���,
		//addTest();//char������ӣ����ԼӺ�����
		//ZhuanYi.zhuan();//ת���ַ�
		//DataType.suan();//�������͵�Ĭ��ֵ
		//Jiajia.jiajia();//�����Լ�
		//D.d();//����
		E.e();
		
	}
	//�����ĵ���
	public static void show( String str ){
		System.out.println("str ���յ�����ϢΪ�� " + str);	
	}
	//���͵�ת��
	public static void zhuan(){
		long tt = 21474836489999L;
		float f1 = tt;
		System.out.println("f1 = " + f1);
		short s1 = 32767;
		System.out.println("float�������������ǣ�"+ Float.MAX_VALUE);	
		System.out.println("float�������С�����ǣ�"+ Float.MIN_VALUE);	
	}
	//���ʵ�ּ�������
	/*
		������
		1�����룺import java.util.Scanner;
		2) ������Scanner sc = new Scanner(System.in);
		3) ¼�룺int i = sc.nextInt();
		         String s = sc.next();
	*/
	public static void input(){
		System.out.println("������Ϣ��");
		Scanner sc = new Scanner(System.in);//���������ڵ�����System.in
		String str = sc.next();
		System.out.println("���������Ϊ��" + str);
	}
	//+�� ������
	public static void addTest(){
		int a = 10,b = 20;
		char xing = 'ʯ';
		char ming = '��';
		char ming2 = '��';
		//System.out.println("����Ϊ(�м�û�пո����):"+ xing + ming +ming2);
		System.out.println( xing + ming +ming2);
		System.out.println("�пո����:" + xing +"" + ming + "" + ming2 );
	}
}
//���ñ�����������
class Te{
	public static void main( String[] args){
		System.out.println("����Te����");	
	}
}
//ת���ַ�������
/*
	\n  ����
	\r  �س�   ���ص���ʼ״̬
	\b  �˸�   ����ɾ������  ������������ݣ���Ḳ�ǵ�ǰ��������
	\t  �Ʊ��  һ���Ʊ��ռ8���ո񣬲����ǿհ˸���
	\\  \
	\"  "
	\'  '
*/
class ZhuanYi{
	public static void zhuan(){
		System.out.println("abcd\n1234" );
		System.out.println("abcd\r12" );
		System.out.println("abcd\b1234\b" );//�ַ�d��1���ǣ�����4������ʧ
		System.out.println("abcdefgh\t1234\t5\t678" );
		
			
	}	
}
//�����������͵�Ĭ��ֵ
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
//�����Լ�
class Jiajia{

	public static void jiajia(){
		
	    show1();
	    show2();
	    show3();
	}
	//Ȥζ˼��1: ��֪ a = 2; ִ�� a = a++; ֮����a�Ƕ��٣���������ִ�еĹ��̡�
	public static void show1(){
		int a = 2;
		a = a++;
		System.out.println("���Ϊ:"+a);
	}
	//Ȥζ˼��2: ��֪ a = 2; ִ�� int b = a++ + a++ + a++; ֮����a��b�Ƕ��٣���������ִ�еĹ��̡�
	public static void show2(){
		int a = 2;
		int b = a++ + a++ + a++;
		System.out.println("a:" + a +" " + "b:" + b);
	}
	//������ϰ: ���ݵ�ǰ������� �Լ��������Ӧ�á�
	public static void show3(){
		int a = 2;
		System.out.println("�Լ����Ϊ��" + a);
	}
}
//��·��  ��·��  ��
/*
	&&:��·��  ����ͬΪtrue�����Ϊtrue  ����Ϊfalse��������Ϊfalse�����治���㣬��ʡʱ�䣬���Ч��
	||:��·��  ������һ��Ϊtrue�����Ϊtrue  ��Ϊfalseʱ�����Ϊfalse   ������Ϊtrueʱ,���Ϊtrue
	!:��    
*/
class D{
	public static void d(){
		int a = 5;
		int b = a++;
		boolean flag = 5 >= 3;
		System.out.println("flag = " + flag );
		flag = "ABC" instanceof String ;//instanceof ����
		System.out.println("flag = " + flag );		
		a = 5; 
		b = 6;
		//flag =  a++ >= 3+2 && ++a > b++;
		
		flag =  a++ > 3+2 && ++a > b++;
		System.out.println("a = " + a + "\tb = " + b + "\tflag = " + flag );	
	}
}
//fianl ����   �����޸�
class E{
	public static void e(){
		final double PI = 3.14;
		double c = 3;//�뾶
		System.out.println("�뾶Ϊ:" + c +"��Բ�����Ϊ:" + c * PI * PI);
	}
}