public class StudentResult {

    public int calculateTotal(int java, int dbms, int devops) {
        return java + dbms + devops;
    }

    public double calculateAverage(int java, int dbms, int devops) {
        return (java + dbms + devops) / 3.0;
    }

    public String calculateGrade(double average) {
        if (average >= 90) {
            return "A";
        } else if (average >= 75) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else {
            return "D";
        }
    }
}