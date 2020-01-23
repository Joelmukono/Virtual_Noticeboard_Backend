package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.sql.Timestamp;
import java.util.Date;

import static org.junit.Assert.*;

public class NoticeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    public Notice setupNotice(){
        Timestamp rightNow = new Timestamp(new Date().getTime());
        Notice newNotice = new Notice("Announcement", rightNow,"Great people required Now!", "In need of he greats");
        return newNotice;
    }
    @Test
    public void instantiatesNotice_true(){
        Notice newNotice = setupNotice();
        assertEquals(true, newNotice instanceof Notice);
    }

    @Test
    public void setNoticeTypeTest(){
        Notice newNotice = setupNotice();
        newNotice.setNoticeType("Advertisement");
        assertEquals("Advertisement", newNotice.getNoticeType());
    }

    @Test
    public void getNoticeTypeTest(){
        Notice newNotice = setupNotice();
        assertEquals("Announcement", newNotice.getNoticeType());
    }

    @Test
    public void setTimestampTest(){
        Notice newNotice = setupNotice();
        Timestamp rightNow = new Timestamp(new Date().getTime());
        newNotice.setTimestamp(rightNow);
        assertEquals(rightNow, newNotice.getTimestamp());
    }

    @Test
    public void getTimestampTest(){
        Notice newNotice = setupNotice();
        Timestamp rightNow = new Timestamp(new Date().getTime());
        assertEquals(rightNow, newNotice.getTimestamp());
    }

    @Test
    public void setTitleTest(){
        Notice newNotice = setupNotice();
        newNotice.setTitle("Word on the street");
        assertEquals("Word on the street", newNotice.getTitle());
    }

    @Test
    public void getTitleTest(){
        Notice newNotice = setupNotice();
        assertEquals("In need of he greats", newNotice.getTitle());
    }

    @Test
    public void setNoticeContentTest(){
        Notice newNotice = setupNotice();
        newNotice.setNoticeContent("Word on the street is that good trumps evil");
        assertEquals("Word on the street is that good trumps evil", newNotice.getNoticeContent());
    }

    @Test
    public void getNoticeContentTest(){
        Notice newNotice = setupNotice();
        assertEquals("Great people required Now!", newNotice.getNoticeContent());
    }
}