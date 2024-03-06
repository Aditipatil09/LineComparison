public class linecompariosn {
    public static double firstLineLength;
    public static double secondLineLength;
    private static double calculatingLengthOfLine(int x1, int x2, int y1, int y2){
        double lineLength;
        lineLength  =Math.sqrt(Math.pow(x2-x1 ,2) +(Math.pow(y2-y1,2)));
        return lineLength;
    }
    private static void compareLine() {
        String stringFirst = String.valueOf(firstLineLength);
        String stringSecond = String.valueOf(secondLineLength);
        int check = stringFirst.compareTo(stringSecond);
        if (check == 0) {
            System.out.println("Both Lines are equals");
        } else {
            if (check > 0) {
                System.out.println("First Line is longer than second line");
            } else {
                System.out.println("Second line is longer than first line");
            }
        }
    }
    public static void main (String args[]){
        System.out.println("welcome to line comparison program:");
        firstLineLength = calculatingLengthOfLine (3,2,6,8);
        System.out.println(firstLineLength);
        secondLineLength = calculatingLengthOfLine (5,2,5,6);
        System.out.println(secondLineLength);
        compareLine();
    }
}

