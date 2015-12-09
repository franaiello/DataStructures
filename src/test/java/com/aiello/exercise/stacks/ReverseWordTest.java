package com.aiello.exercise.stacks;


import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ReverseWordTest {
    @Test
    public void findFirstNonRepeatedCharInString() {
        String result = ReverseWord.reverse("teeter");
        assertThat(result).isEqualTo("reteet");

//        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("teeter");
//        assertThat(character).isEqualTo('r');
//
//        character = FirstNonRepeatedCharacter.findFirstNonRepeatedCharInString("aftaftftftftrrrrvvvvvvnnnnnikgzghgh");
//        assertThat(character).isEqualTo('i');
    }
}
