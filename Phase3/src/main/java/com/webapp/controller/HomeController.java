package com.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simplilearn.webapp.model.Admin;
import com.webapp.Dao.AdminRepo;
import com.webapp.Dao.ProductRepo;
import com.webapp.Dao.PurchaseInfoRepo;
import com.webapp.Dao.Repo;
import com.webapp.Dao.UserRepo;

public class HomeController {
@Autowired
AdminRepo adminRepo;
@Autowired
ProductRepo productRepo;
@Autowired
UserRepo userRepo;
@Autowired
PurchaseInfoRepo purchaseinfoRepo;
@Autowired
Repo repo;

@RequestMapping("/")
public String showHome() {
	return "Home";
}
@RequestMapping(value="adminLogin",method =RequestMethod.GET)
public String adminLoginPage() {
	return "AdminLogin";
}
@RequestMapping(value="forgotPassword",method =RequestMethod.GET)
public String forgotPassword() {
	return "ForgotPassword";
}
@RequestMapping(value="adminForgotPassword",method =RequestMethod.POST)
public String adminForgotPasswordPage(@RequestParam("email")String email,
		@RequestParam("password")String password,ModelMap map) {
	
	if(repo.forgotPassword(email,password))
		map.addAttribute("message","Password Updated");
	else
		map.addAttribute("message","Invalid Details");
	
	return "ForgotPassword";
}

@RequestMapping(value="adminPage",method=RequestMethod.POST)

public String adminPage(@RequestParam(name="email")String email,
		@RequestParam(name="password")String password,ModelMap map) {
	
	if(adminRepo.verifyAdmin(new Admin(email,password)))
		return "AdminPage";
	else {
		map.addAttribute("message", "Invalid Details");
		return "AdminLogin";
	}
}
@RequestMapping(value="product",method=RequestMethod.GET)
public String getAllProducts(ModelMap map) {
	
	map.addAttribute("productList",productRepo.getAllProducts());
	return "Product";
	
}
@RequestMapping(value="user",method=RequestMethod.GET)
public String getAllUsers(ModelMap map) {
	
	map.addAttribute("userList",userRepo.getAllUsers());
	return "User";
	
}
@RequestMapping(value="searchUser",method=RequestMethod.GET)
public String searchUser(@RequestParam("email")String email,ModelMap map) {
	
	map.addAttribute("userList",userRepo.searchUser(email));
	return "User";
	
}
@RequestMapping(value="purchaseReport",method=RequestMethod.GET)
public String getRport(ModelMap map) {
	
	map.addAttribute("report",purchaseinfoRepo.getReport());
	return "PurchaseReport";
	
}
@RequestMapping(value="deleteProduct",method=RequestMethod.GET)
public String deleteProduct(@RequestParam("id")int id,ModelMap map) {
	
	if(productRepo.deleteProduct(id))
		map.addAttribute("message","Product Deleted Successfully");
	else
		map.addAttribute("message","Try after few minutes");
	
	map.addAttribute("productList",productRepo.getAllProducts());
	
	return "Product";
	
}

}

