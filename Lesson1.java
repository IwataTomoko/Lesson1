public class Lesson1 {
    public static void main(String[] args) {

        //10回連続でHello worldを出力、11回目からはHelloだけを出力.

        for (int i = 0; i < 20; i++) {
            if (i < 11) {
                System.out.println("Hello World");
            } else {
                System.out.println("Hello");
            }
        }
    }
}
