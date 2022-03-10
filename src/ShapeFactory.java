import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    public Shapes getShape(String name, int width, int height){
        switch (name) {
            case "rect":
                return new Retangulo(width, height);
            case "circ":
                return new Circulo(width, height);
            case "quadr":
                return new Quadrado(width, width);
            case "oval":
                return new Oval(width, height);
            default:
                return new Retangulo(width, height);
        }

        /*Map<String, Shapes> myMap = new HashMap<>();
        myMap.put("rect", Retangulo);
        myMap.put("circ", Circulo); */
    }
}
