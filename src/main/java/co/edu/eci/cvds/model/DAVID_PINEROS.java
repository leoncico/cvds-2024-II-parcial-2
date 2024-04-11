package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DAVID_PINEROS")
public class DAVID_PINEROS {
    @Id
    @Column(name = "NUMEROPREGUNTA")
    private int numeroPregunta;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "JUSTIFICACION")
    private String justificacion;

    public DAVID_PINEROS() {
    }

    public DAVID_PINEROS(int numeroPregunta, String letra, String justificacion) {
        this.numeroPregunta = numeroPregunta;
        this.letra = letra;
        this.justificacion = justificacion;
    }

    public Integer getNumeroPregunta() {
        return numeroPregunta;
    }
}