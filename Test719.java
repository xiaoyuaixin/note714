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
		1������
			��չ�ĸ�ֵ�����: �ɸ�ֵ����� (=) �� ���������(��: ���������)��ɵ��������
			��:  +=  -=  *=  /=  %=   ��   
		
		2����ʽ:
			���� ��չ�ĸ�ֵ����� ���ʽ;
			��:  a *= 3 + 2; 
			�����յȼ��� a = a * (3 + 2);
			
		3����չ���������������ص���ʲô��
		
			
	*/
	public static void chToint(){
		char ch = 'A';
		int x = ch + 1;
		System.out.println("x = " + x );
		
		//ch = ch + 1;//�˽������Ϊint
		//ch += 1;  //�����൱�� ch = ch + 1; += �Զ�ת��Ϊchar����
		ch++;//++�Զ�ת������Ϊchar 
		System.out.println("ch = " + ch );
	
	}
	public static void  intToDouble(){
		int i = 2;
		double d = -i;
		System.out.println(d);	
		
	}
/*	�й�if����˼��:
		��: �����������������ֻ��ʹ��if��������������С�������С�����������ǰ������������
			���������ĸ������������������������ֻʹ��if����������������ν��еģ�
		
		����: ͬѧѰ�Ҷ��������Ĺ���(��)��
*/
	public static void ifTest(){
		int a = (int)(100*Math.random());
		int b = (int)(100*Math.random());
		int c = (int)(100*Math.random());
		
		System.out.println("a,b,c�������ֱ�Ϊ:" + a + " " + b + " " + c);
		System.out.println("�����˳��Ϊ��");
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
	˼��:
			����һ���ɼ�������������������������[0, 100]��Χ�У�ֻ��switch����жϴ˳ɼ����ó�������A��B��C��D��������
			Ҫ��: [90, 100] ʱ������ΪA
			 [80, 89] ʱ������ΪB
			 [70, 79] ʱ������ΪC
			 [60, 69] ʱ������ΪD
			 [0,  59] ʱ������Ϊ: ����Ŭ����
			 			 
			
	*/
	public static void score(){
		int sc = (int)(100 * Math.random());
		System.out.println("��ĳɼ�Ϊ�� " + sc);
		int scc = (int) sc / 10;
		String str = null;
		switch(scc){
			case 0:
			case 1:
			case 2:
			case 3:
			case 4:
			case 5:str = "����Ŭ��";break;
			case 6:str = "D";break;
			case 7:str = "C";break;
			case 8:str = "B";break;
			case 9:
			case 10:str = "A" ;break;
			default:str = "�ɼ������⣡";	
		}	
		System.out.println("��ĳɼ��ȼ�Ϊ��" + str);
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
			
			System.out.println("����:" + i);
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