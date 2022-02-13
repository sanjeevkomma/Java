package com.demo.method_references;

@FunctionalInterface
interface Sayable {  
	
    int say(int i );  
    
}  
public class MethodReferenceToStaticMethod { 
	
    public static int saySomething(int number ) { 
    	
        System.out.println("Hello, this is static method " + number );  
        
        return number; 
    }  
    
    public static void main(String[] args) {
    	
        // Referring static method  
        Sayable sayable = MethodReferenceToStaticMethod :: saySomething ;  
        
        // Calling interface method  
        sayable.say(10);  
    }  
}  