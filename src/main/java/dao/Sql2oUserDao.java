package dao;
import models.Notice;
import models.Users;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;
import java.util.List;


public class Sql2oUserDao implements userDao {
    private final Sql2o sql2o;
    public Sql2oUserDao(Sql2o sql2o){
        this.sql2o = sql2o;
    }

    @Override
    public void add(Users users){
        String sql = "INSERT INTO users (username,password) VALUES (:userName,:password)";
        try(Connection con = sql2o.open()){
            int userId = (int) con.createQuery(sql,true).bind(users).executeUpdate().getKey();
            users.setUserId(userId);

        }catch (Sql2oException ex){
            System.out.println(ex);
        }
    }
    @Override
    public List<Users> getAll(){
        try(Connection con = sql2o.open()){
            return con.createQuery("SELECT * FROM users").executeAndFetch(Users.class);

        }
    }

    @Override
    public Users findUserById(int userId){
        try(Connection conn = sql2o.open()){
            return conn.createQuery("SELECT * FROM users WHERE userId = :userId")
                    .addParameter("userId",userId).executeAndFetchFirst(Users.class);
        }

    }

    @Override
    public void deleteUserById(int noticeId) {
        String sql = "DELETE from notices WHERE noticeId=:noticeId"; //raw sql
        try (Connection con = sql2o.open()) {
            con.createQuery(sql)
                    .addParameter("noticeId", noticeId)
                    .executeUpdate();
        } catch (Sql2oException ex){
            System.out.println(ex);
        }
    }

    @Override
    public void clearAll(){
        String sql = "DELETE FROM notice";
        try (Connection connection = sql2o.open()){
            connection.createQuery(sql)
                    .executeUpdate();
        } catch (Sql2oException ex){ System.out.println(ex);}
    }

}
