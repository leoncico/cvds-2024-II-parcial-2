package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAMILO_MURCIA")
public class CAMILO_MURCIA {
    @Id
    @Column(name = "#Pregunta")
    private int numpreg;
    @Column(name = "Letra Respuesta")
    private String letra;
    @Column(name = "Argumento")
    private String argumento;
}
