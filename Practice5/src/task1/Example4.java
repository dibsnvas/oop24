package task1;

import java.util.*;


public class Example4
{
    public static void main(String[] args){
       double leftOperand=0.0, result = 0.0, rightOperand=0.0;
       String leftString, operator, rightString;
       
       Scanner in = new Scanner(System.in);
       StringTokenizer tokenizer, spaceTokenizer;
       spaceTokenizer = new StringTokenizer(in.nextLine(), " ", false);
       
       
       while(spaceTokenizer.hasMoreTokens()) {
    	   tokenizer = new StringTokenizer(spaceTokenizer.nextToken(), "+-/*", true); 
    	   try{
    		   leftString = tokenizer.nextToken();
    	       operator = tokenizer.nextToken();
    	       rightString = tokenizer.nextToken();
    	         
    	       try {
    	    	   leftOperand = Double.parseDouble(leftString);
    	       }catch(NumberFormatException nfe) {
    	    	   System.out.println("First operand is not a number");
    	       }
    	       try {
    	    	   rightOperand = Double.parseDouble(rightString);
    	       }catch(NumberFormatException nfe) {
    	    	   System.out.println("Second operand is not a number");
    	       }

    	       if (operator.equals("+"))
    	    	   result = leftOperand + rightOperand;
    	       else if (operator.equals("-"))
    	    	   result = leftOperand - rightOperand;
    	       else if (operator.equals("*"))
    	    	   result = leftOperand * rightOperand;
    	       else if (operator.equals("/"))
    	    	   result = leftOperand / rightOperand;
    	           if(Double.isInfinite(result)) {
    	        	   throw new ArithmeticException();
    	           }

    	       System.out.println("Result: " + result);
    	       }
    	   catch (NoSuchElementException nsee){
    		   System.out.println("Invalid syntax");
    	   }catch (NumberFormatException nfe){
    	       System.out.println("One or more operands is not a number");
    	   }catch (ArithmeticException ae){
    	       System.out.println("Error: Divide by 0");
    	   }
       }   


    }
}
