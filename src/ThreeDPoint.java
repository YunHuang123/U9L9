public class ThreeDPoint extends Point{
    private int z;

    public ThreeDPoint(String label, int x, int y, int z){
        super(label, x, y);
        this.z = z;
    }

    public int getZ(){
        return z;
    }

    public String toString(){
        return super.toString() + ", z = " + z;
    }

    public boolean equals(Object o){
        ThreeDPoint p = (ThreeDPoint) o;
        if (p.getX() == getX() && p.getY() == getY() && p.getZ() == z){
            return true;
        }
        else{
            return false;
        }
    }
}
