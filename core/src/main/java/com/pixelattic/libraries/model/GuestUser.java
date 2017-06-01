package com.pixelattic.libraries.model;

public class GuestUser {
	private String name;
	private String email;
	private String activationCode;
	private boolean isValidUser;
	private String city;
	private String exactAddress; 
	private String contact;
	private boolean isNumberVerified;
	private long dateTimeOfJoining;
	public void setName(String name){
		this.name=name;
	}
	public void setEmail(String email){
		this.email=email;
	}
	public void setActivationCode(String activationCode){
		this.activationCode=activationCode;
	}
	public void setIsValidUser(boolean isValidUser){
		this.isValidUser=isValidUser;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setDateTimeOfJoining(long dateTimeOfJoining){
		this.dateTimeOfJoining=dateTimeOfJoining;
	}
	public void setExactAddress(String exactAddress){
		this.exactAddress=exactAddress;
	}
	public void setContact(String contact){
		this.contact=contact;
	}
	public void setIsNumberVerified(boolean isNumberVerified){
		this.isNumberVerified=isNumberVerified;
	}
	public String getName(){
		return name;
	}
	public String getEmail(){
		return email;
	}
	public String getActivationCode(){
		return activationCode;
	}
	public boolean getIsValidUser(){
		return isValidUser;
	}
	public String getCity(){
		return city;
	}
	
	public long getDateTimeOfJoining(){
		return dateTimeOfJoining;
	}

	public String getExactAddress(){
		return exactAddress;
	}
	public String getContact(){
		return contact;
	}
	public boolean getIsNumberVerified(){
		return isNumberVerified;
	}
}
