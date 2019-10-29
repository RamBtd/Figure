public class fake {
    public static void main(String[] args) {
        drawLine();
        drawBottom();
    }

    //produce the line of the figure
    public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 30; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 1; i <= 10; i++) {
            System.out.print("/");
        }
        System.out.println("");
    }

    //produce the bottom of the figure
    public static void drawBottom() {
        for (int i = 1; i <= 5; i++) {
                for (int k = 10; k>= 10 - 2; k--) {
                    System.out.print("|   Building Java Programs     |");
                }
                    System.out.print("/");
            }
        System.out.println(" ");

    }
}











