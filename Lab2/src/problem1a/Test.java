package problem1a;

public class Test {
    public static void main(String[] args) {
        Shape cube = new Cube(5);
        Shape cylinder = new Cylinder(6, 3);
        Shape sphere = new Sphere(4);

        System.out.println("Cube: Volume = " + cube.volume() + ", Surface Area = " + cube.surfaceArea());
        System.out.println("Cylinder: Volume = " + cylinder.volume() + ", Surface Area = " + cylinder.surfaceArea());
        System.out.println("Sphere: Volume = " + sphere.volume() + ", Surface Area = " + sphere.surfaceArea());
    }
}
