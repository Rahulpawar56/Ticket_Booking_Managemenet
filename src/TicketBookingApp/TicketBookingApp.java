package TicketBookingApp;

import java.util.*;

public class TicketBookingApp {

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		LinkedHashMap<String, LinkedHashMap<String, String>> map = new LinkedHashMap<>();
		LinkedHashMap<String, String> l1 = new LinkedHashMap<>();
		l1.put("Id", "1");
		l1.put("Name", "Rahul");
		l1.put("Mo No", "9119565614");
		l1.put("Age", "22");
		l1.put("Gender", "Male");

		LinkedHashMap<String, String> l2 = new LinkedHashMap<>();
		l2.put("Id", "2");
		l2.put("Name", "Ram");
		l2.put("Mo No", "9019565614");
		l2.put("Age", "21");
		l2.put("Gender", "Male");

		LinkedHashMap<String, String> l3 = new LinkedHashMap<>();
		l3.put("Id", "3");
		l3.put("Name", "Rani");
		l3.put("Mo No", "8979565614");
		l3.put("Age", "20");
		l3.put("Gender", "Female");

		map.put("Passenger 1", l1);
		map.put("Passenger 2", l2);
		map.put("Passenger 3", l3);

	}
}
