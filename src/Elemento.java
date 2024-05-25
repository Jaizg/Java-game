import java.util.List;

public class Elemento {
    protected String nombre;
    private List<Elemento> debilidades;


    public Elemento(String nombre, List<Elemento> debilidades) {
        this.nombre = nombre;
        this.debilidades = debilidades;
    }

    protected int calcularEnfrentamiento(String nombreOponente){
        for (Elemento debilidad : debilidades) {
            if(debilidad.getNombre()==nombreOponente){
                return 0;
            }
        }
        return 1;
    }

    public void setDebilidades(List<Elemento> debilidades) {
        this.debilidades = debilidades;
    }

    public String getNombre() {
        return nombre;
    }

    
    
}
