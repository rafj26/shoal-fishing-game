import java.util.Random;
import javax.swing.JTextField;

public class Peces2 {
    private int cardumenPos;
    private JTextField tf_cardumenPos;
    private int pressedCount;

    public Peces2(JTextField tf_cardumenPos) {
        this.tf_cardumenPos = tf_cardumenPos;
        moveCardumen(); // Posicionar inicialmente el cardumen
    }

    public void moveCardumen() {
        Random rand = new Random();
        cardumenPos = rand.nextInt(100); // Nueva posición aleatoria
        while (!isValidPosition(cardumenPos)) {
            cardumenPos = rand.nextInt(100);
        }
        updateCardumenPos();
        pressedCount = 0;
    }

    private boolean isValidPosition(int pos) {
        int fil = pos / 10;
        int col = pos % 10;
        return fil > 0 && fil < 9 && col > 0 && col < 9;
    }

    public void updateCardumenPos() {
        tf_cardumenPos.setText(String.valueOf(cardumenPos));
    }

    public int getCardumenPos() {
        return cardumenPos;
    }

    public void botonpres() {
        pressedCount++;
    }

    public boolean botonpress() {
        return pressedCount == 1;
    }
}
