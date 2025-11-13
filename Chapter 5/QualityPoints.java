public class QualityPoints {
    public static int qualityPoints(int avg) {
        if (avg >= 90) return 4;
        if (avg >= 80) return 3;
        if (avg >= 70) return 2;
        if (avg >= 60) return 1;
        return 0;
    }
    public static void main(String[] args) { System.out.println(qualityPoints(85)); } // 3
}
