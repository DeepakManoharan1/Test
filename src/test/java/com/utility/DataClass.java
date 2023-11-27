package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataClass {
public String url,Billno,Email,CardNumber,Expiry,CVC,Zipcode,Component,Message;
	
	public DataClass(){
		data();
	}
	public void data() {
		File file = new File("C:\\Git\\Test\\Test\\smartHospital\\src\\test\\resources\\data.properties");
		FileInputStream fio =null;
		try {
			fio = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		Properties prop = new Properties();
		try {
			prop.load(fio);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		url = prop.getProperty("url");
		Billno = prop.getProperty("Billno");
		Email = prop.getProperty("Email");
		CardNumber = prop.getProperty("CardNumber");
		Expiry = prop.getProperty("Expiry");
		CVC = prop.getProperty("CVC");
		Zipcode = prop.getProperty("Zipcode");
		Component = prop.getProperty("Component");
		Message = prop.getProperty("Message");
		
	}

}
