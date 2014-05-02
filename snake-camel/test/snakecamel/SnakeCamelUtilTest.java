package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import snakecamel.SnakeCamelUtil;
import org.junit.Test;

public class SnakeCamelUtilTest {


	@Test
	public void capitalize�ŒP��̍ŏ��̕��������啶���ɂł�����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "Xyz";
		String actual = scu.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void uncapitalize�ŒP��̍ŏ��̕��������������ɂł�����() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "xyz";
		String actual = scu.uncapitalize("Xyz");
		assertThat(actual, is(expected));
	}
	@Test
	public void �X�l�[�N�P�[�X����L�������P�[�X�֕ϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "AbcDef";
		String actual = scu.snakeToCamelcase("_abc_def__");
		assertThat(actual, is(expected));
	}
	@Test
	public void �L�������P�[�X����X�l�[�N�P�[�X�֕ϊ�() {
		SnakeCamelUtil scu = new SnakeCamelUtil();
		String expected = "abc_def_gh";
		String actual = scu.camelToSnakecase("AbcDefGh");
		assertThat(actual, is(expected));
	}

}
