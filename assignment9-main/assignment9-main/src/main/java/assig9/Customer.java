package assig9;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	
	@Autowired
	@Qualifier("saving") 
	Account acc;
	
	private String name;
    private String username;
    private String password;
    private int age;
    private String ssn;
    private String address;
    private String email;
    private long phone;
    private float balance;
    
    public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(String name, String username, String password, int age, String ssn, String address, String email, long phone, float balance) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.age = age;
        this.ssn = ssn;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

	@Override
	public String toString() {
		return "Customer [acc=" + acc + ", name=" + name + ", username=" + username + ", password=" + password
				+ ", age=" + age + ", ssn=" + ssn + ", address=" + address + ", email=" + email + ", phone=" + phone
				+ ", balance=" + balance + "]";
	}

	
}
	
