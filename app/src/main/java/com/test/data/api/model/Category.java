package com.test.data.api.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by ankit on 20/3/17.
 */

public class Category {


    /**
     * status : success
     * code : 200
     * data : {"count":5,"next":null,"previous":null,"results":[{"id":"9153a3b0-7622-49b9-b4d3-7a770a3ad40a","status":1,"name":"Edibles","description":"Description of catgory.","created_at":"2017-02-15T14:42:11Z","updated_at":"2017-02-15T14:42:12Z","parent":null},{"id":"ac57c6e2-d189-4e26-99d3-6258d5db6c47","status":1,"name":"Indica","description":"description","created_at":"2017-02-17T11:39:53Z","updated_at":"2017-02-17T11:39:53Z","parent":null},{"id":"c3905954-89d8-4c98-8b8c-7b8485b291be","status":1,"name":"Topicals","description":"description","created_at":"2017-02-17T11:41:12Z","updated_at":"2017-02-17T11:41:12Z","parent":null},{"id":"daa8dd21-bd59-4cd1-af4c-733c64ef0928","status":1,"name":"Extracts","description":"description","created_at":"2017-02-17T11:40:10Z","updated_at":"2017-02-17T11:40:10Z","parent":null},{"id":"fcae2961-ff00-4d6c-ba2c-01b8ec9a8ba3","status":1,"name":"Sativa","description":"This is category second","created_at":"2017-02-17T11:06:37Z","updated_at":"2017-02-17T11:06:37Z","parent":null}]}
     */

    @SerializedName("status")
    private String status;
    @SerializedName("code")
    private int code;
    @SerializedName("data")
    private DataBean data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * count : 5
         * next : null
         * previous : null
         * results : [{"id":"9153a3b0-7622-49b9-b4d3-7a770a3ad40a","status":1,"name":"Edibles","description":"Description of catgory.","created_at":"2017-02-15T14:42:11Z","updated_at":"2017-02-15T14:42:12Z","parent":null},{"id":"ac57c6e2-d189-4e26-99d3-6258d5db6c47","status":1,"name":"Indica","description":"description","created_at":"2017-02-17T11:39:53Z","updated_at":"2017-02-17T11:39:53Z","parent":null},{"id":"c3905954-89d8-4c98-8b8c-7b8485b291be","status":1,"name":"Topicals","description":"description","created_at":"2017-02-17T11:41:12Z","updated_at":"2017-02-17T11:41:12Z","parent":null},{"id":"daa8dd21-bd59-4cd1-af4c-733c64ef0928","status":1,"name":"Extracts","description":"description","created_at":"2017-02-17T11:40:10Z","updated_at":"2017-02-17T11:40:10Z","parent":null},{"id":"fcae2961-ff00-4d6c-ba2c-01b8ec9a8ba3","status":1,"name":"Sativa","description":"This is category second","created_at":"2017-02-17T11:06:37Z","updated_at":"2017-02-17T11:06:37Z","parent":null}]
         */

        @SerializedName("count")
        private int count;
        @SerializedName("next")
        private Object next;
        @SerializedName("previous")
        private Object previous;
        @SerializedName("results")
        private List<ResultsBean> results;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public Object getNext() {
            return next;
        }

        public void setNext(Object next) {
            this.next = next;
        }

        public Object getPrevious() {
            return previous;
        }

        public void setPrevious(Object previous) {
            this.previous = previous;
        }

        public List<ResultsBean> getResults() {
            return results;
        }

        public void setResults(List<ResultsBean> results) {
            this.results = results;
        }

        public static class ResultsBean {
            /**
             * id : 9153a3b0-7622-49b9-b4d3-7a770a3ad40a
             * status : 1
             * name : Edibles
             * description : Description of catgory.
             * created_at : 2017-02-15T14:42:11Z
             * updated_at : 2017-02-15T14:42:12Z
             * parent : null
             */

            @SerializedName("id")
            private String id;
            @SerializedName("status")
            private int status;
            @SerializedName("name")
            private String name;
            @SerializedName("description")
            private String description;
            @SerializedName("created_at")
            private String createdAt;
            @SerializedName("updated_at")
            private String updatedAt;
            @SerializedName("parent")
            private Object parent;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getCreatedAt() {
                return createdAt;
            }

            public void setCreatedAt(String createdAt) {
                this.createdAt = createdAt;
            }

            public String getUpdatedAt() {
                return updatedAt;
            }

            public void setUpdatedAt(String updatedAt) {
                this.updatedAt = updatedAt;
            }

            public Object getParent() {
                return parent;
            }

            public void setParent(Object parent) {
                this.parent = parent;
            }
        }
    }
}
