import javax.swing.*;
public class App {
    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        Turtle turtle = new Turtle(new Point(0, 0), 0, canvas);

        //create command
        Command square = new SquareCommand(60);
        Command zigzag = new ZigzagCommand(30);

        //execute command
        square.execute(turtle);
       turtle.moveTo(new Point(150, 0));
        zigzag.execute(turtle);

        JFrame frame = new JFrame("turtle drawing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new CanvasPanel(canvas));
        frame.pack();
        frame.setVisible(true);

    }
}

