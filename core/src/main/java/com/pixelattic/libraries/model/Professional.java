package com.pixelattic.libraries.model;

import java.util.List;

public class Professional {
	private String name;
	private String email;
private String password;
	private String activationCode;
	private boolean isValidUser;
	private String city;
	private char gender;
	private ProfessionalType type;
	private	long dateTimeOfJoining;
	private String exactAddress;
	private Quotation quotation; 
	private String about;
	private String specialty;
	private String contact;
	private boolean isNumberVerified;
	private String website;
	private String fbPageLink;
	private String behanceLink;
	private Rating rating;
	private Review review;
	private int likes;
	private int views;
	private int photocount;
	private int videoCount;
	private List<Photo> photoList;
    private List<Video> videoList;
    public void setName(String name){
    	this.name=name;
    }
    public void setEmail(String email){
    	this.email=email;
    }
    public void setPassword(String password){
    	this.password=password;
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
    public void setgender(char gender){
    	this.gender=gender;
    }
    public void setType(ProfessionalType type){
    	this.type=type;
    }
    public void setDateTimeOfJoining(long dateTimeOfJoining){
    	this.dateTimeOfJoining=dateTimeOfJoining;
    }
    public void setExactAddress(String exactAddress){
    	this.exactAddress=exactAddress;
    }
    public void setQuotation(Quotation quotation){
    	this.quotation=quotation;
    }
    public void setAbout(String about){
    	this.about=about;
    }
    public void setContact(String contact){
    	this.contact=contact;
    }
    public void setIsNumberVerified(boolean isNumberVerified){
    	this.isNumberVerified=isNumberVerified;
    }
    public void setWebsite(String website){
    	this.website=website;
    }
    public void setFBPageLink(String fbPageLink){
    	this.fbPageLink=fbPageLink;
    }
    public void setBehanceLink(String behanceLink){
    	this.behanceLink=behanceLink;
    }
    public void setRating(Rating rating){
    	this.rating=rating;
    }
    public void setReview(Review review){
    	this.review= review;
    }
    public void setLikes(int likes){
    	this.likes=likes;
    }
    public void setPhotocount(int Photocount){
    	this.photocount=Photocount;
    }
    public void setVideoCount(int videoCount){
    	this.videoCount=videoCount;
    }
    public void setPhotoList(List<Photo> photoList){
    	this.photoList=photoList;
    }
    public void setVideoList(List<Video> videoList){
    	this.videoList=videoList;
    }
    public void setViews(int views){
    	this.views=views;
    }
    public String getName(){
    	return name;
    }
    public String getEmail(){
    	return email;
    }
    public String getPassword(){
    	return password;
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
    public char getGender(){
    	return gender;
    }
    public ProfessionalType getType(){
    	return type;
    }
    public long getDateTimeOfJoining(){
    	return dateTimeOfJoining;
    }
    public Quotation getQuotation(){
    	return quotation;
    }
    public String getExactAddress(){
    	return exactAddress;
    }
    public String getSpecialty(){
    	return specialty;
    }
    public String getContact(){
    	return contact;
    }
    public boolean getIsNumberVerified(){
    	return isNumberVerified;
    }
    public String getWebsite(){
    	return website;
    }
    public String getFBPageLink(){
    	return fbPageLink;
    }
    public String getBehanceLink(){
    	return behanceLink;
    }
    public Rating getRating(){
    	return rating;
    }
    public Review getReview(){
    	return review;
    }
    public int getLikes(){
    	return likes;
    }
    public int getViews(){
    	return views;
    }
    public int getPhotoCount(){
    	return photocount;
    }
    public int getVideoCount(){
    	return videoCount;
    }
    public List<Photo> getPhotoList(){
    	return photoList;
    } 
    public List<Video> getVideoList(){
    	return videoList;
    }
    public String getAbout(){
    	return about;
    }
}
