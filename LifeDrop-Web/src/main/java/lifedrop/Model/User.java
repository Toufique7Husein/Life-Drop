package lifedrop.Model;

public class User{
	private String name;
	private String emai;
	private String password;
	private String confirm;
	
	
	
	
	
	public User(String name, String emai, String password, String confirm) {
		super();
		this.name = name;
		this.emai = emai;
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
		return emai;
	}





	public void setEmai(String emai) {
		this.emai = emai;
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
		return "User [name=" + name + ", emai=" + emai + ", password=" + password + ", confirm=" + confirm + "]";
	}
	
	
	
	
}
