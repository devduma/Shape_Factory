

public abstract class ShapeFactory {
    private final int posX;
    private final int posY;
    private final Shape descShape;

    public ShapeFactory(int posX, int posY, Shape descShape){
        this.posX = posX;
        this.posY = posY;
        this.descShape = descShape;
    }

    public int getPosX(){
        return posX;
    }

    public int getPosY(){
        return posY;
    }


    public static Shape getShapes(){
        //
        Shape shapes = null;
        return shapes;
    }

    public void desenhar(){
    }
}
