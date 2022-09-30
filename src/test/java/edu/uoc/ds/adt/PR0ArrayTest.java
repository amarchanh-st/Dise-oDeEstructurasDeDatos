package edu.uoc.ds.adt;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PR0ArrayTest {

    PR0Array pr0Array;

    @Before
    public void setUp() {
        this.pr0Array = new PR0Array();

        assertNotNull(this.pr0Array.getArray());
    }

    @Test
    public void arrayTest() {
        int[] v = this.pr0Array.getArray();
        // Por cada elemento del array...
        for (int i = 0; i < v.length; i++) {
            // Se comprueba que el valor en el indice de dicho elemento es igual al par que ocupa esa posicion
            assertEquals(i*2, v[i]);
        }
    }

    @Test
    public void searchArray() {
        int index = this.pr0Array.getIndexOf(41);
        assertEquals(-1, index);
        index = this.pr0Array.getIndexOf(14);
        assertEquals(7, index);
        index = this.pr0Array.getIndexOf(48);
        assertEquals(24, index);
    }

    @Test
    public void binarySearchArray() {
        int index = this.pr0Array.binarySearch(41);
        assertEquals(-1, index);
        index = this.pr0Array.binarySearch(14);
        assertEquals(7, index);
    }
}
