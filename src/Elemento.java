import java.util.List;

public class Elemento {
    protected String nombre;
    private List<Elemento> debilidades;


    public Elemento(String nombre, List<Elemento> debilidades) {
        this.nombre = nombre;
        this.debilidades = debilidades;
    }

    protected int calcularEnfrentamiento(String nombreOponente){
        
    }

    public void setDebilidades(List<Elemento> debilidades) {
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
