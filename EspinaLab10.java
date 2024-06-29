class EspinaLab10
{
    private double length = 1.0;
    private double width = 1.0;

    double getLength()
    {
        return length;
    }

    double getWidth()
    {
        return width;
    }

    void setLength(double newValue)
    {
        if (newValue >= 0.0 && newValue < 20.0)
        {
            length = newValue;
        }
        else
        {
            System.out.println("Invalid value.");
        }
    }

    void setWidth(double newValue)
    {
        if (newValue >= 0.0 && newValue < 20.0)
        {
            width = newValue;
        }
        else
        {
            System.out.println("Invalid value.");
        }
    }

    double getPerimeter()
    {
        return (length + width ) * 2;
    }

    double getArea()
    {
        return length * width;
    }
}