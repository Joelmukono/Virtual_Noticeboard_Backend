package models;
import java.security.PrivateKey;
import java.sql.Timestamp;


public class Notice {

    private int noticeId;
    private Timestamp timecreated;
    private String title;
    private String noticeContent;
    private int userId;


    public Notice(Timestamp timecreated, String noticeContent, String title, int userId){

        this.timecreated = timecreated;
        this.noticeContent = noticeContent;
        this.title = title;
        this.userId = userId;


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
        return timecreated;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timecreated = timestamp;
    }





    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }

    public int getUserId(){
        return userId;
    }

    public void setUserId( int userId){
        this.userId = userId;

    }








}
