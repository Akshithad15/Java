package spring.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GreetingService {
	
	@Autowired
	@Qualifier("day")
	Greeting greet;
	
	public Greeting getGreet() {
		return greet;
	}

	public void setGreet(Greeting greet) {
		this.greet = greet;
	}

	public String printGreeting() {
		System.out.println(greet.greet());
		System.out.println("Service working");
		return null;
	}
}
