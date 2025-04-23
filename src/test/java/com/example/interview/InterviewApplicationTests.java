import javax.swing.*;
import java.awt.*;

public class Snowman extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Рисуем снеговика
        drawSnowman(g, 200, 200);
    }

    private void drawSnowman(Graphics g, int x, int y) {
        // Рисуем тело снеговика
        g.setColor(Color.WHITE);
        g.fillOval(x - 40, y - 100, 80, 80); // Голова
        g.fillOval(x - 60, y - 20, 120, 120); // Торс
        g.fillOval(x - 80, y + 80, 160, 160); // Ноги

        // Рисуем глаза
        g.setColor(Color.BLACK);
        g.fillOval(x - 15, y - 70, 10, 10); // Левый глаз
        g.fillOval(x + 5, y - 70, 10, 10); // Правый глаз

        // Рисуем нос
        g.setColor(Color.ORANGE);
        int[] noseX = {x, x + 20, x};
        int[] noseY = {y - 50, y - 40, y - 30};
        g.fillPolygon(noseX, noseY, 3);

        // Рисуем рот
        g.setColor(Color.BLACK);
        g.drawArc(x - 10, y - 30, 20, 10, 0, -180);

        // Рисуем шляпу
        g.setColor(Color.BLACK);
        g.fillRect(x - 40, y - 120, 80, 20); // Основание шляпы
        g.fillRect(x - 20, y - 160, 40, 40); // Верхняя часть шляпы
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Snowman");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new Snowman());
        frame.setVisible(true);
    }
}
