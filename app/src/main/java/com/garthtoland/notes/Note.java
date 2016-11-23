package com.garthtoland.notes;

/**
 * Created by garth on 16/11/2016.
 */

public class Note {

    private String header;
    private String body;

    public Note() {
    }

    public Note(String header, String body) {
        this.header = header;
        this.body = body;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
