package Details;

public class ModelForREgistration {
	private String Name;
	private String Email;
	private String Address;
	private String Gender;
	private String ProgramSkills;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public ModelForREgistration(String name, String email, String address, String gender, String programSkills) {
		super();
		Name = name;
		Email = email;
		Address = address;
		Gender = gender;
		ProgramSkills = programSkills;
	}
	public String getProgramSkills() {
		return ProgramSkills;
	}
	public void setProgramSkills(String programSkills) {
		ProgramSkills = programSkills;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	@Override
	public String toString() {
		return "ModelForREgistration [Name=" + Name + ", Email=" + Email + ", Address=" + Address + ", Gender=" + Gender
				+ ", ProgramSkills=" + ProgramSkills + "]";
	}
	
	

}
