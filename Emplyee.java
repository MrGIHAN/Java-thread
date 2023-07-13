package thread;

import java.util.Scanner;

public class Emplyee {

	String Empid,name,address;
	
	public Emplyee(String Empid,String name,String address) {
		this.Empid = Empid;
		this.name = name;
		this.address = address;
	}
	
	public void setname(String name) {
		this.name = name;
	}
	public void setEmpid(String Empid) {
		this.Empid = Empid;
	}
	public void setaddress(String address) {
		this.address = address;
	}
	
	
	public String getname() {
		return name;
	}
	public String getEmpid() {
		return Empid;
	}
	public String getaddress() {
		return address;
	}
	
	
	public void Reade() {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter your Employee ID : ");
		Empid = sc.next();
		System.out.println("Enter your name : ");
		name = sc.next();
		System.out.println("Enter your address : ");
		name = sc.next();
	}
	
	public void print() {
		System.out.println("Employee ID : "+Empid+"\nEmployee Name"+name+"\nEmployee Address : "+address);
	}
}
