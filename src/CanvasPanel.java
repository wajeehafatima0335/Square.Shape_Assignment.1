import javax.swing.*;
import java.awt.*;

public class CanvasPanel extends JPanel {
    private Canvas canvas;

    public CanvasPanel(Canvas canvas) {
        this.canvas = canvas;
        setPreferredSize(new Dimension(500, 500));
        setBackground(Color.WHITE);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);

        int centerX = getWidth()/2;
        int centerY = getWidth()/2;

        for (Line line : canvas.getLines()) {
            int startX = centerX + line.getStart().getX();
            int startY = centerY - line.getStart().getY(); // Flip Y so up is positive
            int endX = centerX + line.getEnd().getX();
            int endY = centerY - line.getEnd().getY();

            g.drawLine(startX,startY,endX,endY);
        }
    }
}


