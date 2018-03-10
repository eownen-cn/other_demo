package org.java.array;

import org.java.oop.Book;

/**
 * ����ԪĿ�꣺
 * 1���˽�����Ļ�������
 * 2���˽������������ʹ�÷�ʽ
 * 3��������������ʵ����ʱ�������[]������ʵ����ʱ����ָ������ĳ���
 * 4��ע����������ּ�д��ʽ
 * 5�����ڶ�ά����ʹ���ϸ�һά�����࣬
 * ��Ƚϣ���ά�����ʹ��ֻ��������һ��ά�ȣ�
 * Ҳ������ȷ��Ԫ���������λ��ʱ����һ��������
 * ��ά����ֻ��ע���������⣬
 * ��ά����ά����ͬ��
 * @author Ewonen-PC
 *
 */
public class BasicArrayTest {
	public static void main(String[] args) {
		arrayTest1() ;
		// ���������Ǿ�̬��������ļ���ʽ
		arrayTest2() ;
		arrayTest3() ;
		// ��ά����
		arrayTest4() ;
		// ����ļ�����
		arrayTest5() ;
		// �����copy
		arrayCopy() ;
		// ��������
		objectArray() ;
	}
	/***
	 * ����Ļ������弰ʹ��
	 */
	public static void arrayTest1(){
		int [] xs ; // ���������������Ҫ�б���������ָ����������ͣ���[]��ǡ�
		int i = 0 ; 
		xs = new int[3] ; // �����ʵ����ͬ����Ҫ�õ�[]������ʵ������ͬʱ����ָ������ĳ���
		xs[0] = 10 ;
		xs[1] = 20 ;
		xs[2] = 30 ;
		for(;i<3;) {
			System.out.println(xs[i]);
			i++;
		}
	}
	/**
	 * ����ĵ�һ�ּ򻯷�ʽ
	 */
	public static void arrayTest2(){
		int [] xs = {10,20,30} ;
		int i = 0 ; 
//		xs = new int[3] ; 
//		xs[0] = 10 ;
//		xs[1] = 20 ;
//		xs[2] = 30 ;
		for(;i<3;) {
			System.out.println(xs[i]);
			i++;
		}
	}
	/**
	 * ����ĵڶ��ּ򻯷�ʽ
	 */
	public static void arrayTest3(){
		int [] xs = new int [] {10,20,30} ;
		int i = 0 ; 
//		xs = new int[3] ; 
//		xs[0] = 10 ;
//		xs[1] = 20 ;
//		xs[2] = 30 ;
		for(;i<3;) {
			System.out.println(xs[i]);
			i++;
		}
	}
	/**
	 * ��ά����Ķ��弰ʹ��
	 */
	public static void arrayTest4(){
		//��ά����
		int [][] arrays = new int[10][10] ;
		int [] myArray = new int [100] ;
		int val = 0 ;
		for( int i = 0; i < 10 ; i ++ ){
			for ( int j = 0 ; j < 10 ; j ++ ){
				myArray[val++] = arrays[i][j] = val ;
			}
		}
		for( int i = 0; i < 100 ; i ++ ){
			System.out.println(myArray[i]);
		}
		for ( int a = 1 ; a <= 10 ; a ++){
			System.out.println("��" + a + "��:");
			for (int b = 1 ; b <= 10 ; b ++){
				System.out.println("\t��" + b + "�� ==> arrays[i][j] = " + arrays[a-1][b-1] + "");
			}
		}
	}
	/***
	 * ���������
	 */
	public static void arrayTest5(){
		int array[] = {8,3,7,1,2,4,6,5} ;
		// 3 7 1 2 4 6 5 8
		// 3 1 2 4 6 5 7 8
		// 1 2 3 4 5 6 7 8
		for(int x = 0 ; x < array.length ; x ++){ 
			for ( int y = 0 ; y < array.length - 1 ; y ++ ) {// ÿһ�ֱȽ��ҳ�һ���ϴ������ţ�ǰ�����������ȣ���һ�ǳ�ȥ�Լ�
				if ( array[y] > array[y+1] ){
					int temp = array[y] ;
					array[y] = array[y+1] ;
					array[y+1] = temp ;
				}
			}
			System.out.println("\n��"+ (x+1) +"�������Ľ����");
			/**
			 * ð������ĸ������ �� ǰ�����ڵ�������������ȣ����Ҫ�����������ôÿһ�ֱȽ��ҳ�һ���ϴ������ţ���һ��������������������һ���������ģ�
			 */
			for(int z = 0 ; z < array.length; z ++){
				System.out.print("\t" + array[z] + "��");
			}
		}
	}
	private static void print(int [] array) {
		System.out.println();
		for( int a = 0 ; a < array.length ; a ++ ){
			System.out.print(array[a] + "��") ;
		}
	}
	public static void arrayCopy(){
		int arr1[] = {1,3,5,7} ;
		int arr2[] = {1,4,6,8,9,11} ; // copy���������Ϊ1��3��5��7��9��11
		/**
		 * System.arraycopy(param1,param2,param3,param4,param5) 
		 * 
		 * param1 : ԭ����
		 * param2 : ԭ�����copy���(�±�)
		 * param3 : Ŀ������
		 * param4 : Ŀ�������ճ�����(�±�)
		 * param5 : ��ԭ������Ҫ��copy��Ŀ�������copy�ĸ���
		 * 
		 */
		System.arraycopy(arr1, 1,arr2, 1, 3);
		print(arr2) ;
	}
	/**
	 * ��������Ķ����ʹ��
	 */
	public static void objectArray(){
//		Book bks[] = new Book[3] ; // �������ʽ����ͨ�������͵����鶨����һ����
//		bks[0] = new Book("JavaEE",68.8) ;
//		bks[1] = new Book("Python",28.8) ;
//		bks[2] = new Book("Android",18.8) ;
		
		Book bks[] = { // ���ϵļ�д��ʽ
			new Book("JavaEE",68.8),
			new Book("Python",28.8),
			new Book("Android",18.8)
		} ;
		
		System.out.println();
		for (int a = 0 ; a < bks.length ; a++  ){
			System.out.println(bks[a].getInfo()+"\n");
		}
	}
	
}
