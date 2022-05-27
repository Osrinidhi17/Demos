package in.hcl.demo2;

public class TestGreetingWithoutJava8 {
//miniming object creation work
	public static void main(String[] args) {
	Greeting morningGreeting =()->System.out.println("Hi Good Morning");
	
	morningGreeting.greet();
	System.out.println(morningGreeting);
	
	Greeting eveningGreeting =()->System.out.println("Hi Good Evening");
         eveningGreeting.greet();
         System.out.println(eveningGreeting);
	}
}
