import java.awt.Graphics;

public class Circulo extends ShapeFactory{
    private final int width;
    private final int height;

    public Circulo(int posX , int posY, Shape descShape, int width, int height){
        super(posX, posY, descShape);
        this.width = width;
        this.height = height;
    }

    public void desenhar(Graphics g){
        g.drawOval(getPosX(), getPosY(), width, height);
    }
}
