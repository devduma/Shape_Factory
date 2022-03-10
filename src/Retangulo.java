import java.awt.Graphics;

public class Retangulo extends Shapes {

    public Retangulo(int posX, int posY){
        super(posX,posY);
    }

    public void desenhar(Graphics g, int largura, int altura){
        g.drawRect(getPosX(), getPosY(), largura, altura);
    }
}
