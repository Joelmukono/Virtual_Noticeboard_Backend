import com.google.gson.Gson;
import dao.Sql2ocommentsDao;
import dao.Sql2oNoticeDao;
import  dao.Sql2oUserDao;

import models.Comments;
import models.Notice;
import models.Users;

import org.sql2o.Connection;
import org.sql2o.Sql2o;
import static spark.Spark.*;

public class App {
    public static void main(String[] args){
        Sql2oNoticeDao noticeDao;
        Sql2ocommentsDao commentsDao;
        Sql2oUserDao userDao;

        Connection conn;
        Gson gson = new Gson();

        String connectionString = "jdbc:postgresql://localhost:5432/noticeboard";;

        Sql2o sql2o = new Sql2o(connectionString, "joel", "password");

        noticeDao = new Sql2oNoticeDao(sql2o);
        commentsDao = new Sql2ocommentsDao(sql2o);
        userDao = new Sql2oUserDao(sql2o);


        post("/notice/:userId/notice/new/","application/json",(request,response)->{
            Notice notice = gson.fromJson(request.body(), Notice.class);
            int useId = Integer.parseInt(request.params("userId"));
            notice.setUserId(useId);
            noticeDao.add(notice);
            response.status(201);
            response.type("application/json");
            return gson.toJson(notice);


        });

        get("/notices/all/","application/json",(request,response)->{
            response.type("application/json");
            return gson.toJson(noticeDao.getAll());
        });

        get("/notice/:noticeId/","application/json",(request,response)->{
            response.type("application/json");
            int noticeId = Integer.parseInt(request.params("noticeId"));
            response.type("application/json");
            return gson.toJson(noticeDao.findNoticeById(noticeId));
        });

        post("/commnets/:userId/:noticeId/new/comment/","application/json",(request, response) -> {
            Comments comments = gson.fromJson(request.body(),Comments.class);
            commentsDao.add(comments);
            response.status(201);
            response.type("application/json");
            return gson.toJson(comments);

        });

        get("/comments/all/","application/json",(request,response)->{
            response.type("application/json");
            return gson.toJson(commentsDao.getAll());
        });

        get("/comments/:commentsId/","application/json",(request,response)->{
            response.type("application/json");
            int commentId = Integer.parseInt(request.params("commentsId"));
            response.type("application/json");
            return gson.toJson(commentsDao.findCommentById(commentId));
        });


        post("/user/new/","application/json",(request, response) -> {
            Users user = gson.fromJson(request.body(),Users.class);
            userDao.add(user);
            response.status(201);
            response.type("application/json");
            return gson.toJson(user);

        });

        get("/users/all/","application/json",(request,response)->{
            response.type("application/json");
            return gson.toJson(userDao.getAll());
        });

        get("/users/:usersId/","application/json",(request,response)->{
            response.type("application/json");
            int userId = Integer.parseInt(request.params("userId"));
            response.type("application/json");
            return gson.toJson(commentsDao.findCommentById(userId));
        });

    }
}
