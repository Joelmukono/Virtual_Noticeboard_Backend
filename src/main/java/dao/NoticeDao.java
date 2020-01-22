package dao;
import models.Comments;

import java.util.List;
public interface NoticeDao {

    void add(Comments news);

    List<Comments> getAll();

    Comments findNewsById(int id);

    void clearAll();
}
