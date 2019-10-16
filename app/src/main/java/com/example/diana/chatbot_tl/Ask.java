package com.example.diana.chatbot_tl;

/**
 * Created by 舍长 on 2018/5/10.
 * 描述: 发送数据实体类
 */

public class Ask {

    /**
     * reqType : 0
     * perception : {"inputText":{"text":"hello"}}
     * userInfo : {"apiKey":"bb9e10aff7b7466a9629baeadc15b1a5","userId":"520549"}
     */

    private int reqType;
    private PerceptionBean perception;
    private UserInfoBean userInfo;

    public int getReqType() {
        return reqType;
    }

    public void setReqType(int reqType) {
        this.reqType = reqType;
    }

    public PerceptionBean getPerception() {
        return perception;
    }

    public void setPerception(PerceptionBean perception) {
        this.perception = perception;
    }

    public UserInfoBean getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoBean userInfo) {
        this.userInfo = userInfo;
    }

    public static class PerceptionBean {
        /**
         * inputText : {"text":"hello"}
         */

        private InputTextBean inputText;

        public InputTextBean getInputText() {
            return inputText;
        }

        public void setInputText(InputTextBean inputText) {
            this.inputText = inputText;
        }

        public static class InputTextBean {
            /**
             * text : hello
             */

            private String text;

            public String getText() {
                return text;
            }

            public void setText(String text) {
                this.text = text;
            }
        }
    }

    public static class UserInfoBean {
        /**
         * apiKey : bb9e10aff7b7466a9629baeadc15b1a5
         * userId : 520549
         */

        private String apiKey;
        private String userId;

        public String getApiKey() {
            return apiKey;
        }

        public void setApiKey(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }
    }
}