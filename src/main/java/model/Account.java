package model;

public class Account {
private String user,pwd;
private int role;
private String name , address, phone;
private int check;

public Account() {
	super();
}
public Account(String user) {
	super();
	this.user = user;
}
public Account(String user, String pwd, int role, String name, String address, String phone, int check) {
	super();
	this.user = user;
	this.pwd = pwd;
	this.role = role;
	this.name = name;
	this.address = address;
	this.phone = phone;
	this.check = check;
}
public String getUser() {
	return user;
}
public void setUser(String user) {
	this.user = user;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public int getRole() {
	return role;
}
public void setRole(int role) {
	this.role = role;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getCheck() {
	return check;
}
public void setCheck(int check) {
	this.check = check;
}

}
