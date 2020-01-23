import com.google.gson.Gson;
import dao.Sql2ocommentsDao;
import dao.Sql2oNoticeDao;

import models.Comments;
import models.Notice;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        Sql2oNoticeDao noticeDao;
        Sql2ocommentsDao newsDao;

        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:postgresql://localhost:5432/news";;

        Sql2o sql2o = new Sql2o(connectionString, "joel", "password");

        noticeDao = new Sql2oNoticeDao(sql2o);
        newsDao = new Sql2ocommentsDao(sql2o);


    }
}
