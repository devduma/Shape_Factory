import java.awt.Graphics;

public class Circulo extends Shapes {

    public Circulo(int posX, int posY){
        super(posX,posY);
    }

    public void desenhar(Graphics g, int largura, int altura){
        g.drawOval(getPosX(), getPosY(), largura, largura);
    }
}
