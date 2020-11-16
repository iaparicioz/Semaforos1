import java.util.Random;

public class Luchador extends Thread {

    Cuadrilatero c;

    public Luchador(Cuadrilatero c) {
        this.c=c;
    }

    int duracion= 1000;
    int contador=1;

    @Override
    public void run() {
        try {
        Cuadrilatero.AddParticipante(this);
        System.out.println("COMBATE");
        Random random = new Random();
        boolean resultado = new Random().nextBoolean();
        System.out.println("Yuju soy "+getName() +" y estoy compitiendo");
        sleep(duracion);
        System.out.println("Perdido y soy "+getName());
        Cuadrilatero.AdiosParticipante(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
