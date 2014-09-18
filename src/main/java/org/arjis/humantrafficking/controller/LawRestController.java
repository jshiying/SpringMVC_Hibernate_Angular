package org.arjis.humantrafficking.controller;

import java.util.List;

import org.arjis.humantrafficking.model.Laws;
import org.arjis.humantrafficking.service.LawService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;





@RestController
@RequestMapping("/rest")
public class LawRestController {

	@Autowired
	private LawService lawService;

	
	@RequestMapping("/law")
	@ResponseBody
	public  List<Laws> getLaw(){
	
		 List<Laws>  law=  lawService.getAllLaws();
		
		
		return law;
	}

	@RequestMapping("/law/add/{name}/{type}/{summary}/{resourcelink}/{status}")
	@ResponseBody
	public  List<Laws> addLaw( @PathVariable ("name") String name, @PathVariable ("type") String type,@PathVariable ("summary") String summary,@PathVariable("resourcelink") String resourceLink,@PathVariable("status") String status){
	
		Laws law= new Laws();
		law.setName(name);
		law.setResourceLink(resourceLink);
		law.setStatus(status);
		law.setSummary(summary);
		lawService.add(law);
		 List<Laws>  laws=  lawService.getAllLaws();
		
		
		return laws;
	}
	
	@RequestMapping("/law/delete/{id}/")
	@ResponseBody
	public  List<Laws> deleteLaw( @PathVariable int id){

		lawService.delete(id);
		List<Laws>  laws=  lawService.getAllLaws();
		
		
		return laws;
	}
	 
	
	
	
	
	
	
}
