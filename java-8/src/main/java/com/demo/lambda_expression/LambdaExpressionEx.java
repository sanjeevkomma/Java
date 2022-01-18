package com.demo.lambda_expression;

@FunctionalInterface  //It is optional  
interface Drawable { 
	
    public String draw(String str);  
    
}  
  
public class LambdaExpressionEx {  
	
    public static void main(String[] args) {  
    	
        Drawable d1 = new Drawable() {
        	
        	public String draw(String str) {
        		
        		return str; 
        		
        	}
        }; 
        
        System.out.println( d1.draw("Anonymous class") ) ;
          
        //with lambda  
        Drawable d2 = (String ss) -> {  
        	
            return ss;
            
        };  
        
        System.out.println( d2.draw("Lamba") ) ; 
    }  
}  

