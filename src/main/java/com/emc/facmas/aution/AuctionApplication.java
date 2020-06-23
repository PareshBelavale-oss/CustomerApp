package com.emc.facmas.aution;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableOAuth2Sso
public class AuctionApplication {

	public static void main(String[] args) {
		 InetAddress IP=null;
		try {
			IP = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("IP of my system is := "+IP.getHostAddress()); 	
		SpringApplication.run(AuctionApplication.class, args);
	}

}
