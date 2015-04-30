// (C) Copyright 2003-2015 Hewlett-Packard Development Company, L.P.

package com.hp.mqm.client.model;

final public class TaxonomyType {

    final private int id;
    final private String name;

    public TaxonomyType(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}