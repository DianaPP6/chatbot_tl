package com.example.diana.chatbot_tl;

import java.util.List;

/**
 * Created by 舍长 on 2018/5/10.
         * 描述: 接受的Json数据实体类
         */

public class Take {

    /**
     * intent : {"code":4600}
     * results : [{"groupType":0,"resultType":"text","values":{"text":"如果你什么都不说，我也不知道怎么回答你呀"}}]
     */

    private IntentBean intent;
    private List<ResultsBean> results;

    public IntentBean getIntent() {
        return intent;
    }

    public void setIntent(IntentBean intent) {
        this.intent = intent;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class IntentBean {
        /**
         * code : 4600
         */

        private int code;

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }

    public static class ResultsBean {
        /**
         * groupType : 0
         * resultType : text
         * values : {"text":"如果你什么都不说，我也不知道怎么回答你呀"}
         */

        private int groupType;
        private String resultType;
        private ValuesBean values;

        public int getGroupType() {
            return groupType;
        }

        public void setGroupType(int groupType) {
            this.groupType = groupType;
        }

        public String getResultType() {
            return resultType;
        }

        public void setResultType(String resultType) {
            this.resultType = resultType;
        }

        public ValuesBean getValues() {
            return values;
        }

        public void setValues(ValuesBean values) {
            this.values = values;
        }

        public static class ValuesBean {
            /**
             * text : 如果你什么都不说，我也不知道怎么回答你呀
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
}
