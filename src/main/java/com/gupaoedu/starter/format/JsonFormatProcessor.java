package com.gupaoedu.starter.format;

import com.alibaba.fastjson.JSON;

/**
 * @author : lipu
 * @since : 2020-09-08 20:57
 */
public class JsonFormatProcessor implements FormatProcessor{
    @Override
    public <T> String format(T obj) {
        return "JsonFormatProcessor:"+ JSON.toJSONString(obj);
    }
}
