package org.java8.test;

/**
 * 方法与构造函数引用
 * @author Ewonen-PC
 *
 */
public class FunctionAndConstructorReferences {
	private static Book book ;
	private static Integer bookId ;
	private static String bookName ;
	
	/**
	 * @return the book
	 */
	public static Book getBook() {
		return book;
	}
	/**
	 * @param book the book to set
	 */
	public static void setBook(Book book) {
		FunctionAndConstructorReferences.book = book;
	}
	/**
	 * @return the bookId
	 */
	public static Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public static void setBookId(Integer bookId) {
		FunctionAndConstructorReferences.bookId = bookId;
	}
	/**
	 * @return the bookName
	 */
	public static String getBookName() {
		return bookName;
	}
	/**
	 * @param bookName the bookName to set
	 */
	public static void setBookName(String bookName) {
		FunctionAndConstructorReferences.bookName = bookName;
	}
	public static void main(String[] args) {
		
		Convertor<String, Integer> toInt = Integer::valueOf;
		Integer i = toInt.convert("123");
		System.out.println(i);   // 123
		
		Convertor<String,Double> toDouble = Double :: valueOf ;
		Double d = toDouble.convert("12") ;
		System.out.println(d);

		Convertor<String,Float> toFloat = Float :: valueOf ;
		Float f = toFloat.convert("12") ;
		System.out.println(f);

		Convertor<String,Boolean> toBoolean = Boolean :: valueOf ;
		Boolean b = toBoolean.convert("0") ;
		System.out.println(b);
		Boolean b1 = toBoolean.convert("true") ;
		System.out.println(b1);
		
		book = new Book() ;
		book.setBookId(10001);
		book.setBookName("莱士德") ;
	}
}
class Book{
	
	private Integer bookId ;
	private String bookName ;
	
	public Book() {
		super();
	}

	public Book(Integer bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	/**
	 * @return the bookId
	 */
	public Integer getBookId() {
		return bookId;
	}
	/**
	 * @param bookId the bookId to set
	 */
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
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
	
	@Override
	public String toString() {
		return "编号  : " + this.bookId + " | 名称  : " + this.bookName ;
	}
}
