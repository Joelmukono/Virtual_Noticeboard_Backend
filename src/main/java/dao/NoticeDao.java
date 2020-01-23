package dao;

import models.Notice;

import java.util.List;
public interface NoticeDao {

    void add(Notice notice);

    List<Notice> getAll();

    Notice findNoticeById(int id);

    void deleteNoticeById(int id);

    void clearAll();
}
