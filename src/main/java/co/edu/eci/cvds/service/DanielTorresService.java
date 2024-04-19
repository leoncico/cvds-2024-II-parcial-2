package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.DanielTorres;
import co.edu.eci.cvds.repository.DanielTorresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DanielTorresService {
    private final DanielTorresRepository danieltorresRepository;

    @Autowired
    public DanielTorresService(DanielTorresRepository danieltorresRepository) {
        this.danieltorresRepository = danieltorresRepository;
    }

    public List<DanielTorres> getAllDanielTorres() {
        return danieltorresRepository.findAll();
        
    }
}
