package org.kreestster.gui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class Gui {

	public static void main(String...strings){
		SpringApplication.run(Gui.class, strings);
	}
}
