package org.java.array;

import org.java.oop.Book;

/**
 * 本单元目标：
 * 1、了解数组的基本概念
 * 2、了解数组的声明及使用方式
 * 3、在数组声明和实例化时必须带有[]，并且实例化时必须指定数组的长度
 * 4、注意数组的两种简写形式
 * 5、对于二维数组使用上跟一维数组差不多，
 * 相比较，二维数组的使用只是增加了一个维度，
 * 也就是在确定元素在数组的位置时多了一个索引，
 * 二维数组只需注意索引问题，
 * 三维、四维……同理
 * @author Ewonen-PC
 *
 */
public class BasicArrayTest {
	public static void main(String[] args) {
		arrayTest1() ;
		// 以下两种是静态定义数组的简化形式
		arrayTest2() ;
		arrayTest3() ;
		// 二维数组
		arrayTest4() ;
		// 数组的简单排序
		arrayTest5() ;
		// 数组的copy
		arrayCopy() ;
		// 对象数组
		objectArray() ;
	}
	/***
	 * 数组的基本定义及使用
	 */
	public static void arrayTest1(){
		int [] xs ; // 数组的声明，不仅要有变量还必须指定数组的类型，用[]标记。
		int i = 0 ; 
		xs = new int[3] ; // 数组的实例化同样需要用到[]，并且实例化的同时必须指定数组的长度
		xs[0] = 10 ;
		xs[1] = 20 ;
		xs[2] = 30 ;
		for(;i<3;) {
			System.out.println(xs[i]);
			i++;
		}
	}
	/**
	 * 数组的第一种简化方式
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
	 * 数组的第二种简化方式
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
	 * 多维数组的定义及使用
	 */
	public static void arrayTest4(){
		//二维数组
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
			System.out.println("第" + a + "行:");
			for (int b = 1 ; b <= 10 ; b ++){
				System.out.println("\t第" + b + "列 ==> arrays[i][j] = " + arrays[a-1][b-1] + "");
			}
		}
	}
	/***
	 * 数组的排序
	 */
	public static void arrayTest5(){
		int array[] = {8,3,7,1,2,4,6,5} ;
		// 3 7 1 2 4 6 5 8
		// 3 1 2 4 6 5 7 8
		// 1 2 3 4 5 6 7 8
		for(int x = 0 ; x < array.length ; x ++){ 
			for ( int y = 0 ; y < array.length - 1 ; y ++ ) {// 每一轮比较找出一个较大的往后放，前后逐个两两相比，减一是除去自己
				if ( array[y] > array[y+1] ){
					int temp = array[y] ;
					array[y] = array[y+1] ;
					array[y+1] = temp ;
				}
			}
			System.out.println("\n第"+ (x+1) +"次排序后的结果：");
			/**
			 * 冒泡排序的概念就是 ： 前后相邻的两个数两两相比，如果要结果是升序那么每一轮比较找出一个较大的往后放，第一轮排序后数组中索引最后一个数是最大的，
			 */
			for(int z = 0 ; z < array.length; z ++){
				System.out.print("\t" + array[z] + "、");
			}
		}
	}
	private static void print(int [] array) {
		System.out.println();
		for( int a = 0 ; a < array.length ; a ++ ){
			System.out.print(array[a] + "、") ;
		}
	}
	public static void arrayCopy(){
		int arr1[] = {1,3,5,7} ;
		int arr2[] = {1,4,6,8,9,11} ; // copy后，这个数组为1，3，5，7，9，11
		/**
		 * System.arraycopy(param1,param2,param3,param4,param5) 
		 * 
		 * param1 : 原数组
		 * param2 : 原数组的copy起点(下标)
		 * param3 : 目标数组
		 * param4 : 目标数组的粘贴起点(下标)
		 * param5 : 从原数组中要被copy到目标数组的copy的个数
		 * 
		 */
		System.arraycopy(arr1, 1,arr2, 1, 3);
		print(arr2) ;
	}
	/**
	 * 对象数组的定义和使用
	 */
	public static void objectArray(){
//		Book bks[] = new Book[3] ; // 定义的形式跟普通数据类型的数组定义是一样的
//		bks[0] = new Book("JavaEE",68.8) ;
//		bks[1] = new Book("Python",28.8) ;
//		bks[2] = new Book("Android",18.8) ;
		
		Book bks[] = { // 以上的简写形式
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
