package ru.easyjava.maven;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Unit test for simple App.
 */
public class GreetingTargetTest {
    @Test
    public void testGreet() {
        assertThat(GreetingTarget.getTarget(), is("Modules"));
    }
}
