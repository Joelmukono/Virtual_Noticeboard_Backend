package dao;

import models.Comments;

import java.util.List;

public interface commentsDao {

    void add(Comments news);

    List<Comments> getAll(int userId);

    Comments findCommentById(int id);

    void deleteCommentById(int commentId);

    void clearAll();
}
