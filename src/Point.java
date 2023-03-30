public class Point implements Comparable{
    private int x;
    private int y;
    private String label;

    public Point(String l, int x, int y){
        label = l;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getLabel() {
        return label;
    }

    public int sum(){
        return x + y;
    }

    public String toString(){
        return "Point " + label + " is at x = " + x + ", y = " + y;
    }

    public boolean equals(Object o){
        Point p = (Point) o;
        if (p.getX() == x && p.getY() == y){
            return true;
        }
        else{
            return false;
        }
    }

    public int compareTo(Object o){
        Point p = (Point) o;
        if (label.compareTo(p.getLabel()) != 0){
            return label.compareTo(p.getLabel());
        }
        else{
            return this.sum() - p.sum();
        }
    }
}
