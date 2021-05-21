
public class Player {

	private String tcNo;
	private String name;
	private String surname;
	private String birthYear;
	
	public Player() {
		
	}
	public Player(String tcNo, String name, String surname, String birthYear) {
		super();
		this.tcNo = tcNo;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
	}
	
	public String getTcNo(){return tcNo;}
	public void setTcNo(String tcNo){this.tcNo = tcNo;}
	public String getName(){return name;}
	public void setName(String name){this.name = name;}
	public String getSurname(){return surname;}
	public void setSurname(String surname){this.surname = surname;}
	public String getBirthYear(){return birthYear;}
	public void setBirthYear(String birthYear){this.birthYear = birthYear;}
	
	
	
}
