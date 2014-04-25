package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import snakecamel.SnakeCamelUtil;
import org.junit.Test;

public class SnakeCamelUtilTest {


	@Test
	public void capitalizeで単語の最初の文字だけ大文字にできそう() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Tanuki";
		String actual = scu.capitalize("tanuki");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalizeで単語の最初の文字だけ小文字にできそう() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "tanuki";
		String actual = scu.uncapitalize("Tanuki");
		assertThat(actual, is(expected));
	}
	@Test
	public void スネークケースからキャメルケースへ変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "TanukiSekiguchi";
		String actual = scu.snakeToCamelcase("tanuki_sekiguchi");
		assertThat(actual, is(expected));
	}
	@Test
	public void キャメルケースからスネークケースへ変換() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "tanuki_sekiguchi";
		String actual = scu.camelToSnakecase("TanukiSekiguchi");
		assertThat(actual, is(expected));
	}

}
