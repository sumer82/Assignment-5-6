package assig9;

import org.springframework.stereotype.Component;

@Component
public class Current implements Account {

	public void showAccount() {
		System.out.println("this is current");
		
	}

	@Override
	public String toString() {
		return "Current []";
	}

}