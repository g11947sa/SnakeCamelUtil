package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import snakecamel.SnakeCamelUtil;
import org.junit.Test;

public class SnakeCamelUtilTest {


	@Test
	public void capitalizeで単語の最初の文字だけ大文字にできそう() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeで単語の最初の文字だけ小文字にできそう() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void スネークケースからキャメルケースへ変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	@Test
	public void キャメルケースからスネークケースへ変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}

}
