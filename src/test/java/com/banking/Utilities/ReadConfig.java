package com.banking.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
Properties p;
public ReadConfig()
{
	File src =new File("./configurations/config.properties");
	try {
		FileInputStream fi=new FileInputStream(src);
		p=new Properties();
		p.load(fi);
	}catch (Exception e) {
		System.out.println("Exception is"+e.getMessage());
	}	
}
public String getApplicationURL() {
	String url=p.getProperty("baseURL");
	return url;
	
}
public String getUsername() {
	String username=p.getProperty("username");
	return username;
	
}
public String getpassword() {
	String password=p.getProperty("password");
	return password;
	

}
public String getchromepath() {
	String chromepath=p.getProperty("chromepath");
	return chromepath;

}
}


