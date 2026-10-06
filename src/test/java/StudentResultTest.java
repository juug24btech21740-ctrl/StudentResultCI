import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StudentResultTest {

    StudentResult result = new StudentResult();

    @Test
    public void testCalculateTotal() {
        assertEquals(240, result.calculateTotal(80, 70, 90));
    }

    @Test
    public void testCalculateAverage() {
        assertEquals(80.0, result.calculateAverage(80, 70, 90));
    }

    @Test
    public void testCalculateGrade() {
        assertEquals("B", result.calculateGrade(80));
    }
}