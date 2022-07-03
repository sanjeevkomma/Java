package com.demo.lambda_expression;

@FunctionalInterface  // It is optional  
interface Drawable { 
	
    public String draw(String str);  
    
}  
  
public class LambdaExpression_Ex {  
	
    public static void main( String[] args ) {  
    	
        Drawable d1 = new Drawable() {
        	
        	public String draw(String str) {
        		
        		return str; 
        		
        	}
        }; 
        
        System.out.println( d1.draw("Anonymous class") ) ;
          
        // with Lambda  
        Drawable d = ( String str ) ->   // {
        	
        	str = str + " JJJ";
        	
           // return str;  // return stmt not needed if single stmt in body
            
       // }
    ;  
        
        System.out.println( d.draw("Lamba") ) ; 
    }  
}  

