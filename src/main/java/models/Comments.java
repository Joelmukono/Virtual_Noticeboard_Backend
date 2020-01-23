package models;

import java.sql.Timestamp;

public class Comments {

    private int commentId;
    private Timestamp timecreated;
    private String commentText;
    private int noticeId;
    private int userId;


    public Comments(int commentId, Timestamp timecreated, String commentText,int userId,int noticeId){
        this.commentId =commentId;
        this.timecreated = timecreated;
        this.commentText = commentText;
        this.userId = userId;
        this.noticeId = noticeId;
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
        return timecreated;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timecreated = timestamp;
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
