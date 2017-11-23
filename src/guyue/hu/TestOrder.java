package guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 上午10:18:17
*describ 
*/
public class TestOrder {
	
	private String name;
	private int count;
	private int unitPrice;
	private double disCount;
	public double getTotalPrice() {
		return count * unitPrice * getDisCount();
	}
	
	public double getDisCount() {
		if(count > 50) {
			disCount = 0.9;
		} else {
			disCount = 1.0;
		}
		return disCount;
	}


	/*public void setDisCount(double disCount) {
		this.disCount = disCount;
	}
*/

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	public static void main(String[] args) {
		TestOrder order = new TestOrder();
		order.setName("Apple");
		order.setCount(40);
		order.setUnitPrice(3);
		System.out.println(order.getTotalPrice());
	}

}
