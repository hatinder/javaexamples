package examples;

import examples.ReverseCharacters;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

class ReverseCharactersTest {
    ReverseCharacters rc;

    @Test
    void testReverseInParentheses()
    {
        rc=new ReverseCharacters();
        Assertions.assertEquals(rc.reverseInParentheses("(bar)"),"rab");
    }

    @Test
    void testReverseInParentheses2()
    {
        rc=new ReverseCharacters();
        Assertions.assertEquals(rc.reverseInParentheses("foo(bar)baz"),"foorabbaz");
    }

    @Test
    void testReverseInParentheses3()
    {
        rc=new ReverseCharacters();
        Assertions.assertEquals(rc.reverseInParentheses("foo(bar)baz(blim)"),"foorabbazmilb");
    }

    @Test
    void testReverseInParentheses4()
    {
        rc=new ReverseCharacters();
        Assertions.assertEquals(rc.reverseInParentheses("foo(bar(baz))blim"),"foobazrabblim");
    }

    @Test
    void testReverseInParentheses5()
    {
        rc=new ReverseCharacters();
        Assertions.assertEquals(rc.reverseInParentheses("foo(bar(baz))blim"),"foobazrabblim");
    }

}