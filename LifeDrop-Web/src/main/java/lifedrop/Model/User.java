package lifedrop.Model;

public class User{
	private String name;
	private String email;
	private String password;
	private String confirm;
	
	
	
	
	
	public User(String name, String email, String password, String confirm) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirm = confirm;
	}





	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getEmai() {
		return email;
	}





	public void setEmai(String email) {
		this.email = email;
	}





	public String getPassword() {
		return password;
	}





	public void setPassword(String password) {
		this.password = password;
	}





	public String getConfirm() {
		return confirm;
	}





	public void setConfirm(String confirm) {
		this.confirm = confirm;
	}





	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", confirm=" + confirm + "]";
	}
	
	
	
	
}
