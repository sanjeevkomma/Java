package com.demo.method_references;

@FunctionalInterface
interface Sayable {  
	
    Integer say(Integer i );  
    
}  

public class MethodReference_To_StaticMethod{ 
	
    public static Integer saySomething( Integer number ) { 
    	
        System.out.println("Hello, this is static method " + number );  
        
        return number; 
    }  
    
    public static void main(String[] args) {
    	
        // Referring static method  
        Sayable sayable =  MethodReference_To_StaticMethod :: saySomething ;  
        
        // Calling interface method  
        System.out.println( sayable.say(10) );  
    }  
}  