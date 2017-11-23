package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 创建时间:2017年11月23日 下午2:33:35
*describ 
*/
public class UserClient {
	
	public static void main(String[] args) {
		Apple a = new Apple(15.5, 15, new AppleWeightDiscount());
		Market.discountSell(a);
	}
	
}
