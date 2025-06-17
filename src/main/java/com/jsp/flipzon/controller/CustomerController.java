package com.jsp.flipzon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	@GetMapping("/register")
	public String loadRegister() {
		return "register.html";
	}

	@GetMapping("/otp")
	public String loadOtp() {
		return "otp.html";
	}

	@GetMapping("/submit-otp")
	public String submitOtp() {
		return "redirect:/login";
	}

	@GetMapping("/home")
	public String loadHome() {
		return "customer-home.html";
	}

	@GetMapping("/view-products")
	public String viewProducts() {
		return "products.html";
	}

	@GetMapping("/add-to-cart")
	public String addToCart() {
		return "redirect:/customer/view-products";
	}

	@GetMapping("/cart")
	public String loadCart() {
		return "cart.html";
	}

	@GetMapping("/cart/increase")
	public String increaseItem() {
		return "redirect:/customer/cart";
	}

	@GetMapping("/cart/decrease")
	public String decreaseItem() {
		return "redirect:/customer/cart";
	}
}
