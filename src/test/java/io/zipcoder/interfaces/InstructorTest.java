package io.zipcoder.interfaces;

import org.junit.*;

import static org.junit.Assert.*;

public class InstructorTest {

    Instructor instructor = new Instructor(12312, "joe");


    @Test
    public void testImplementation() {
        Instructor instructor = new Instructor(12312, "joe");
        boolean instructorIsTeacher;


        if (instructor instanceof Teacher) {
            instructorIsTeacher = true;
        } else {
            instructorIsTeacher = false;
        }
        //assert something
        Assert.assertTrue(instructorIsTeacher);
    }

    @Test
    public void testInheritance() {
        Instructor instructor = new Instructor(12312, "joe");
        boolean instructorIsPerson;


        if (instructor instanceof Person) {
            instructorIsPerson = true;
        } else {
            instructorIsPerson = false;
        }
        //assert something
        Assert.assertTrue(instructorIsPerson);
    }

    @Test
    public void testTeach() {
            Student student = new Student(12312, "jeff");
            instructor.teach(student,20);
            double expected = 2;
            double actual = student.getTotalStudyTime();


            assertEquals(expected, actual, 0);

        }


    // didn't do this test because it seems to the same as the one before

}