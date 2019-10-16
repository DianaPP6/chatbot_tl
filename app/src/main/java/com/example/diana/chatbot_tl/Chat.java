package com.example.diana.chatbot_tl;

/**
 * Created by Diana on 2019/10/15.
 */

public class Chat {
    //收到的数据
    public static final int TYPE_RECEIVED = 0;
    //发送的数据
    public static final int TYPE_SENT = 1;
    //    对话文本
    private String text;
    //    标示
    private int type;

    public Chat(String text, int type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ChatLiatData{" +
                "text='" + text + '\'' +
                ", type=" + type +
                '}';
    }
}
