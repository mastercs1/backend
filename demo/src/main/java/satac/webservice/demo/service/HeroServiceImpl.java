package satac.webservice.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Hero;
import satac.webservice.demo.repository.HeroRepository;

@Service
public class HeroServiceImpl implements HeroService {
 
    @Autowired
    private HeroRepository heroRepository;
 
    // Save operation
    @Override
    public Hero saveHero(Hero department)
    {
        return heroRepository.save(department);
    }
 
    // Read operation
    @Override public List<Hero> fetchHeroList()
    {
        return (List<Hero>)
            heroRepository.findAll();
    }
 
    // Update operation
    @Override
    public Hero updateHero(Hero hero,
                     Long heroId)
    {
        Hero heroDB = heroRepository.findById(heroId).get();
 
		if (Objects.nonNull(hero.getHeroName()) && !"".equalsIgnoreCase(hero.getHeroName())) {
			heroDB.setHeroName(hero.getHeroName());
		}
 
		if (Objects.nonNull(hero.getDescription()) && !"".equalsIgnoreCase(hero.getDescription())) {
			heroDB.setDescription(hero.getDescription());
		}
		if (Objects.nonNull(hero.getHeroDob()) && !"".equalsIgnoreCase(hero.getHeroDob())) {
			heroDB.setHeroDob(hero.getHeroDob());
		}
		
		if (Objects.nonNull(hero.getHeroRace()) && !"".equalsIgnoreCase(hero.getHeroRace())) {
			heroDB.setHeroRace(hero.getHeroRace());
		}
		
		if (Objects.nonNull(hero.getImageUrl()) && !"".equalsIgnoreCase(hero.getImageUrl())) {
			heroDB.setImageUrl(hero.getImageUrl());
		}
		if (hero.getStarRating()>0) {
			heroDB.setStarRating(hero.getStarRating());
		}
 
        return heroRepository.save(heroDB);
    }
 
    // Delete operation
    @Override
    public void deleteHeroById(Long departmentId)
    {
        heroRepository.deleteById(departmentId);
    }

	@Override
	public Optional<Hero> getHero(long id) {
		return heroRepository.findById(id);
	}


	
	 
}