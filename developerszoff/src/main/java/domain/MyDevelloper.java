package domain;

import java.time.LocalDate;

public class MyDevelloper {
	private int developperid;
	private String nickName;
	private String lastName;
	private String firstName;
	
	
	private LocalDate birthDate;
	public MyDevelloper () {}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	
	public int getDevelopperid() {
		return developperid;
	}
	public void setDevelopperid(int developperid) {
		this.developperid = developperid;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return nickName + " " +lastName+" "+birthDate +"" ;
	}
	
	
}
