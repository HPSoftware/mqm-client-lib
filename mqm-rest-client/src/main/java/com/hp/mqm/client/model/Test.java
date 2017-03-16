// (C) Copyright 2003-2015 Hewlett-Packard Development Company, L.P.

package com.hp.mqm.client.model;

final public class Test {

    private Long id;
    private String name;
    private String type;

    public Test(Long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
