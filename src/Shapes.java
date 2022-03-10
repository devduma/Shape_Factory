import java.awt.Graphics;

public abstract class Shapes {
    private final int posX;
    private final int posY;

    public Shapes(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }

    public void desenhar(Graphics g, int largura, int altura){
    }
}
