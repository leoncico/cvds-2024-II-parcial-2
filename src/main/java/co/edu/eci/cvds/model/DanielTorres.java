package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Daniel_Torres")
public class DanielTorres {
    @Id
    @Column(name = "Pregunta")
    private int pregunta;
    @Column(name = "Letra")
    private String letra;
    @Column(name = "Razon")
    private String argumento;

    public DanielTorres(int pregunta, String Letra, String Razon){
        this.pregunta=pregunta;
        this.letra=Letra;
        this.argumento=Razon;
    }

    public DanielTorres() {

    }


    public int getPreguntas() {
        return pregunta;
    }

    public void setPreguntas(int preguntas) {
        this.pregunta = preguntas;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getRazon(){
        return argumento;
    }

    public void setRazon(String Razon) {
        this.argumento = Razon;
    }
}

