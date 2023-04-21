package io.dborrego.domain;

import io.vertx.codegen.annotations.DataObject;

@DataObject
public class HelloWorldDTO {
    String msg;

    public HelloWorldDTO(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
