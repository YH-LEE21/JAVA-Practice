package Coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person kim = new Person("kim", 10000);
		Person lee = new Person("lee", 15000);
    
		StarCoffee starCoffee = new StarCoffee();
		BeanCoffee beanCoffee = new BeanCoffee();
    
		kim.buyStarCoffee(starCoffee, Menu.StarAmericano);
		kim.buyBeanCoffee(beanCoffee,4500);
	}

}
