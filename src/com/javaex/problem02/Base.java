package com.javaex.problem02;

public class Base {
    
    public void service(String state) {
        if(state.equals("낮")) {
        	this.day();
        }
        else if(state.equals("밤")) {
        	this.night();
        }
        else if(state.equals("오후")){
        	this.afternoon();
        }
    	
        //코드작성
    }

    public void day() {
        System.out.println("낮에는 열심히 일하자");
    }

    public void night() {
       System.out.println("night"); //
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }

}
