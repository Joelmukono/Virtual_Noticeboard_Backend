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

        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:postgresql://localhost:5432/news";;

        Sql2o sql2o = new Sql2o(connectionString, "joel", "password");

        userDao = new Sql2oUserDao(sql2o);
        departmentDao = new Sql2oDepartmentDao(sql2o);
        newsDao = new Sql2oNewsDao(sql2o);

    }
}
