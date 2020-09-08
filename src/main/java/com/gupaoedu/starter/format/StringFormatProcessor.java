package com.gupaoedu.starter.format;

import java.util.Objects;

/**
 * @author : lipu
 * @since : 2020-09-08 20:57
 */
public class StringFormatProcessor implements FormatProcessor {


    @Override
    public <T> String format(T obj) {
        return "StringFormatProcessor:"+ Objects.toString(obj);
    }
}
