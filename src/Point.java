public class Point {
    private int x;
    private int y;

    public Point (int x,int y){
        this.x = x ;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {

        return this.y;
    }

    public void setX(int x) {

        this.x = x;
    }

    public void setY(int y) {

        this.y = y;
    }

    public double distance(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2));
    }
    public double distance(Point p){

        return Math.sqrt((p.x-this.x)*(p.x-this.x)+(p.y-this.y)*(p.y-this.y));
    }
    public double distance(int a,int b){
        return Math.sqrt((a-this.x)*(a-this.x)+(b-this.y)*(b-this.y));
    }
}
