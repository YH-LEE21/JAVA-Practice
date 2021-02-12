package Coffee;

public class Person {
	public String name;
	public int money;
	
	public Person(String name,int money) {
		this.name = name;
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee sCoffee,int money){
		String message = sCoffee.buy(money);
		if(message != null) {
			this.money -= money;
			System.out.println(this.name+"님이 "+money+"원으로 "+message);
		}
		else {
			System.out.println("바보");
		}
	}
	public void buyBeanCoffee(BeanCoffee bCoffee,int price) {
		String message = bCoffee.buy(money);
		if(message != null) {
			this.money -= money;
			System.out.println(this.name+" 님이"+money+" 원으로"+message);
		}
		else {
			System.out.println("바보");
		}
	}
}
