package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 ����ʱ��:2017��11��23�� ����2:33:35
*describ 
*/
public class UserClient {
	
	public static void main(String[] args) {
		Apple a = new Apple(15.5, 15, new AppleWeightDiscount());
		Market.discountSell(a);
	}
	
}
