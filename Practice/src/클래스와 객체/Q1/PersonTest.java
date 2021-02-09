package Q3;

public class PersonTest {

	public static void main(String[] args) {
		Person James = new Person();
		James.setAge(40);
		James.setName("James");
		James.setMarried(true);
		James.setNumberOfChildren(3);
  		
		System.out.println("나이:"+James.getAge());
		System.out.println("이름:"+James.getName());
		System.out.println("결혼여부:"+James.getMarried());
		System.out.println("자녀 수:"+James.getNumberOfChildren());
	
   		Person Yohan = new Person();
    		Yohan.age = 23;
    		Yohan.name ="이요한";
    		Yohan.married = false;
    		Yohan.NumberOfChildren = 0;
    
   		System.out.println("나이:"+Yohan.getAge());
		System.out.println("이름:"+Yohan.getName());
		System.out.println("결혼여부:"+Yohan.getMarried());
		System.out.println("자녀 수:"+Yohan.getNumberOfChildren());
	
	}

}
