package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 ����ʱ��:2017��11��23�� ����3:10:12
*describ 
*/
class AppleWeightDiscount implements Discountor {

	@Override
	public void disDetailSell(Discountable d) {
		Apple a = (Apple) d;
		if(a.getWeight() < 10) {
			System.out.println("10kg����ԭ��:" + a.getUnitPrice() * a.getWeight());
		} else if(a.getWeight() < 20) {
			System.out.println("10kg����9��:" + a.getUnitPrice() * a.getWeight() * 0.9);
		} else {
			System.out.println("20kg����8��:" + a.getUnitPrice() * a.getWeight() * 0.8);
		}
	}
	
}
