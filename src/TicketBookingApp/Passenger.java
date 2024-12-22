package TicketBookingApp;

public class Passenger {
	private String seatNo;
	private String name;
	private String moNo;
	private String age;
	private String gender;

	public Passenger() {

	}

	public Passenger(String seatNo, String name, String moNo, String age, String gender) {
		this.seatNo = seatNo;
		this.name = name;
		this.moNo = moNo;
		this.age = age;
		this.gender = gender;
	}

	public String getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(String seatNo) {
		this.seatNo = seatNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMoNo() {
		return moNo;
	}

	public void setMoNo(String moNo) {
		this.moNo = moNo;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
