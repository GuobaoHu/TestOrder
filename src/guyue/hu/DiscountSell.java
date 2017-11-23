package guyue.hu;

import java.math.BigDecimal;

/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 下午1:33:22
*describ 
*/
public class DiscountSell {
	
	public static void main(String[] args) {
		Apple a = new Apple(9.5, 5);
		Banana b = new Banana(12.3, 4);
		Market.discountS(a);
		Market.discountS(b);
	}
	
}

interface Discountable {
	void discountSell();
}

class Market {
	public static void discountS(Discountable d) {
		d.discountSell();
	}
}

class Apple implements Discountable {
	
//	public final static String name = "Apple";
	private double weight, unitPrice;

	public Apple(double weight, double unitPrice) {
		super();
		this.weight = weight;
		this.unitPrice = unitPrice;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public void discountSell() {
		double totalPrice = weight * unitPrice * 0.85;
		System.out.println("Apple 八五折出售，总价：" + totalPrice);
	}
	
}

class Banana implements Discountable {
	private double weight, unitPrice;

	public Banana(double weight, double unitPrice) {
		super();
		this.weight = weight;
		this.unitPrice = unitPrice;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	@Override
	public void discountSell() {
		double totalPrice = weight * unitPrice * 0.9;
		System.out.println("Banana 九折出售，总价：" + totalPrice);
	}
}
