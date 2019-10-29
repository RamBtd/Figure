public class HourGlass {
    public static void main(String[] args) {
        drawLine();
        drawTop();
    }

        //produce the line of the figure
        public static void drawLine() {
        System.out.print("+");
        for (int i = 1; i <= 6; i++) {
            System.out.print("-");
        }
            System.out.println("+");
        }
        //produce the top of the figure
        public static void drawTop(){
        for (int i=1; i<=3;i++){
            System.out.println("|");
        }
        for(int i=1; i<=3; i++){
            System.out.print(" ");
        }
        System.out.print("\\");
        }
    }


