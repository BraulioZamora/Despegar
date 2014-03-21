package com.despegar.hf.echo.service;

import java.util.HashMap;
import java.util.Map;

public class EchoService {
    private Map<String, String> content = new HashMap<String, String>();

    public String echo(String msg) {
        return msg;

    }

    public void setContent(String id, String content) {
        this.content.put(id, content);
    }

    public String echoEnhanced(String id, String msg) {
        return this.content.get(id) + msg;

    }



}
