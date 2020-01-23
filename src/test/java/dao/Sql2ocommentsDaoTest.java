package dao;

import org.junit.After;
import org.junit.Before;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class Sql2ocommentsDaoTest {
    private Connection conn;
    private Sql2ocommentsDao commentsDao;
    private Sql2oNoticeDao noticeDao;
    @Before
    public void setUp() throws Exception {
        String connectionString = "jdbc:postgresql://localhost:5432/noticeboard_test";
        Sql2o sql2o = new Sql2o(connectionString, "mogere", "password");
        commentsDao = new Sql2ocommentsDao(sql2o);
        noticeDao = new Sql2oNoticeDao(sql2o);
        conn = sql2o.open();
    }

    @After
    public void tearDown() throws Exception {
        conn.close();
    }

    public void setupComments(){

    }
}