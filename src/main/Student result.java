public class StudentResult {

    public int calculateTotal(int a, int b, int c) {
        return a + b + c;
    }

    public double calculateAverage(int a, int b, int c) {
        return calculateTotal(a, b, c) / 3.0;
    }

    public String calculateGrade(int marks) {
        if (marks >= 80) {
            return "B";
        } else if (marks >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}