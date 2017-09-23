package triangle;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

public class ExampleTest {

	@Test
	public void testGetStandardColorNames() throws Exception {
		List<String> result = Example.getStandardColorNames();
		assertThat(result).contains("Blue");
		assertThat(result).doesNotContain("White");
	}

}
