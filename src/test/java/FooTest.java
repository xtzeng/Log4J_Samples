import manual.configuration.Foo;

import org.junit.Test;

//junit 读取src/test/resources下的logback.xml
public class FooTest {

	@Test
	public void test() {
		Foo foo = new Foo();
		foo.doIt();
	}
}
