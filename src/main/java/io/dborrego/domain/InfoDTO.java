package io.dborrego.domain;

import io.vertx.codegen.annotations.DataObject;

@DataObject
public class InfoDTO {
    String name;
    String version;

    public InfoDTO(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

}
