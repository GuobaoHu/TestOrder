package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 下午3:10:12
*describ 
*/
class AppleWeightDiscount implements Discountor {

	@Override
	public void disDetailSell(Discountable d) {
		Apple a = (Apple) d;
		if(a.getWeight() < 10) {
			System.out.println("10kg以下原价:" + a.getUnitPrice() * a.getWeight());
		} else if(a.getWeight() < 20) {
			System.out.println("10kg以上9折:" + a.getUnitPrice() * a.getWeight() * 0.9);
		} else {
			System.out.println("20kg以上8折:" + a.getUnitPrice() * a.getWeight() * 0.8);
		}
	}
	
}
