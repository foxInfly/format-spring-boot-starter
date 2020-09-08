package com.gupaoedu.starter.format;

/**
 * @author : lipu
 * @since : 2020-09-08 20:56
 */
public interface FormatProcessor {

    /**
     * 格式化
     */
    <T>String format(T obj);
}
