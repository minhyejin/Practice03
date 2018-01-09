package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
       
        for(int i=0; i<friendArray.length; i++ ) {
        	  String info =sc.nextLine();
        	String [] input = info.split(" ");
        	Friend fr =new Friend();
        	
        	fr.setName(input[0]);
        	fr.setHp(input[1]);
        	fr.setSchool(input[2]);
        	
        	friendArray[i]=fr;
        } 

        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
