package com.qa.pahub;

public class ConceptsOfEncapsulation {
	
	
	// private variable : so that these variables can not be accessed from outside the class
	
	private int sNo;
	private String name;
	private int ssn;
	
	public static void main(String[] args) {
		ConceptsOfEncapsulation encaps = new ConceptsOfEncapsulation();
		encaps.setsNo(10);
		encaps.setName("sunil");
		encaps.setSsn(200);
		System.out.println(encaps.getsNo());
		System.out.println(encaps.getName());
		System.out.println(encaps.getSsn());
		
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
