package org.java8.test;

interface Formula {
    double calculate(int a);
    default double sqrt(int a) {
        return Math.sqrt(a);
    }
    default double pow(int a) {
        return Math.pow(a,a);
    }
}
/**
 * Java8在接口上添加了一个可以以default修饰的实体方法
 * 该方法默认允许通过实例化的子类调用，而且这种调用即使是匿名内部类的方式也可以生效
 * @author Ewonen-PC
 *
 */
public class AboutInterfaceChange {
	public static void main(String[] args) {
		Formula f = new Formula() {
			
			@Override
			public double calculate(int a) {
				return Math.pow(a, a) ;
			}
		} ;
		Formula f1 = new Formula() {
			
			@Override
			public double calculate(int a) {
				return Math.pow(a, a) ;
			}
			@SuppressWarnings("unused")
			public void test1(int a) {
				System.out.println(this.sqrt(a)); ;
			}
		} ;
		String x = f.getClass().getName() ;
		System.out.println(x);
		String x1 = f1.getClass().getName() ;
		System.out.println(x1);
//		f1.test1() ; // 无法调用匿名内部类的方法的
		A a = new A() {

			@Override
			public double caculate(int a) {
				// TODO Auto-generated method stub
				return a * a;
			}
			
		} ;
		System.out.println(a.caculate(10));
		System.out.println(a.print("world !!!"));
	}
}
interface A{
	double caculate(int a) ;
	default String print(String a) {
		return "Hello " + a ;
	}
}