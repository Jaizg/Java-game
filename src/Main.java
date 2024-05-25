public class Main {
    public static void main(String[] args) throws Exception {
        Juego jueguito=new Juego();

        jueguito.iniciarPartida();
        while (jueguito.isJuegoEstaEnCurso()) {
            jueguito.continuarPartida();
        }
    }
}
