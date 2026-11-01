package a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question5Test {

    @Test
    void testIsTriangleValid() {
        assertTrue(Question5.isTriangle(3, 4, 5));
    }

    @Test
    void testIsTriangleInvalid() {
        assertFalse(Question5.isTriangle(1, 1, 0));
        assertFalse(Question5.isTriangle(1, 2, 3)); // סכום שתי צלעות לא גדול מהשלישית
    }

    @Test
    void testGetTriangleType() {
        assertEquals(3, Question5.getTriangleType(3, 3, 3)); // Equilateral
        assertEquals(2, Question5.getTriangleType(3, 3, 5)); // Isosceles
        assertEquals(1, Question5.getTriangleType(3, 4, 5)); // Scalene
        assertEquals(0, Question5.getTriangleType(0, 0, 0)); // Not a triangle
    }
}