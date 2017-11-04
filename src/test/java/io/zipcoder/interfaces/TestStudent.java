package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestStudent {



    @Test
    public void testImplementationPass() {
        Student student = new Student(12312, "jeff");
        boolean studentIsLearner;


        if (student instanceof Learner) {
            studentIsLearner = true;
        } else {
            studentIsLearner = false;
        }
        //assert something
        Assert.assertTrue(studentIsLearner);
    }


    @Test
    public void testInheritancePass(){
        Student student = new Student(12312, "jeff");
        boolean studentIsPerson;


        if (student instanceof Person) {
            studentIsPerson = true;
        } else {
            studentIsPerson = false;
        }

        Assert.assertTrue(studentIsPerson);

    }



    @Test
    public void testLearn (){
        Student student = new Student(12312, "joe");
        student.learn(8);
         double expected = 8;
         double actual = student.getTotalStudyTime();

         assertEquals(expected, actual, 0);


    }



}