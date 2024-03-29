package com.javaex.ex04;

public class Base {
	

    
        //코드작성할것
    private String day;
    private String night;
    private String afternoon;
      
    public String getday() {
		return day;
	}
    public String getnight() {
		return night;
	}
    public String getafternoon() {
		return afternoon;
	}
    
    public void setday(String day) {
		this.day = day;
	}
    public void setnight(String night) {
		this.night = night;
	}
    public void setafternoon(String afternoon) {
		this.afternoon = afternoon;
	}
    

    public void day() {
    	if(day=="낮")
        System.out.println("낮에는 열심히 수업듣자");
    }
   

    public void night() { 
    	//코드작성할것
    	if(night == "밤")
    
    	System.out.println("밤에는 숙면");
      }
    	
    
    public void afternoon(){
    	  if(afternoon=="오후") {
    	  	System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");    	  	
    	  }
    	  
    }
    	public void service() {
    		System.out.printf("낮");
    	}
    }

