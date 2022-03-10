import java.awt.Graphics;

public class Oval extends Shapes {

    public Oval(int posX, int posY){
        super(posX,posY);
    }

    public void desenhar(Graphics g, int largura, int altura){
        g.drawOval(getPosX(), getPosY(), largura, altura);
    }
}