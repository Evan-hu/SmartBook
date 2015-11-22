package com.smart.test;


import org.junit.Test;

import com.smart.ResultItems;

import static org.assertj.core.api.Assertions.*;

public class ResultItemsTest {

	@Test
    public void testOrderOfEntries() throws Exception {
		ResultItems resultItems = new ResultItems();
		resultItems.put("a", "a");
        resultItems.put("b", "b");
        resultItems.put("c", "c");
        assertThat(resultItems.getAll().keySet()).containsExactly("a","b","c");

    }

}
