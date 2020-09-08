package com.gupaoedu.starter;

import com.gupaoedu.starter.format.FormatProcessor;

/**
 * @author : lipu
 * @since : 2020-09-08 21:01
 */
public class HelloFormatTemplate {


    private FormatProcessor formatProcessor;

    public HelloFormatTemplate(FormatProcessor formatProcessor) {
        this.formatProcessor = formatProcessor;
    }

    public <T>String doFormat(T obj){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Execute format:").append("\n");
        stringBuilder.append("Obj  format result:").append(formatProcessor.format(obj)).append("\n");
        return stringBuilder.toString();
    }
}
