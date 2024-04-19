package co.edu.eci.cvds.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CAMILO_MURCIA")
public class CAMILO_MURCIA {
    @Id
    @Column(name = "NUMPREG")
    private int numpreg;
    @Column(name = "LETRA")
    private String letra;
    @Column(name = "ARG")
    private String argumento;
     
    public CAMILO_MURCIA(){
        
    }
    public CAMILO_MURCIA(int numpreg, String letra, String argumento){
        this.argumento = argumento;
        this.letra = letra;
        this.numpreg = numpreg;
    }

    public int getNum(){
        return this.numpreg;
    }

public String getLetra(){
    return this.letra;
}
public String getArg(){
    return this.argumento;
}

}
