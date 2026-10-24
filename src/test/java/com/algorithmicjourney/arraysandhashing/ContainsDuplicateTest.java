package com.algorithmicjourney.arraysandhashing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateTest {

    private final ContainsDuplicate solution = new ContainsDuplicate();

    @Test
    void hasDuplicate_withDuplicate_returnsTrue() {
        assertTrue(solution.hasDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void hasDuplicate_noDuplicate_returnsFalse() {
        assertFalse(solution.hasDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void hasDuplicate_singleElement_returnsFalse() {
        assertFalse(solution.hasDuplicate(new int[]{1}));
    }
}
