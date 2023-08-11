package com.xworkz.app;

public class Instagram {
	
	
	private int noOfmsg;
	private int req;
	private int friends;
	private int closeFriends;
	private int noOfPost;
	private String userName;
	private float minActive;
	private float netUsage;
	private String password;
	private String email;
	private int noOfUsers;
	private int dm;
	private int replies;
	private boolean isGood;
	
	public int getNoOfMsg() {
		System.out.println("no of msg"+this.noOfmsg);
		return this.noOfmsg;
	}
	
	public void setNoOfMsg(int noOfMsg) {
		
		this.noOfmsg=noOfMsg;
	}
	
	public int getReq() {
		System.out.println("no of req"+this.req);
		return this.req;
	}
	
	public void setReq(int req) {
		
		this.req=req;
	}
	
	public int getFriends() {
		System.out.println("no of freinds"+this.friends);
		return this.friends;
	}
	
	public void setfriends(int friends) {
		
		this.friends=friends;
	}
	
	public int getCloseFriends() {
		System.out.println("no of close friends"+this.closeFriends);
		return this.req;
	}
	
	public void setCloseFriends(int closeFriends) {
		
		this.closeFriends=closeFriends;
	}
	
	public int getNoOfPost() {
		System.out.println("no of posts"+this.noOfPost);
		return this.req;
	}
	
	public void setNoOfPost(int noOfPost) {
		
		this.noOfPost=noOfPost;
	}
	
	public String  getUserName() {
		System.out.println("user name"+this.userName);
		return this.userName;
	}
	
	public void setUserName(String userName) {
		
		this.userName=userName;
	}
	
	public float getMinActive() {
		System.out.println("mins active"+this.minActive);
		return this.minActive;
	}
	
	public void setMinActive(float minActive) {
		
		this.minActive=minActive;
	}
	
	public String  getPassword() {
		System.out.println("password "+this.password);
		return this.password;
	}
	
	public void setPassword(String password) {
		
		this.password=password;
	}
	
	public float getNetUsage() {
		System.out.println("net usage"+this.netUsage);
		return this.netUsage;
	}
	
	public void setNetUsage(float netUsage) {
		
		this.netUsage=netUsage;
	}
	
	public String  getEmail() {
		System.out.println("email"+this.userName);
		return this.email;
	}
	
	public void setEmail(String email) {
		
		this.email=email;
	}
	public int   getNoOfUsers() {
		System.out.println("no of users "+this.noOfUsers);
		return this.noOfUsers;
	}
	
	public void setNoOfUsers(int noOfUsers) {
		
		this.noOfUsers=noOfUsers;
	}
	
	public int getDm() {
		System.out.println("dm friends"+this.dm);
		return this.dm;
	}
	
	public void setDm(int dm) {
		
		this.dm=dm;
	}

	
	
	public int getReplies() {
		System.out.println("replies"+this.replies);
		return this.replies;
	}
	
	public void setReplies(int replies) {
		
		this.replies=replies;
	}
	
	public boolean getIsGood() {
		System.out.println("is it good"+this.isGood);
		return this.isGood;
	}
	
	public void setIsGood(boolean isGood) {
		
		this.isGood=isGood;
	}
	
	
	
}



