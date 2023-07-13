package thread;

import java.util.Scanner;

public class Manager extends Emplyee {

	String Department;
	int ProductNo1,ProductNo2,ProductNo3;
	
	public Manager(String Empid, String name, String address, String Department,int ProductNo1,int ProductNo2,int ProductNo3) {
		super(Empid, name, address);
		this.Department = Department;
		this.ProductNo1 = ProductNo1;
		this.ProductNo2 = ProductNo2;
		this.ProductNo2 = ProductNo3;
	}
	


	public int getProductNo3() {
		return ProductNo3;
	}



	public void setProductNo3(int productNo3) {
		ProductNo3 = productNo3;
	}



	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public int getProductNo1() {
		return ProductNo1;
	}

	public void setProductNo1(int productNo1) {
		ProductNo1 = productNo1;
	}

	public int getProductNo2() {
		return ProductNo2;
	}

	public void setProductNo2(int productNo2) {
		ProductNo2 = productNo2;
	}
	
	public void Reade() {
		super.Reade();
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter your Department : ");
		Department = sc.next();
		
		try {
			
			System.out.print("Enter your ProductNo1 : ");
			ProductNo1 = sc.nextInt();
			
			System.out.print("Enter your ProductNo2 : ");
			ProductNo2 = sc.nextInt();
			
			System.out.print("Enter your ProductNo3 : ");
			ProductNo3 = sc.nextInt();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}



	public void print() {
			super.print();
			System.out.println("");
		}
	


}
