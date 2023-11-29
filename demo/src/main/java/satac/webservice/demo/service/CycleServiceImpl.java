package satac.webservice.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import satac.webservice.demo.entity.Cycle;
import satac.webservice.demo.repository.CycleRepository;

@Service
public class CycleServiceImpl implements CycleService{
    @Autowired
    private CycleRepository cycleRepository;
 

    @Override public List<Cycle> fetchCycleList()
    {
        return (List<Cycle>)
        		cycleRepository.findAll();
    }
 


}
