package Coffee;

public class StarCoffee{
	public int money;
	
	public String buy(int money) {
		this.money += money;
		if(this.money == Menu.StarAmericano) {
			return "별 다방 아메리카노를 구입했습니다.";
		}
		else if(this.money ==Menu.StarLatte) {
			return "별 다방 라떼를 구입했습니다.";
		}
		else {
			return null;
		}
	}
}
