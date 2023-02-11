package assig9;

import org.springframework.stereotype.Component;

@Component
public class Saving implements Account {

	public void showAccount() {
		// TODO Auto-generated method stub
		System.out.println("this is saving");
	}

	@Override
	public String toString() {
		return "Saving []";
	}
	
}
