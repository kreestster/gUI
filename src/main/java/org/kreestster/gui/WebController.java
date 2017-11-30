package org.kreestster.gui;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class WebController {
	
	@Autowired
	private DiscoveryClient discoveryClient;


	@RequestMapping("/holidays")
	public void holydaysApp(HttpServletResponse response) {
		response.setHeader("Location", "http://1lit253.ingdirect.idi.it:2222/");
	}
}
