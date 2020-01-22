package dao;

import models.Comments;

import java.util.List;

public interface comentsDao {

    void add(Comments news);

    List<Comments> getAll();

    Comments findNewsById(int id);

    void clearAll();
}
