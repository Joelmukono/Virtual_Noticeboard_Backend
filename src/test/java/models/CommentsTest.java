package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

public class CommentsTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Comments setupComments(){
        Timestamp rightNow = new Timestamp(new Date().getTime());
        Comments newComment= new Comments(rightNow,"Thank you for the information");
        return newComment;
    }
    @Test
    public void instantiatesComments_true(){
        Comments newComments = setupComments();
        assertEquals(true, newComments instanceof Comments);
    }


    @Test
    public void setTimestampTest(){
        Comments newComments = setupComments();
        Timestamp rightNow = new Timestamp(new Date().getTime());
        newComments.setTimestamp(rightNow);
        assertEquals(rightNow, newComments.getTimestamp());
    }

    @Test
    public void getTimestampTest(){
        Comments newComments= setupComments();
        Timestamp rightNow = new Timestamp(new Date().getTime());
        assertEquals(rightNow, newComments.getTimestamp());
    }

    @Test
    public void setCommentTextTest(){
        Comments newComments = setupComments();
        newComments.setCommentText("Thank you for the Amazing information");
        assertEquals("Thank you for the Amazing information", newComments.getCommentText());
    }

    @Test
    public void getCommentTextTest(){
        Comments newComments = setupComments();
        assertEquals("Thank you for the information", newComments.getCommentText());
    }


}