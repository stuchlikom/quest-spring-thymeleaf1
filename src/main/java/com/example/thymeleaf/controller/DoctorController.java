package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class DoctorController {

    @GetMapping("/doctor")
    public String doctor(
    	Model doctor,
        @RequestParam(
        	value="doctorname",
        	required=false,
            defaultValue="John Smith"
        ) String doctorname,
        @RequestParam(
        	value="number",
        	required=false,
            defaultValue="0"
        ) String number
	)
	{
		//if (doctorname == "" || number == "") {
		//	doctorname = "John Smith";
		//	number = "0";
		//}
    	doctor.addAttribute("doctorname", doctorname);
    	doctor.addAttribute("number", number);
	    return "doctor";
	}
}