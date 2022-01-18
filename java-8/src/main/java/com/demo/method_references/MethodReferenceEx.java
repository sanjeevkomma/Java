package com.demo.method_references;

@FunctionalInterface
interface Sayable {  
	
    int say(int i );  
    
}  
public class MethodReferenceEx { 
	
    public static int saySomething(int i ) { 
    	
        System.out.println("Hello, this is static method" + i );  
        
        return i; 
    }  
    
    public static void main(String[] args) {
    	
        // Referring static method  
        Sayable sayable = MethodReferenceEx :: saySomething ;  
        
        // Calling interface method  
        sayable.say(10);  
    }  
}  