package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import snakecamel.SnakeCamelUtil;
import org.junit.Test;

public class SnakeCamelUtilTest {


	@Test
	public void capitalize�ŒP��̍ŏ��̕��������啶���ɂł�����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Tanuki";
		String actual = scu.capitalize("tanuki");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalize�ŒP��̍ŏ��̕��������������ɂł�����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "tanuki";
		String actual = scu.uncapitalize("Tanuki");
		assertThat(actual, is(expected));
	}
	@Test
	public void �X�l�[�N�P�[�X����L�������P�[�X�֕ϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "TanukiSekiguchi";
		String actual = scu.snakeToCamelcase("tanuki_sekiguchi");
		assertThat(actual, is(expected));
	}
	@Test
	public void �L�������P�[�X����X�l�[�N�P�[�X�֕ϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "tanuki_sekiguchi";
		String actual = scu.camelToSnakecase("TanukiSekiguchi");
		assertThat(actual, is(expected));
	}

}
