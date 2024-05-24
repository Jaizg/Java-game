import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Juego {
    private boolean juegoEstaEnCurso = false;

    private Elemento piedra=new Elemento("Piedra", Arrays.asList());
    private Elemento tijera=new Elemento("Tijera", Arrays.asList(piedra));
    private Elemento papel=new Elemento("Papel", Arrays.asList(tijera));

    piedra=piedra.setDebilidades(Arrays.asList(papel));

    private List<Elemento> elementosJuego = Arrays.asList(piedra, papel,tijera);

    private int puntuacionJugador = 0;
    private int puntuacionMaquina = 0;

    private Scanner escanerEntradaUsuario = new Scanner(System.in);

    private void iniciarPartida() {
        System.out.println("Bienvenido a Jueguito Maravilloso, elige lo que quieres hacer a continuación: ");
        System.out.println("**********************************");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");

        String eleccionUsuario = escanerEntradaUsuario.next();

        switch (eleccionUsuario) {
            case "1":
                continuarPartida();
                break;

            case "2":
                terminarPartida();
                break;

            default:
                terminarPartida();
                break;
        }
    }

    private void continuarPartida() {
        System.out.println("A jugar!!!!");
        System.out.println("Elije tu elemento: ");
        System.out.println("**********************************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Abandonar Partida");

        String eleccionUsuario = escanerEntradaUsuario.next();
        Elemento elementoSeleccionadoUsuario;
        Elemento elementoSeleccionadoMaquina=calcularJugadaMaquina();

        switch (eleccionUsuario) {
            case "1":
                elementoSeleccionadoUsuario=elementosJuego.get(0);
                
                if(elementoSeleccionadoUsuario.equals(elementoSeleccionadoMaquina)){
                    System.out.println("EMPATE!!!!!!!!!!!!!!");
                }
                else if(elementoSeleccionadoUsuario.calcularEnfrentamiento(elementoSeleccionadoMaquina.getNombre())==1){
                    puntuacionJugador++;
                }else{
                    puntuacionMaquina++;
                }
                break;

            case "2":
                continuarPartida();
                break;
            case "3":
                continuarPartida();
                break;

            case "4":
                terminarPartida();
                break;

            default:
                terminarPartida();
                break;
        }

        System.out.println("Que buena jugada...");
        System.out.println("¿Que buena jugada quieres hacer ahora: ?");
        System.out.println("********************************");
        System.out.println("1. Seguir Jugando");
        System.out.println("2. Abandonar Partida");

        eleccionUsuario = escanerEntradaUsuario.next();

        switch (eleccionUsuario) {
            case "1":
                continuarPartida();
                break;
            
            case "2":
                terminarPartida();
                break;
        
            default:
                terminarPartida();
                break;
        }
    }

    private Elemento calcularJugadaMaquina() {
    }

    private void terminarPartida() {
        
    }

    public static void main(String[] args) throws Exception {

    }
}
