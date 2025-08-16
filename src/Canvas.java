import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private List<Line>lines;
//constructor
    public Canvas(){
        lines = new ArrayList<>();
    }
    public void addLine(Line line){
        lines.add(line);
    }
    public List<Line> getLines(){
        return lines;
    }
    //toString to show all lines
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(Line lin : lines){
            sb.append(lin).append("\n");
        }
        return sb.toString();
    }
}
