package satac.webservice.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Cycle;
import satac.webservice.demo.service.CycleService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class CycleController {
	@Autowired
	private CycleService cycleService; 
	@GetMapping("/santasweb/cycles")
	public List<Cycle> getCycles() {
		System.out.println("CycleController.getCycles()");
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		System.out.println("cycleService.fetchCycleList()");
//		return new ArrayList<Cycle>();
//		return cycleService.fetchCycleList();
		return cycleService.fetchCycleList();
	}
}
