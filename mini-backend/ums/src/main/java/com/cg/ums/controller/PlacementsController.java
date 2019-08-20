package com.cg.ums.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.cg.ums.bean.Placements;
import com.cg.ums.service.PlacementsService;

@RestController
@RequestMapping("/placements")
@CrossOrigin(origins="http://localhost:4200")
public class PlacementsController {

	@Autowired
	private PlacementsService placementsService;
	@RequestMapping(value ="/saveplacement", method = RequestMethod.POST)
	public Placements createPlacements(@RequestBody Placements placements ) {
		return  placementsService.savePlacementData(placements);
	}
	@RequestMapping(value = "/getplacementdetails", method = RequestMethod.GET)
	public List<Placements> getPlacements() {
		return placementsService.getPlacementDetails();
	} 
	@RequestMapping(value = "/updateplacement", method = RequestMethod.PUT)
	public Placements updatePlacement(@RequestBody Placements placements) {
		return placementsService.updatePlacement(placements);
	}
	
	@RequestMapping(value="/searchplacement",method=RequestMethod.GET)
	
	public Placements search(@RequestParam("id") Integer companyId)
	{
		return placementsService.searchByCompanyId(companyId);
		
	}
	@RequestMapping(value = "/deleteplacement/{cid}", method = RequestMethod.DELETE)
	public void deletePlacement(@PathVariable("cid") Integer cid) {
		placementsService.deletePlacement(cid);
	
	}
	@DeleteMapping(value = "/deletecompany")
	public void  delTable() {
		placementsService.truncateCompanyData();

	}
	
}