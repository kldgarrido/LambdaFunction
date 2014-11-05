package lambda;


public class MyLambda {
	
	public static void main(String[] args) {
		MyLambda myLambda = new MyLambda();
		myLambda.function1("Kaled");
	}
	
	interface Greeting{
		String operation(String name);
	}
	
	public void function1(String name){
		Greeting greeting = (a) -> "My name is "+name;
		Greeting greeting2 = (a) -> "My full name is "+name+" Garrido Fiallo";
		System.out.println(greeting.operation(name));
		System.out.println(greeting2.operation(name));
	}

}
