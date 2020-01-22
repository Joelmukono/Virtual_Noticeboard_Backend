package models;
import java.security.PrivateKey;
import java.sql.Timestamp;


public class Notice {

    private int noticeId;
    private String noticeType;
    private Timestamp timestamp;
    private String title;
    private String noticeContent;


    public Notice(String noticeType, Timestamp timestamp, String noticeContent, String title){
        this.noticeType = noticeType;
        this.timestamp = timestamp;
        this.noticeContent = noticeContent;
        this.title = title;


    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }



    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }



    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }








}
