class Square extends Rectangle

{
    private double length,breadth;
    public Square(Double length)
    {

        this.length=length;
        this.breadth=length;
    }

public double getperimeter()
{
return (length+breadth)*2;

}
public double getarea()
{

    return length*breadth;
}


}