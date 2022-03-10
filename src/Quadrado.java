import java.awt.Graphics;

public class Quadrado extends Shapes{
    public Quadrado(int posX, int posY){
        super(posX,posY);
    }

    public void desenhar(Graphics g, int tamanho){
        g.drawRect(getPosX(), getPosY(), tamanho, tamanho);
    }
    }
