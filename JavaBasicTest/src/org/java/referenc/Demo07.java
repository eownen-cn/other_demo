package org.java.referenc;

public class Demo07 {
	public static void main(String[] args) {
		
		// ��һ��:�������ԵĶ��󣬲����Ի�������������
		Province p = new Province(10010,"�ӱ�") ; // ����һ��ʡ��
		
		// ������������
		City c1 = new City(10011,"�ػʵ�") ;
		City c2 = new City(10012,"�żҿ�") ;
		City c3 = new City(10013,"��ɽ") ;
		
		// ���Ը��������Ƿ�����
		System.out.println(p.getInfo());
		
		System.out.println(c1.getInfo());
		System.out.println(c2.getInfo());
		System.out.println(c3.getInfo());
		System.out.println("\n---------------------------------------�����ķָ���---------------------------------------\n");
		// �ڶ������󶨹�ϵ�������Խ��
		p.setCities(new City[]{c1,c2,c3}); // ����ʡ��������Щ������
		
		c1.setProvince(p); // ���ó��������ĸ�ʡ��
		c2.setProvince(p); // ���ó��������ĸ�ʡ��
		c3.setProvince(p); // ���ó��������ĸ�ʡ��
		
		// ����ʡ���ҵ����г���
		City cities[] = p.getCities() ; // ��ȡ����ʡ��(p)�����г���
		System.out.println("һ�Զ�==>\n\tʡ����Ϣ:" + p.getInfo());
		for(int a = 0 ; a < cities.length ; a++){ // ��������
			System.out.println("\t\t" + cities[a].getInfo()); // ���������Ϣ
		}
		
		// ���ݳ����ҵ���ʡ����Ϣ
		System.out.println("���һ==>");
		System.out.println("\t������Ϣ:" + c1.getInfo() + "\n\t\t��Ӧʡ��==>" + c1.getProvince().getInfo());
		System.out.println("\t������Ϣ:" + c2.getInfo() + "\n\t\t��Ӧʡ��==>" + c2.getProvince().getInfo());
		System.out.println("\t������Ϣ:" + c3.getInfo() + "\n\t\t��Ӧʡ��==>" + c3.getProvince().getInfo());
	}
}
/**
 * ʡ��
 * @author Ewonen-PC
 *
 */
class Province{
	private int pid ;
	private String name ;
	private City[] cities = null ; // һ��ʡ�ݰ����������
	public Province (int pid , String name){
		this.pid = pid ;
		this.name = name ;
	}
	public void setCities(City[] cities) {
		this.cities = cities ;
	}
	public City[] getCities(){
		return this.cities ;
	}
	public void setPid (int pid) {
		this.pid = pid ;
	}
	public int getPid() {
		return this.pid ;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return this.name ;
	}
	public String getInfo() {
		return "ʡ�ݱ�ţ�" + this.pid + " | ʡ�����ƣ�" + this.name ;
	}
}
/**
 * ����
 * @author Ewonen-PC
 *
 */
class City{
	private int cid ;
	private String name ;
	private Province province ; // һ������ֻ������һ��ʡ��
	public City(int cid, String name) {
		this.cid = cid ;
		this.name = name ;
	}
	public void setProvince(Province province){
		this.province = province ;
	}
	public Province getProvince(){
		return this.province ;
	}
	public void setCid(int cid){
		this.cid = cid ;
	}
	public int getCid(){
		return this.cid ;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return this.name ;
	}
	public String getInfo() {
		return "���б�ţ�" + this.cid + " | �������ƣ�" + this.name ;
	}
}
