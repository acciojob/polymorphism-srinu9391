public class Main {
    static class Product {
        public int product(int x, int y) {
            return x * y;
        }

        public int product(int x, int y, int z) {
            return x * y * z;
        }

        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Creating object of Product class
        Product p = new Product();

        // Calling the method product with two integer parameters
        int result1 = p.product(2, 3);
        //System.out.println(result1);

        // Calling the method product with three integer parameters
        int result2 = p.product(2, 3, 4);
        //System.out.println(result2);

        // Calling the method product with two double parameters
        double result3 = p.product(2.5, 3.5);
        //System.out.println(result3);
    }
}
