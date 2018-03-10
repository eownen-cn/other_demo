package org.java.referenc;

public class Demo07 {
	public static void main(String[] args) {
		
		// 第一步:产生各自的对象，并测试基础类的完善情况
		Province p = new Province(10010,"河北") ; // 创建一个省份
		
		// 创建三个城市
		City c1 = new City(10011,"秦皇岛") ;
		City c2 = new City(10012,"张家口") ;
		City c3 = new City(10013,"唐山") ;
		
		// 测试各自数据是否完善
		System.out.println(p.getInfo());
		
		System.out.println(c1.getInfo());
		System.out.println(c2.getInfo());
		System.out.println(c3.getInfo());
		System.out.println("\n---------------------------------------华丽的分割线---------------------------------------\n");
		// 第二部：绑定关系，并测试结果
		p.setCities(new City[]{c1,c2,c3}); // 设置省份中有哪些个城市
		
		c1.setProvince(p); // 设置城市属于哪个省份
		c2.setProvince(p); // 设置城市属于哪个省份
		c3.setProvince(p); // 设置城市属于哪个省份
		
		// 根据省份找到所有城市
		City cities[] = p.getCities() ; // 获取到该省份(p)下所有城市
		System.out.println("一对多==>\n\t省份信息:" + p.getInfo());
		for(int a = 0 ; a < cities.length ; a++){ // 遍历城市
			System.out.println("\t\t" + cities[a].getInfo()); // 输出城市信息
		}
		
		// 根据城市找到其省份信息
		System.out.println("多对一==>");
		System.out.println("\t城市信息:" + c1.getInfo() + "\n\t\t对应省份==>" + c1.getProvince().getInfo());
		System.out.println("\t城市信息:" + c2.getInfo() + "\n\t\t对应省份==>" + c2.getProvince().getInfo());
		System.out.println("\t城市信息:" + c3.getInfo() + "\n\t\t对应省份==>" + c3.getProvince().getInfo());
	}
}
/**
 * 省份
 * @author Ewonen-PC
 *
 */
class Province{
	private int pid ;
	private String name ;
	private City[] cities = null ; // 一个省份包含多个城市
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
		return "省份编号：" + this.pid + " | 省份名称：" + this.name ;
	}
}
/**
 * 城市
 * @author Ewonen-PC
 *
 */
class City{
	private int cid ;
	private String name ;
	private Province province ; // 一个城市只能属于一个省份
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
		return "城市编号：" + this.cid + " | 城市名称：" + this.name ;
	}
}
