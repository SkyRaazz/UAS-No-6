public class Pyramid_right_pattern2 {
    public static void main(String[] args) {
        int syarat = 6;
        for(int i = 1; i <= syarat; i++) {
            for(int j = syarat; j >= i; j--) {
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
