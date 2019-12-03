package com.code.websocket.sockjs.model;

public class Chat {

    private String content;
    private String sendTime;
    private String pushTime;

    @Override
    public String toString() {
        return "Chat{" +
                "content='" + content + '\'' +
                ", sendTime='" + sendTime + '\'' +
                ", pushTime='" + pushTime + '\'' +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getPushTime() {
        return pushTime;
    }

    public void setPushTime(String pushTime) {
        this.pushTime = pushTime;
    }
}
