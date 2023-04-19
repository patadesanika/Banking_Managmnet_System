
public class Accholder { 
	private String full_name;
	private String father_name;
	private String  mother_name;
	private int Dob;
	private String city;
	private String Dist;
	private long  mob_no;
	private String gender;
	public Accholder(String full_name, String father_name, String mother_name, int dob, String city, String dist,
			long mob_no, String gender) {
		super();
		this.full_name = full_name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		Dob = dob;
		this.city = city;
		Dist = dist;
		this.mob_no = mob_no;
		this.gender = gender;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getFather_name() {
		return father_name;
	}
	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}
	public String getMother_name() {
		return mother_name;
	}
	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}
	public int getDob() {
		return Dob;
	}
	public void setDob(int dob) {
		Dob = dob;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDist() {
		return Dist;
	}
	public void setDist(String dist) {
		Dist = dist;
	}
	public long getMob_no() {
		return mob_no;
	}
	public void setMob_no(long mob_no) {
		this.mob_no = mob_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	

}
