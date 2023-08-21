package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.Service.ICustomerService;
import com.app.entity.Customers;
import com.sun.javafx.sg.prism.NGShape.Mode;

@Controller
//@RequestMapping("/home")
public class HomeController {
	int mrId,custId;
	@Autowired(required = true)
	@Qualifier("test")
	private ICustomerService customerservice;
	@GetMapping("/list")
	public String listCustomer(Model themodel) {
		
		List<Customers> thecustomers=customerservice.getCustomer(mrId);
		themodel.addAttribute("customers",thecustomers);
		return "Hello";
	}
	@RequestMapping("HelpList")
	private String list(@RequestParam("name") int m,Model themodel) {
		mrId=m;
		
		return "redirect:/list" ;
	}
	@RequestMapping("/")
	private String mrPage() {
		
		
		return "mr-id";
		
	}
	@RequestMapping("/form")
	private String forWard() {
		return "customer";
	}
	@RequestMapping("/save")
	private String saveCustomers(@RequestParam("fname") String fname,@RequestParam("lname") String lname,@RequestParam("email") String email){
		customerservice.saveCustomers(mrId, fname, lname, email);
		
		return "redirect:/list" ;
	}
	@RequestMapping("/delete")
	private String deleteCustomer(@RequestParam("customerId") int customerId) {
		customerservice.deleteCustomer(customerId);
		
		return "redirect:/list";
		
	}
	@RequestMapping("/update")
	private String updateCustomer(@RequestParam("customerId")int customerId,Model m) {
		Customers thecustomers=customerservice.updateCustomer(customerId);
		custId=customerId;
		 
         m.addAttribute("customer", thecustomers);  
		
		return "update-id";
		
	}
	@RequestMapping("/updatesave")
	private String updateSaveCustomer(@ModelAttribute("customer") Customers customer) {
		
		customerservice.updateSaveCustomer(customer, mrId,custId);
		return "redirect:/list";
	}

}
