package com.tsp.transportpass.resp;

public class CommonResp<T> {
    //业务上的成功与失败
    private Boolean success=true;
    //返回信息
    private String message;
    //返回泛型数据，自定义类型
    private T Content;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getContent() {
        return Content;
    }

    public void setContent(T content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "CommonResp{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", Content=" + Content +
                '}';
    }
}
