import java.util.concurrent.Semaphore;

public class Cuadrilatero {
    private static final int MAX_AVAILABLE = 2;
    private static final Semaphore available1 = new Semaphore(MAX_AVAILABLE, true);

    public static void AddParticipante(Luchador luchador) {
        try {
            available1.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void AdiosParticipante(Luchador luchador) {
        available1.release();
    }
}
