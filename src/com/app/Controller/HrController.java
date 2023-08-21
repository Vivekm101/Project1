package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.Service.IHRService;
import com.app.entity.SalesMan;

@Controller
public class HrController {
	@Autowired
	private IHRService hrservice;
	@RequestMapping("/mrList")
	public String mrList(Model themodel) {
		List<SalesMan> salesman=hrservice.getSalesMan();
	     themodel.addAttribute("salesmans", salesman);
		return "Mr";
	}
	@RequestMapping("/saveMr")
	public String saveSalesMan(@ModelAttribute("salesman") SalesMan salesman) {
		hrservice.saveSalesMan(salesman);
		return "redirect:/mrList";
	}
	@RequestMapping("saveMrForm")
	public String forward() {
		return "saveMr-form";
	}

}
