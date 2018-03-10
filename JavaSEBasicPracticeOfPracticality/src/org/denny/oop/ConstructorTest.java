package org.denny.oop;
/**
 * 构造方法的名称必须跟类名称一致
 * 构造方法的声明不能有返回值（当然构造方法的方法体也不允许有return关键字）
 * 构造方法必须是public修饰
 * 
 * 构造方法可以重载，只要参数列表不同(参数的个数或类型不同)即可。
 * 
 * @author Administrator
 *
 */


class Book{
	private long bookno ;
	private String bookName ;
	private String publishName ;
	/**
	 * @return the bookno
	 */
	public long getBookno() {
		return bookno;
	}
	/**
	 * @param bookno the bookno to set
	 */
	public void setBookno(long bookno) {
		this.bookno = bookno;
	}
	/**
	 * @return the bookName
	 */
	public String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	/**
	 * @return the publishName
	 */
	public String getPublishName() {
		return publishName;
	}
	/**
	 * @param publishName the publishName to set
	 */
	public void setPublishName(String publishName) {
		this.publishName = publishName;
	}
	public Book(){ 			//在默认情况下，该无参构造方法，在编译时就被系统自动创建了。
		super() ;
	}
	/**
	 * 如果在类中明确的声明了构造方法，则系统将不会在生成默认的无参构造方法了。
	 * @param bookno
	 * @param bookName
	 * @param publicName
	 */
	public Book(long bookno , String bookName, String publishName){
		setBookno(bookno);
		setBookName(bookName) ;
		setPublishName(publishName) ;
	}
	// getter() 、 setter() 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Book [bookno=" + bookno + ", bookName=" + bookName
				+ ", publishName=" + publishName + "]";
	}
	//被重载后的构造方法
	public Book(long bookno){
		setBookno(bookno) ;
	}
	
	
}


public class ConstructorTest {
	public static void main(String[] args) {
		// 调用默认构造方法
		Book book = new Book() ;
		book.setBookno(6789) ;
		book.setBookName("连城决") ;
		book.setPublishName("北京理工大学出版社");
		System.err.println(book);
		// 调用声明的构造方法
		Book book2 = new Book(6789,"连城决","北京理工大学出版社") ;
		System.err.println(book2);
		
		// 调用被重载后的构造方法
		Book book3 = new Book(7890) ;
		System.err.println(book3);
	}
}
