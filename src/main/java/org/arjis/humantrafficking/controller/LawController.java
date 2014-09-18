package org.arjis.humantrafficking.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.arjis.humantrafficking.model.Laws;
import org.arjis.humantrafficking.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;


import com.fasterxml.jackson.annotation.JsonView;





@Controller 
@RequestMapping("/nonrest")
public class LawController {

	@Autowired
	private LawService lawService;


	
	@RequestMapping("/")
	public String setUpForm(Map<String, Object> map){
		Laws law = new Laws();
		map.put("law", law);
		if(lawService!=null){
		map.put("lawList", lawService.getAllLaws());
		}
		return "law";
	}
	
	
	
	
	
	
	@RequestMapping(value="/law.do", method= RequestMethod.POST)
	public String doActions(@ModelAttribute Laws law, BindingResult result, @RequestParam String action,Map<String, Object> map ){
		
		Laws lawResult = new Laws();
		
		switch((action.toLowerCase())){
		case "add":
			lawService.add(law);
			lawResult=law;
			break;
		case "edit":
			lawService.edit(law);
			lawResult=law;
			break;
		case "delete":
		
			lawService.delete(law.getId());
			lawResult = new Laws();
			break;
		case "search":
			Laws searchedLaw= lawService.getLaw(law.getId());
			lawResult= searchedLaw!=null? searchedLaw: new Laws();
			break;
		}
		map.put("law", lawResult);
		map.put("lawList", lawService.getAllLaws());
		return "law";
	}
	
	 @RequestMapping(value = "/{name}", method = RequestMethod.GET)
	 public String getGreeting(@PathVariable String name) {
	  String result="Hello "+name;  
	  return result;
	 }
	
}
