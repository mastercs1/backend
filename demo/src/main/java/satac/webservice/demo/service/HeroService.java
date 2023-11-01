package satac.webservice.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Hero;

public interface HeroService {
	  // Save operation
    Hero saveHero(Hero hero);
 
    // Read operation
    List<Hero> fetchHeroList();
 
    // Update operation
    Hero updateHero(Hero hero,Long heroId);
    
    Optional<Hero> getHero(long id);
 
    // Delete operation
    void deleteHeroById(Long heroId);

}
