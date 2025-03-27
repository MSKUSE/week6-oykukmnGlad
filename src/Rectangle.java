public class Rectangle extends Shape{ // shape is the parent/super class (rectangle subclass)

    private int sideA , sideB;

    public static int counter = 0;
    public int counterForObject = 0;
    public static String className = "Rectangle";

    public Rectangle(Point location, int sideA, int sideB){
        super(location);
        setSideA(sideA);
        setSideB(sideB);
        counter++;
        counterForObject++;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        if (sideA <= 0){
            throw new IllegalArgumentException("Side A can't be negative!!");
        }
        else {
            this.sideA = sideA;
        }
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0) {
            this.sideB = 0;
            System.out.println("Side B can't be negative!!");
        } else {
            this.sideB = sideB;
        }
    }

    @Override
    public double perimeter() {
        return 2 * (sideA+sideB);
    }

    @Override
    public double area() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "location=" + this.getLocation() +
                ", sideA=" + this.sideA +
                ", sideB=" + this.sideB +
                ", counterForObject=" + counterForObject +
                '}';
    }
}
