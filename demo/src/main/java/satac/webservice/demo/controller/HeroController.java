package satac.webservice.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import satac.webservice.demo.entity.Cycle;
import satac.webservice.demo.entity.Hero;
import satac.webservice.demo.service.CycleService;
import satac.webservice.demo.service.HeroService;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
public class HeroController {

	@Autowired
	private HeroService heroService;

	@PostMapping("/heros")
	public Hero saveHero(@RequestBody Hero hero) {
		return heroService.saveHero(hero);
	}
	@GetMapping("/heros")
	public List<Hero> fetchHeroList() {
		return heroService.fetchHeroList();
	}

	@GetMapping("/heros/{id}")
	public Optional<Hero> getHero(@PathVariable("id") final long id) {
		return heroService.getHero(id);
	}

	
	@PutMapping("/heros/{id}")
	public Hero updateDepartment(@RequestBody Hero hero, @PathVariable("id") Long heroId) {
		return heroService.updateHero(hero, heroId);
	}

	@DeleteMapping("/hero/{id}")
	public String deleteHeroById(@PathVariable("id") Long heroId) {
		heroService.deleteHeroById(heroId);
		return "Deleted Successfully";
	}
	

}