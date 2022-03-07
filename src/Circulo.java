import java.awt.Graphics;

public class Circulo extends ShapeFactory{
    private final int width;

    public Circulo(int posX , int posY, Shape descShape, int width){
        super(posX, posY, descShape);
        this.width = width;
    }

    public void desenhar(Graphics g){
        g.drawOval(getPosX(), getPosY(), width, width);
    }
}
