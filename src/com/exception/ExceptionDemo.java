package com.exception;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp2.SQLExceptionList;

import com.sun.org.apache.bcel.internal.generic.ArithmeticInstruction;

public class ExceptionDemo {
	
	public static void main(String[] args) {
		
		try{
			
			 int a[]=new int[5];    
             
             System.out.println(a[10]);  
            }    
		
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Arthmetic Exception");
		}
		
		catch(Exception b) {
			
			System.out.println("Exception Handled");
			
		}
		finally {
			System.out.println("done");
		}
		
		}
		
		    
		}


