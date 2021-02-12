package Coffee;

public class BeanCoffee{

	public int money;
	
	public String buy(int money) {
		this.money += money;
		if(this.money == Menu.BeanAmericano) {
			return "콩 다방 아메리카노를 구입했습니다.";
		}
		else if(this.money == Menu.BeanLatte) {
			return "콩 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
