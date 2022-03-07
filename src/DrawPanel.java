import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.Map;
import java.util.HashMap;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Map<String,ShapeFactory> myMap = new HashMap<>();

        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g); //sistema chama automaticamente sempre q exibir o DrawPanel

        int width = getWidth();
        int height = getHeight();

        //Shape shape = ShapeFactory.getShape("rect");
        Retangulo retangulo = new Retangulo(width/2,height/2, null,
                20,30);
        myMap.put("rect", retangulo);
        retangulo.desenhar(g);

        Circulo circulo = new Circulo((width/2)+30,height/2, null,
                40);
        myMap.put("circ", circulo);
        circulo.desenhar(g);
    }

    /*
    public static Shape getShape(String type) {
        ShapeFactory factory = (ShapeFactory) typeMap.get(type);
        return getShape();
    }
    */
}
