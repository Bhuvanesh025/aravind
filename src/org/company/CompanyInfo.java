package org.company;

public class CompanyInfo {
public void companyName() {
	System.out.println("Company Name: ABC private limited");
}
public void companyId() {
	System.out.println("Company Id: 001");
}	
public void companyAddress() {
	System.out.println("Company Address: 96,4th floor,JVM towers,Chennai-652369");
	
}	
public static void aravind() {
	System.out.println("aravind git");
}
public static void main(String[] args) {
	CompanyInfo info = new CompanyInfo();
	info.companyName();
	info.companyId();
	info.companyAddress();
	aravind();
	
}		
}
