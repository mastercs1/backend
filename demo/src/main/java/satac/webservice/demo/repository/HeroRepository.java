package satac.webservice.demo.repository;
import satac.webservice.demo.entity.Hero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface HeroRepository  extends CrudRepository<Hero, Long> {
}
