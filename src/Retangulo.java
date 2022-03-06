import java.awt.Graphics;

public class Retangulo extends ShapeFactory{
    private int largura;
    private int altura;

    public Retangulo(int posX, int posY, Shape descShape, int largura, int altura){
        super(posX, posY, descShape);
        this.largura = largura;
        this.altura = altura;
    }

    public void desenhar(Graphics g){
        g.drawRect(getPosX(), getPosY(), largura, altura);
    }
}
