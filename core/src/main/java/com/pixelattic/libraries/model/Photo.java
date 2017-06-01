package com.pixelattic.libraries.model;

import org.bson.types.ObjectId;

public class Photo {
	private String nameOfFile;
	private long size;
	private String fileId;
	private long dateTimeUploaded;
	private int likes;
	private ObjectId professionalId;
public void setNameofFile(String nameOfFile){
	this.nameOfFile=nameOfFile;
}
public void setSize(long size){
	this.size=size;
}
public void setFileId(String fileId){
	this.fileId=fileId;
}
public void setDateTimeUploaded(long dateTimeUploaded){
	this.dateTimeUploaded=dateTimeUploaded;
}
public void setLikes(int likes){
	this.likes=likes;
}
public void setProfessionalId(ObjectId professionalId){
	this.professionalId=professionalId;
}
public String getNameOfFile(){
	return nameOfFile;
}
public long getSize(){
	return size;
}
public String getFileId(){
	return fileId;
}
public long getDateTimeUploaded(){
	return dateTimeUploaded;
}
public int getLikes(){
	return likes;
}
public ObjectId getProfessionalId(){
	return professionalId;
}
}
