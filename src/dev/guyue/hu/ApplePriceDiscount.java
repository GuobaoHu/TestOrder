package dev.guyue.hu;
/**
*@author guyue E-mail:398456458@qq.com
*version1.0 ����ʱ��:2017��11��23�� ����3:05:42
*describ 
*/
class ApplePriceDiscount implements Discountor {

	@Override
	public void disDetailSell(Discountable d) {
		// TODO Auto-generated method stub
		Apple a = (Apple) d;
		if(a.getUnitPrice() * a.getWeight() < 100) {
			System.out.println("100����ԭ�ۣ�" + (a.getUnitPrice() * a.getWeight()));
		} else if( a.getUnitPrice() * a.getWeight() < 200) {
			System.out.println("�ۿۣ���100��10����" + (a.getUnitPrice() * a.getWeight() - 10));
		} else {
			System.out.println("�ۿۣ���200��25����" + (a.getUnitPrice() * a.getWeight() - 25));
		}
	} 
	
}
