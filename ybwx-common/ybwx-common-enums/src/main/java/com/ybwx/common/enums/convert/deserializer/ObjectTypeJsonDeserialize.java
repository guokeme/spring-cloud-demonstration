package com.ybwx.common.enums.convert.deserializer;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.ybwx.common.enums.ObjectType;

import java.io.IOException;

/**
 * @描述 :
 * @作者 :	pst
 * @日期 :	2017/11/1
 * @时间 :	19:01
 */
public class ObjectTypeJsonDeserialize extends JsonDeserializer<ObjectType> {

    @Override
    public ObjectType deserialize(JsonParser p, DeserializationContext ctxt) throws IOException {
        Integer value = p.readValueAs(Integer.class);
        return ObjectType.get(value);
    }

}
