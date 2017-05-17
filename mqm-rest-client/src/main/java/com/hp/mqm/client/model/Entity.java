/*
 * Copyright 2017 Hewlett-Packard Development Company, L.P.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.hp.mqm.client.model;

import net.sf.json.JSONObject;
/**
 * Class used to get Entity from Octane's response
 */
final public class Entity {

    public static String ID_FIELD = "id";
    public static String NAME_FIELD = "name";
    public static String TYPE_FIELD = "type";

    private JSONObject entityObject;

    public Entity(JSONObject entityObject) {
        this.entityObject = entityObject;
    }

    public Long getId() {
        return getLongValue(ID_FIELD);
    }

    public String getName() {
        return getStringValue(NAME_FIELD);
    }

    public String getType() {
        return getStringValue(TYPE_FIELD);
    }

    public String getStringValue(String fieldName) {
        return entityObject.getString(fieldName);
    }

    public Long getLongValue(String fieldName) {
        return entityObject.getLong(fieldName);
    }

    public Boolean getBooleanValue(String fieldName) {
        return entityObject.getBoolean(fieldName);
    }

    public boolean containsField(String fieldName) {
        return entityObject.containsKey(fieldName);
    }
}
