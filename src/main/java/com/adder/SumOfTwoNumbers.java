package com.adder;

import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * 
 * @author Aman Nahar
 *
 */
@Path("/add")
public class SumOfTwoNumbers {
	
	private static final Logger _logger = Logger.getLogger("Addition using REST API");
	
	private static FileHandler fh;
	
	public SumOfTwoNumbers() {
		init();
		_logger.log(Level.INFO, "Constructor Rest API");
	}
	public static void init() {
		try {
			fh = new FileHandler("C:/Users/Naman's Beast/OneDrive/Desktop/Adder/Adder/LogFiles/output.log", true);
			_logger.addHandler(fh);
			SimpleFormatter formatter = new SimpleFormatter();
			fh.setFormatter(formatter);
			_logger.info("Logger Initialized");
		}catch(Exception e) {
			_logger.log(Level.WARNING, "Exception ::", e);
		}
	}
	@GET
	@Path("/{a},{b}")
	public String sumOfTwo(@PathParam("a") double a1, @PathParam("b") double b1) {
		double sum = a1 + b1;
		_logger.info("Sum of Two numbers is " + sum);
		fh.close();
		return "Sum of Two numbers is " + sum;
	}
	
}
