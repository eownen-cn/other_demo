package org.java.string;

import java.util.Date;
import java.util.Locale;

public class StringDemo4 {
	public static void main(String[] args) {
		
		String str = "Hello world !!!" ;
		
		// copyValueOf() ����������
		String str1 = String.copyValueOf(str.toCharArray(),0,5) ;
		String str2 = String.copyValueOf(str.toCharArray(),5,10) ;
		System.out.println(str1 + str2);
		
		// copyValueOf() һ��������
		String str3 = String.copyValueOf(str.toCharArray()) ;
		System.out.println(str3);
		
		// valueOf() ���Բ���
		boolean bl = 'a' > 'b' ;
		System.out.println(bl);
		System.out.println(String.valueOf(bl).getClass().getName());
		
		// valueOf() �����ַ�
		char c = 'x' ; // 120
		System.out.println(c);
		System.out.println(String.valueOf(c).getClass().getName());
		System.out.println(Integer.valueOf(c).getClass().getName());
		
		// valueOf() ��������
		int x = 10 ;
		System.out.println(x);
		System.out.println(String.valueOf(x).getClass().getName());
		
		// valueOf() ���Գ�����
		long y = 10 ;
		System.out.println(y);
		System.out.println(String.valueOf(y).getClass().getName());
		
		// valueOf() ���Ե����ȸ�����
		float f = 1.1f ;
		System.out.println(f);
		System.out.println(String.valueOf(f).getClass().getName());
		
		// valueOf() ����˫���ȸ�����
		double d = 1.1 ;
		System.out.println(d);
		System.out.println(String.valueOf(d).getClass().getName());
		
		String stra = "hello" ;
		String strb = "world" ;
		String strc = stra + strb ;
		String strd = stra.concat(strb).intern() ;
		System.out.println(strc== strd); 
		System.out.println(strc.intern() == (stra.concat(strb)));
		System.out.println(strc.intern() == strd.intern());
		
		String test1 = "����������  ==> %tD %tT" ;
		Date date1 = new Date() ;
		String r1 = String.format(test1,date1,date1)  ;
		System.out.println(r1);

		String r2 = String.format("�����·ݼ�ƣ�%tb%n",date1) ;
		System.out.println(r2);
		String r3 = String.format("�����·�ȫ�ƣ�%tB%n",date1) ;
		System.out.println(r3);
		
		// Ӣ���·ݼ��
		System.out.println(String.format(Locale.US,"Ӣ���·ݼ�ƣ�%tb%n",date1));
		// Ӣ���·�ȫ��
		System.out.println(String.format(Locale.US, "Ӣ���·�ȫ��:%tB%n" , date1));

		// Ӣ�����ڼ��
		System.out.println(String.format(Locale.US, "Ӣ�����ڼ��:%ta%n",date1));
		// Ӣ������ȫ��
		System.out.println(String.format(Locale.US, "Ӣ������ȫ��:%tA%n",date1));
		// �������ڼ��
		System.out.printf(String.format("�������ڼ��:%tA", date1));
		// ��ĺ���λ����
		System.out.println(String.format("��ĺ���λ����:%ty", date1));
		// һ���е�����
		System.out.println(String.format("һ���е�����:%tj", date1));
		// ��λ���ֵ��·�
		System.out.println(String.format("��λ���ֵ��·�:%tm", date1));
		// ��λ���ֵ���
		System.out.println(String.format("��λ���ֵ���:%td", date1));
		// �·ݵ���
		System.out.println(String.format("�·ݵ���:%te", date1));
		
		
		
		
		
		
		
		
		
		
	}
}
