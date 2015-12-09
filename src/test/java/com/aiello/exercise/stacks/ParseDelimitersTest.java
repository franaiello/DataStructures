package com.aiello.exercise.stacks;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ParseDelimitersTest {
    @Test
    public void parseDelimiters() {
        Boolean result = ParseDelimiters.parseString("a{b(c[d]d)f}");
        assertThat(result).isTrue();
    }

    @Test
    public void parseUnevenDelimiters() {
        Boolean result = ParseDelimiters.parseString("a{b(c[dd)f}");
        assertThat(result).isFalse();
    }
}
