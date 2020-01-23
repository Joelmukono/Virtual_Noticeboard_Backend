package models;

import java.security.Timestamp;

public class Comments {
    private int commentId;
    private Timestamp timestamp;
    private String commentText;
    private int noticeId;


    public Comments(int commentId, Timestamp timestamp, String commentText){
        this.commentId =commentId;
        this.timestamp = timestamp;
        this.commentText = commentText;

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
