import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Juego {
    private boolean juegoEstaEnCurso;

    private Elemento piedra;
    private Elemento tijera;
    private Elemento papel;

    private List<Elemento> elementosJuego;

    private int puntuacionJugador;
    private int puntuacionMaquina;

    private Scanner escanerEntradaUsuario;

    public Juego(){

        this.juegoEstaEnCurso = false;

    this.piedra = new Elemento("Piedra", Arrays.asList());
    this.tijera = new Elemento("Tijera", Arrays.asList(piedra));
    this.papel = new Elemento("Papel", Arrays.asList(tijera));

    this.elementosJuego = Arrays.asList(piedra, papel, tijera);

    this.puntuacionJugador = 0;
    this.puntuacionMaquina = 0;

    this.escanerEntradaUsuario = new Scanner(System.in);

    }

    public void iniciarPartida() {
        this.juegoEstaEnCurso = true;
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

    public void continuarPartida() {
        System.out.println("A jugar!!!!");
        System.out.println("Elije tu elemento: ");
        System.out.println("**********************************");
        System.out.println("1. Piedra");
        System.out.println("2. Papel");
        System.out.println("3. Tijera");
        System.out.println("4. Abandonar Partida");

        String eleccionUsuario = escanerEntradaUsuario.next();
        Elemento elementoSeleccionadoUsuario;
        Elemento elementoSeleccionadoMaquina = calcularJugadaMaquina();

        switch (eleccionUsuario) {
            case "1":
                elementoSeleccionadoUsuario = elementosJuego.get(0);

                if (elementoSeleccionadoUsuario.equals(elementoSeleccionadoMaquina)) {
                    System.out.println("EMPATE!!!!!!!!!!!!!!");
                } else if (elementoSeleccionadoUsuario
                        .calcularEnfrentamiento(elementoSeleccionadoMaquina.getNombre()) == 1) {
                    puntuacionJugador++;
                } else {
                    puntuacionMaquina++;
                }
                break;

            case "2":
                elementoSeleccionadoUsuario = elementosJuego.get(1);

                if (elementoSeleccionadoUsuario.equals(elementoSeleccionadoMaquina)) {
                    System.out.println("EMPATE!!!!!!!!!!!!!!");
                } else if (elementoSeleccionadoUsuario
                        .calcularEnfrentamiento(elementoSeleccionadoMaquina.getNombre()) == 1) {
                    puntuacionJugador++;
                } else {
                    puntuacionMaquina++;
                }
                break;
            case "3":
                elementoSeleccionadoUsuario = elementosJuego.get(2);

                if (elementoSeleccionadoUsuario.equals(elementoSeleccionadoMaquina)) {
                    System.out.println("EMPATE!!!!!!!!!!!!!!");
                } else if (elementoSeleccionadoUsuario
                        .calcularEnfrentamiento(elementoSeleccionadoMaquina.getNombre()) == 1) {
                    puntuacionJugador++;
                } else {
                    puntuacionMaquina++;
                }
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
        Random random = new Random();
        int indiceElementoAleatorio = random.nextInt(elementosJuego.size());
        return elementosJuego.get(indiceElementoAleatorio);
    }

    private void terminarPartida() {
        System.out.println("Fin del juego");
        System.out.println("Puntos Jugador: " + puntuacionJugador);
        System.out.println("Puntos Maquina: " + puntuacionMaquina);
        juegoEstaEnCurso = false;
    }

    public boolean isJuegoEstaEnCurso() {
        return juegoEstaEnCurso;
    }

    
}
