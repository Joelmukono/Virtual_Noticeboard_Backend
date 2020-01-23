package dao;

import models.Comments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;
public class Sql2ocommentsDao implements commentsDao {

    private final Sql2o sql2o;
    public Sql2ocommentsDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Comments comments){
        String sql = "INSERT INTO comments (commentText,noticeId) VALUES (:commentText,:noticeId)";
        try(Connection con = sql2o.open()){
            int commentId = (int) con.createQuery(sql,true).bind(comments).executeUpdate().getKey();
            comments.setCommentId(commentId);

        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
    @Override
    public List<Comments> getAll(int userId){
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM comments WHERE userId = :userId").addParameter("userId", userId ).executeAndFetch(Comments.class);

        }
    }

    @Override
    public Comments findCommentById(int commentId){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM comments WHERE commentId = :commentId")
                    .addParameter("noticeId",commentId).executeAndFetchFirst(Comments.class);
        }

    }

    @Override
    public void deleteCommentById(int commentId) {
        String sql = "DELETE from comments WHERE commentId=:commentId"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("commentId", commentId)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll(){
        String sql = "DELETE FROM comments";
        try (Connection connection = sql2o.open()){
            connection.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){ System.out.println(ex);}
    }

}
