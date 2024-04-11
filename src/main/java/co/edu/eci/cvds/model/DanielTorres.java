package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Daniel_Torres")
public class DanielTorres {
    @Id
    @Column(name = "Num_Preguntas")
    private int preguntas;
    @Column(name = "Letra")
    private String letra;
    @Column(name = "Razon")
    private String argumento;

    public DanielTorres(int preguntas, String Letra, String Razon){
        this.preguntas=preguntas;
        this.letra=Letra;
        this.argumento=Razon;
    }


    public int getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(int preguntas) {
        this.preguntas = preguntas;
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

