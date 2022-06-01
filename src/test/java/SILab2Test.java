import org.junit.jupiter.api.test;


public class SILab2Test {


    @Test
    void test1() { // Every statement
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("x", "#", "x", "#", "#", "x", "x")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> expected = List.of("2", "#", "2", "#", "4", "#", "2", "#", "2");
        List<String> initial = List.of("x", "#", "x", "#", "x", "#", "x", "#", "x");
        assertEquals(SILab2.function(initial), expected);
    }

    @Test
    void test2() { // Every branch
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("x", "#", "x", "#", "x", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> initial = List.of("x", "#", "x", "#", "#", "x", "#", "#", "x", "#", "x", "#", "x", "x", "x", "#");
        List<String> expected = List.of("2", "#", "3", "#", "#", "4", "#", "#", "2", "#", "3", "#", "x", "1", "1", "#");
        assertEquals(SILab2.function(initial), expected);
    }


}

