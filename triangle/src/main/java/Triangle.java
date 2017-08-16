public class Triangle {

    private TriangleKind triangleKind;

    public Triangle(double side1, double side2, double side3) throws TriangleException {
        // Verify that the triangle is valid, otherwise throw an exception:
        // http://www.mathwarehouse.com/geometry/triangles/triangle-inequality-theorem-rule-explained.php
        boolean isValidTriangle = side1 + side2 > side3 &&
                side1 + side3 > side2 &&
                side2 + side3 > side1;
        if (!isValidTriangle) {
            throw new TriangleException();
        }
        // Set our triangle type
        if (side1 == side2 && side2 == side3) {
            // If all three sides are the same, it's equilateral.
            triangleKind = TriangleKind.EQUILATERAL;
        } else if (side1 == side2 || side2 == side3 || side1 == side3) {
            // If only two of the sides are equal, then it's isosceles.
            triangleKind = TriangleKind.ISOSCELES;
        } else {
            // If none of the sides are the same, then it's scalene.
            triangleKind = TriangleKind.SCALENE;
        }
    }

    public TriangleKind getKind() {
        return triangleKind;
    }
}
