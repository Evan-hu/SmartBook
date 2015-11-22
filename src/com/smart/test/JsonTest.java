package com.smart.test;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

import com.smart.selector.Json;

public class JsonTest {

	private String text = "callback({\"name\":\"json\"})";
	
	private String textWithBrackerInContent = "callback({\"name\":\"json\"})";
	
	@Test
	public void testRemovePadding() {
		String name = new Json(text).removePadding("callback").jsonPath("$,name").get();
		assertThat(name).isEqualTo("json");
	}

	
	@Test
    public void testRemovePaddingForQuotes() throws Exception {
        String name = new Json(textWithBrackerInContent).removePadding("callback").jsonPath("$.name").get();
        assertThat(name).isEqualTo("json)");
    }
	
}
