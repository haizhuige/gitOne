package com.forezp;

public class Programmer {
    private String name;
    private String age;
    private String home;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getHome() {
		return home;
	}
	public void setHome(String home) {
		this.home = home;
	}
	public Programmer(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}
	public Programmer() {
		
	}
}
