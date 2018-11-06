package com.example.PracJson;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hamcrest.core.AllOf;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class MatcherTest {

    @Before
    public void setUp(){

    }

    @Test
    public  void testMatcher_Core(){
        assertThat(1,is(1));
        assertThat("This String", is("This String"));
        assertThat(1,any(Integer.class));

    }

    @Test
    public  void testMatcher_Logical(){
        assertThat(new Long(123),not(new Integer(123)));
        assertThat(123, instanceOf(Integer.class));
        assertThat(123,equalTo(new Integer(123)));
        assertThat(1, notNullValue(Integer.class));
        assertThat(null,nullValue(String.class));

    }

    @Test
    public  void testMatcher_CombiningMatchers() {

        // JUnit 4 for equals check
        assertEquals("123", new String("123"));
        // Hamcrest for equals check
        assertThat(123, is(equalTo(new Integer(123))));

        // JUnit 4 for not equals check
        assertNotEquals(new Integer(23), new Integer(123));
        // Hamcrest for not equals check
        assertThat(23, is(not(equalTo(new Integer(123)))));

    }

    @Test
    public void HamcrestListMatcherTest(){
        List<Integer> numbers = Arrays.asList(12,23,34,45);
        assertThat(numbers,contains(12,23,34,45));
        assertThat(numbers, containsInAnyOrder(34,23, 45,12));
        assertThat(numbers, everyItem(greaterThan(1)));

    }
    @Test
    public void objectHasSummaryProperty () {
        Todo todo = new Todo(1, "Learn Hamcrest", "Important",1221);
        assertThat(todo, hasProperty("summary"));
    }

    @Test
    public void anyOf_allOf(){
        String str="abc";
        int num = 12;
        assertThat(num, allOf(equalTo(12), equalTo(6*2)));
        assertThat(str, anyOf(equalTo("abc"), equalTo(123)));
    }

}
@AllArgsConstructor
@NoArgsConstructor
@Data
class Todo{
    private  long id;
    private String summary;
    private String description;
    private int year;
}
