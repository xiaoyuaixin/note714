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
		//�й������ͷ�Χ��������
		int a = -2147483648;//int����Сֵ
		double b = -1L * a;//-1L ȡ��long�ĳ���  ����a ��int תΪlong ���ᳬ����Χ
		System.out.println("b = " + b);
	}
	public static void strNull(){
		//��Ա����Ĭ��ֵ����
		//char Ĭ��ֵΪ"" ��һ���ַ��� Ϊ��
		//String Ĭ��ֵΪnull  Ϊ��  û���ַ���
		System.out.println("char ��Ĭ��ֵΪ��" + c );
		System.out.println("String ��Ĭ��ֵΪ�� " + str);
			
	}
	public static void beforjia(){
		//�Ӽ� ��������
		int a = 2;
		a = a++;
		System.out.println("a = a++ �Ľ��Ϊ: " + a );
		int b = a++ + a++ + a++;
		System.out.println("a = " + a + "\tb = " + b );
			
	}
	public static void test(){
	/**
		1����������(��Ŀ�����)  ? : 
		
			��ʽ:  ���� = (����) ?  ���ʽ1 : ���ʽ2;
			
			����: ���ж�������������Ϊtrueʱ����ȡ���ʽ1��ֵ��Ϊ�������ʽ��ֵ��
					������Ϊfalseʱ����ȡ���ʽ2��ֵ��Ϊ�������ʽ��ֵ��
					
		˼��1: ��֪��������a,b,c��һ��max������
			Ҫ������������� ? : дһ�����������������е�������������max�С�
				��������
				
				ҵ��˼��: �ȷֺ��һ��˼��; ��󣬶Դ�������Ż���
				
		˼��2: ��֪��������a,b,c��
			Ҫ��������������� ? : ��дһ��������������������������֮��
			��취���������������������������
			
			ҵ��˼��: ����ӵ�з���ֵֵ������Ϊ������ʹ�á�===>> ������Ƕ�׵��á�		
	
	*/
	
		int a = -3241;
	 	int b = 10;
	 	
	 	int max = 0;
	 	
	 	max = (a > b) ? a : b ;
	 	
	 	System.out.println( "��֪��������: " + a + ", " + b + "������������: " + max );
	 	
	 	b = a > 0 ? a : -a; //��a�ľ���ֵ
	 	System.out.println( a + " �ľ���ֵ��:  " + b );
	 	
	 	byte b1 = 127;
	 	short x = (short)-b1;  // ���ʽ�������������ȷ��?
	 	//�ᱨ��������ʧ����,(short)ǿ��ת��
	 	//-1 Ϊint > short
	 	
		System.out.println("byte תΪ short : " + x);
	}
	public static void maxOfThree(){
		//�������������ֵ���ȷֺ�ͣ�
		int a = 32;
		int b = 23;
		int c = -789;
		int max;
		max = (max = a > b ? a : b) > c ? max : c;//ע�������Ż�,��ֵ�����������
		System.out.println(a + " " + b + " " + c + "�����������ֵ�ǣ� " + max);
		
		max = maxOfTwo( maxOfTwo(a , b) , c );//������Ƕ��ʹ��
		System.out.println(a + " " + b + " " + c + "�����������ֵ�ǣ� " + max);
			
	}
	public static int maxOfTwo(int a , int b){
		//�����������ֵ�ķ���	
		int max = a > b ? a : b;
		return max;
	}		
}