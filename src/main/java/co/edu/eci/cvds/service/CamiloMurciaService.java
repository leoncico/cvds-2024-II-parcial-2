package co.edu.eci.cvds.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.eci.cvds.repository.CamiloMurciaRepository;
import co.edu.eci.cvds.model.CAMILO_MURCIA;

import java.util.List;

@Service
public class CamiloMurciaService {
    private final CamiloMurciaRepository camiloMurciaRepository;

    @Autowired
    public CamiloMurciaService(CamiloMurciaRepository camiloMurciaRepository) {
        this.camiloMurciaRepository = camiloMurciaRepository;
    }
    public List<CAMILO_MURCIA> getAllAnswers() {
        return camiloMurciaRepository.findAll();
    }
}
