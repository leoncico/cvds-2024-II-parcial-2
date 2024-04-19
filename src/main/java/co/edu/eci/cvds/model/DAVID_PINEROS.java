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
    private String numeroPregunta;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "JUSTIFICACION")
    private String justificacion;

    public DAVID_PINEROS() {
    }

    public DAVID_PINEROS(String numeroPregunta, String letra, String justificacion) {
        this.numeroPregunta = numeroPregunta;
        this.letra = letra;
        this.justificacion = justificacion;
    }

    public String getNumeroPregunta() {
        return numeroPregunta;
    }

    public void setNumeroPregunta(String numeroPregunta) {
        this.numeroPregunta = numeroPregunta;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getJustificacion() {
        return justificacion;
    }

    public void setJustificacion(String justificacion) {
        this.justificacion = justificacion;
    }
}