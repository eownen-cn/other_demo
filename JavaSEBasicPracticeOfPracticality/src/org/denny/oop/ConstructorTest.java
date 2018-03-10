package org.denny.oop;
/**
 * ���췽�������Ʊ����������һ��
 * ���췽�������������з���ֵ����Ȼ���췽���ķ�����Ҳ��������return�ؼ��֣�
 * ���췽��������public����
 * 
 * ���췽���������أ�ֻҪ�����б�ͬ(�����ĸ��������Ͳ�ͬ)���ɡ�
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
	public Book(){ 			//��Ĭ������£����޲ι��췽�����ڱ���ʱ�ͱ�ϵͳ�Զ������ˡ�
		super() ;
	}
	/**
	 * �����������ȷ�������˹��췽������ϵͳ������������Ĭ�ϵ��޲ι��췽���ˡ�
	 * @param bookno
	 * @param bookName
	 * @param publicName
	 */
	public Book(long bookno , String bookName, String publishName){
		setBookno(bookno);
		setBookName(bookName) ;
		setPublishName(publishName) ;
	}
	// getter() �� setter() 
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Book [bookno=" + bookno + ", bookName=" + bookName
				+ ", publishName=" + publishName + "]";
	}
	//�����غ�Ĺ��췽��
	public Book(long bookno){
		setBookno(bookno) ;
	}
	
	
}


public class ConstructorTest {
	public static void main(String[] args) {
		// ����Ĭ�Ϲ��췽��
		Book book = new Book() ;
		book.setBookno(6789) ;
		book.setBookName("���Ǿ�") ;
		book.setPublishName("��������ѧ������");
		System.err.println(book);
		// ���������Ĺ��췽��
		Book book2 = new Book(6789,"���Ǿ�","��������ѧ������") ;
		System.err.println(book2);
		
		// ���ñ����غ�Ĺ��췽��
		Book book3 = new Book(7890) ;
		System.err.println(book3);
	}
}
