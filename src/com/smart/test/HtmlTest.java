package com.smart.test;


import org.junit.Test;

import com.smart.selector.Html;
import com.smart.selector.Selectable;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author code4crafter@gmail.com <br>
 * Date: 13-4-21
 * Time: 上午8:42
 */
public class HtmlTest {

    @Test
    public void testRegexSelector() {
        Html selectable = new Html("aaaaaaab");
		assertThat(selectable.regex("(a+b)").replace("aa(a)", "$1bb").toString()).isEqualTo("abbabbab");
    }

	@Test
	public void testDisableJsoupHtmlEntityEscape() throws Exception {
		Html.DISABLE_HTML_ENTITY_ESCAPE = true;
		Html html = new Html("aaaaaaa&b");
		assertThat(html.regex("(aaaaaaa&b)").toString()).isEqualTo("aaaaaaa&b");
	}

	@Test
	public void testEnableJsoupHtmlEntityEscape() throws Exception {
		Html.DISABLE_HTML_ENTITY_ESCAPE = false;
		Html html = new Html("aaaaaaa&b");
		assertThat(html.regex("(aaaaaaa&amp;b)").toString()).isEqualTo("aaaaaaa&amp;b");
	}

	@Test
	public void testAHrefExtract(){
		Html html = new Html("<a data-tip=\"p$t$xxx\" href=\"/xx/xx\">xx</a>");
		assertThat(html.links().all()).contains("/xx/xx");
	}

	@Test(expected = NullPointerException.class)
	public void testNthNodesGet(){
		Html html = new Html("<a data-tip=\"p$t$xxx\" href=\"/xx/xx\">xx</a>");
		assertThat(html.xpath("//a[1]/@href").get()).isEqualTo("/xx/xx");
		Selectable selectable = html.xpath("//a[1]").nodes().get(0);
		System.out.println("selectable =" + selectable.toString());
		assertThat(selectable.xpath("@href").get()).isEqualTo("/xx/xx");
	}
}