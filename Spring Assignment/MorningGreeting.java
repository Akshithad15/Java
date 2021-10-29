package spring.assignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("morning")
//@Primary
public class MorningGreeting implements Greeting {

	String greeting;
	
	MorningGreeting() {
		this.greeting = "Good Morning";
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
