public class Ponto {

    private double x;
    private double y;

    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    // X

    public double getX(){
        return this.x;
    }

    public void setX(double x){
        this.x = x;
    }

    // Y
    
    public double getY(){
        return this.y;
    }
    
    public void setY(double y){
        this.y = y;
    }

    public void setXY(double x, double y){
        this.x = x;
        this.y = y;
    }
}