
public class Pen {
    private Point position;  //current location
    private Canvas canvas;   //canvas to draw on

   public Pen(Point startPosition, Canvas canvas){
       this.position = startPosition;
       this.canvas = canvas;
   }
   //move to a new position without drawing
   public void moveTo(int x, int y){
       this.position = new Point(x,y);
   }
   // draw a line from current position to new position
    public void lineTo(int x, int y){
       Point newPoint = new Point(x,y);
       Line line = new Line(position , newPoint);
       canvas.addLine(line);

       //update line
       this.position = newPoint;
    }

    //get the current position
    public Point getPosition(){
       return position;
    }
    public String toString(){
       return " pen at " + position;
    }

}



