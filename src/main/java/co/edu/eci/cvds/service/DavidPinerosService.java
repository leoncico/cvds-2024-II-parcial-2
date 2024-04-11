package co.edu.eci.cvds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import co.edu.eci.cvds.model.DAVID_PINEROS;
import co.edu.eci.cvds.repository.DavidPinerosRepository;

@Service
public class DavidPinerosService {
    private DavidPinerosRepository davidPinerosRepository;
    
    @Autowired
    public DavidPinerosService(DavidPinerosRepository davidPinerosRepository) {
        this.davidPinerosRepository = davidPinerosRepository;
    }

    public List<DAVID_PINEROS> getAllAnswers() {
        return davidPinerosRepository.findAll();
    }
}
