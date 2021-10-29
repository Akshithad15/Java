package spring.assignment;

import org.springframework.stereotype.Component;

@Component("day")
public class GoodDayGreeting implements Greeting {
	
	String greeting;
	
	GoodDayGreeting() {
		this.greeting = "Have a Good Day";
	}
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String greet() {
		// TODO Auto-generated method stub
		return greeting;
	}

}
