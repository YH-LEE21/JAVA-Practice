package Q2;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		
		order.order_num = "20190721001";
		order.order_id = "abc123";
		order.order_date="2019년 7월 21일";
		order.name = "이요한";
		order.order_presentNum = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호:"+order.order_num);
		System.out.println("주문 아이디:"+order.order_id);
		System.out.println("주문 날짜:"+order.order_date);
		System.out.println("주문자 이름:"+order.name);
		System.out.println("주문 상품 번호:"+order.order_presentNum);
		System.out.println("배송 주소:"+order.address);
	}

}
