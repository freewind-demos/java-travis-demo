package demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {

    @Test
    public void shouldGreetingWithPassingName() throws Exception {
        Hello hello = new Hello();
        assertEquals("Hello, Freewind!", hello.greeting("Freewind"));
    }

}
