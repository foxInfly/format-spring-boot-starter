package com.gupaoedu.starter;

import com.gupaoedu.starter.autoconfiguration.HelloProperties;
import com.gupaoedu.starter.format.FormatProcessor;

/**
 * @author : lipu
 * @since : 2020-09-08 21:01
 */
public class HelloFormatTemplate {


    private FormatProcessor formatProcessor;
    private HelloProperties helloProperties;

    public HelloFormatTemplate(FormatProcessor formatProcessor,HelloProperties helloProperties) {
        this.formatProcessor = formatProcessor;
        this.helloProperties = helloProperties;
    }

    public <T>String doFormat(T obj){

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("begin Execute format:").append("<br>\n");
        stringBuilder.append("HelloProperties:").append(formatProcessor.format(helloProperties.getInfo())).append("<br>\n");
        stringBuilder.append("Obj  format result:").append(formatProcessor.format(obj)).append("<br>\n");
        return stringBuilder.toString();
    }
}
