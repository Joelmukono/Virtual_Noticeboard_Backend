package models;

import java.sql.Timestamp;

public class Comments {

    private int commentId;
    private Timestamp timestamp;
    private String commentText;
    private int noticeId;
    private int userId;


    public Comments(Timestamp timestamp, String commentText){
        this.timestamp = timestamp;
        this.commentText = commentText;

    }

    public int getUserId(){
        return userId;
    }

    public void setUserId(int userId){
        this.userId = userId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }



    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getNoticeId() {
        return noticeId;
    }

    public void setNoticeId(int noticeId) {
        this.noticeId = noticeId;
    }




}
