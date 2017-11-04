package io.zipcoder.interfaces;
import org.junit.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.notification.RunListener;

public class TestPerson {

    @Test
    private void testConstructor() {

        Person person = new Person(1213, "joe");
            long expected = 1213;

            long actual = person.getId();

            Assert.assertEquals(expected, actual);

    }

    @Test
    private void testSetName() {
        Person personName = new Person(1213, "joe");
        String expected = "joe";
        String actual = personName.getName();

        Assert.assertEquals(expected,actual);
    }








}