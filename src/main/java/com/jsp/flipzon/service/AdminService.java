package com.jsp.flipzon.service;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class AdminService {

	public String loadHome(HttpSession session) {
		if (isLoggedIn(session))
			return "admin-home.html";
		else
			return "redirect:/login";
	}
	
	

	private boolean isLoggedIn(HttpSession session) {
		if (session.getAttribute("admin") != null)
			return true;
		else
			return false;
	}

}
