import java.util.*;

public class KhaiBaoLopHinhChuNhat {
    public static class Rectangle {
        private long width;
        private long height;
        private String color;

        public Rectangle(long w, long h, String c) {
            if (w <= 0 || h <= 0) {
                throw new IllegalArgumentException();
            }
            this.width = w;
            this.height = h;
            this.color = Character.toUpperCase(c.charAt(0)) + c.substring(1).toLowerCase();
        }

        public long findPerimeter () {
            return (this.width + this.height) * 2;
        }

        public long findArea () {
            return this.width * this.height;
        }

        public String getColor () {
            return this.color;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Rectangle hcn = new Rectangle(sc.nextLong(), sc.nextLong(), sc.next());
            System.out.printf("%d %d %s", hcn.findPerimeter(), hcn.findArea(), hcn.getColor());
        }
        catch (Exception e) {
            System.out.print("INVALID");
        }

        sc.close();
    }
}
