package org.dimigo.exception;

public class AgeCheckException extends Exception{
	
	public AgeCheckException(Movie msg) { 
 		super(msg.getTitle()+"은/는"+msg.getLimitAge()+"세 이상 관람가입니다.");
 	} 

}
