package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 下午3:05:42
*describ 
*/
class ApplePriceDiscount implements Discountor {

	@Override
	public void disDetailSell(Discountable d) {
		// TODO Auto-generated method stub
		Apple a = (Apple) d;
		if(a.getUnitPrice() * a.getWeight() < 100) {
			System.out.println("100以下原价：" + (a.getUnitPrice() * a.getWeight()));
		} else if( a.getUnitPrice() * a.getWeight() < 200) {
			System.out.println("折扣（满100减10）：" + (a.getUnitPrice() * a.getWeight() - 10));
		} else {
			System.out.println("折扣（满200减25）：" + (a.getUnitPrice() * a.getWeight() - 25));
		}
	} 
	
}
