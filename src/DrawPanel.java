import java.awt.Graphics;
import javax.swing.JPanel;

public class DrawPanel extends JPanel {
    public void paintComponent(Graphics g) {

        // chama paintComponent para assegurar que o painel é exibido corretamente
        super.paintComponent(g); //sistema chama automaticamente sempre q exibir o DrawPanel

        int width = getWidth();
        int height = getHeight();

        //Shape shape = ShapeFactory.getShape("rect");
        Retangulo rect = new Retangulo(width/2,height/2, null,
                20,30);
        rect.desenhar(g);
        Circulo circulo = new Circulo((width/2)+30,height/2, null,
                40,40);
        circulo.desenhar(g);
    }

    /*
    public static Shape getShape(String type) {
        ShapeFactory factory = (ShapeFactory) typeMap.get(type);
        return getShape();
    }
    */
}
