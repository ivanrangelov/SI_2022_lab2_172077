Цикломатската комплексност на овој код е 9, истата ја добив преку формулата P+1, каде што P е бројот на предикатни јазли. Во случајoв P=1, па цикломатската комплексност изнесува 9.


  @Test
    void test1() { // Every statement , C0 тест метода со која влегуваме во секоја линија код
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("x", "#", "x", "#", "#", "x", "x")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> expected = List.of("2", "#", "2", "#", "4", "#", "2", "#", "2");
        List<String> initial = List.of("x", "#", "x", "#", "x", "#", "x", "#", "x");
        assertEquals(SILab2.function(initial), expected);
    }



    @Test
    void test2() { // Every branch C1 тест метода со која влегуваме во секоја гранка
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of()));
        assertTrue(ex.getMessage().contains("List length should be greater than 0"));

        ex = assertThrows(IllegalArgumentException.class, () -> SILab2.function(List.of("x", "#", "x", "#", "x", "#")));
        assertTrue(ex.getMessage().contains("List length should be a perfect square"));

        List<String> initial = List.of("x", "#", "x", "#", "#", "x", "#", "#", "x", "#", "x", "#", "x", "x", "x", "#");
        List<String> expected = List.of("2", "#", "3", "#", "#", "4", "#", "#", "2", "#", "3", "#", "x", "1", "1", "#");
        assertEquals(SILab2.function(initial), expected);
    }
