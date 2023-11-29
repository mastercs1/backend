package satac.webservice.demo.repository;

import org.springframework.data.repository.CrudRepository;

import satac.webservice.demo.entity.Cycle;
import org.springframework.stereotype.Repository;

@Repository
public interface CycleRepository extends CrudRepository<Cycle, Long>{

}
