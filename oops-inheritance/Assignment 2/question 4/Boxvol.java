  class Box
{
    double width;
    double height;
    double depth;
        Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
        double volume()
    {
        return width * height * depth;
    }
}

class Boxvol
{
    public static void main(String args[])
    {
        
        Box box1 = new Box(100, 200, 150);      
        double vol;

        vol = box1.volume();
        System.out.println("Volume of the box is " + vol);
        
    }
}
