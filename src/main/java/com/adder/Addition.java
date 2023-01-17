package com.adder;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
 
/**
  * 
  * @author Aman Nahar
  *
  */

@ManagedBean(name= "addition", eager = true)
@RequestScoped
public class Addition {
	
	private static final Logger _logger = Logger.getLogger("Adder");
	private double _param1;
	private double _param2;
	private double _sum;

	
	public Addition() {
		_logger.log(Level.INFO, "Constructor Adder");
	}


	public double get_param1() {
		return _param1;
	}


	public void set_param1(double _param1) {
		this._param1 = _param1;
	}


	public double get_param2() {
		return _param2;
	}


	public void set_param2(double _param2) {
		this._param2 = _param2;
	}


	public double get_sum() {
		return _sum;
	}


	public void set_sum(double _sum) {
		this._sum = _sum;
	}
	
	public String add() {
		_sum = _param1 + _param2;
		return "";
	}


	@Override
	public String toString() {
		return "Addition [_param1=" + _param1 + ", _param2=" + _param2 + ", _sum=" + _sum + "]";
	}
	
}
