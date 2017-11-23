package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 下午2:51:06
*describ 
*/
class Apple implements Discountable {
	private double unitPrice;
	private double weight;
	private Discountor discountor;
	public Apple(double unitPrice, double weight, Discountor discountor) {
		super();
		this.unitPrice = unitPrice;
		this.weight = weight;
		this.discountor = discountor;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Discountor getDiscountor() {
		return discountor;
	}
	public void setDiscountor(Discountor discountor) {
		this.discountor = discountor;
	}
	@Override
	public void disSell() {
		discountor.disDetailSell(this);
	}
	
}
