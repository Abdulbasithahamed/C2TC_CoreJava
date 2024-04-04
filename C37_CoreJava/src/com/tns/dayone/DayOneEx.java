package com.tns.dayone;

public class DayOneEx {

	private String name;
	private int age;
	private int runs;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs =runs;
	}
	public String toString() {
		return "CSK Name="+name+",Age="+age+",Runs="+runs+"";	
	}
	
	public static void main(String[] args) {
		DayOneEx n=new DayOneEx();
		n.setName("Dhoni");
		n.setAge(20);
		n.setRuns(90);
		
		System.out.println(n);
		
		
		
	} 
	
}
