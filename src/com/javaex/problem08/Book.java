package com.javaex.problem08;

public class Book {
    int bookNo;
    String title;
    String author;
    int stateCode;
	
    public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author=author;
		this.stateCode =1;
	}
    public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCode() {
		return stateCode;
	}
	
	public void rent() {
    	System.out.println(title+"대여 되었습니다.");
    }
    public void print() {
    	if(stateCode==0) {
    		System.out.println("대여중");
    	}else if(stateCode==1) {
    		System.out.println("재고있음");
    	}
    	
    	
    }
    
    
    
    
}
