public class Triangle extends Shape{

    private int sideA,sideB,sideC;

    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    @Override
    public double perimeter() {
        return (sideA+sideB+sideC);
    }

    @Override
    public double area() {
        return (sideA*sideB) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + this.sideA +
                ", sideB=" + this.sideB +
                ", sideC=" + this.sideC +
                '}';
    }
}
