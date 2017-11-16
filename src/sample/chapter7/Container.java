package sample.chapter7;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class Container {
    private Content content;

    public Content getContent() {
        if (content == null) {
            content = new Content();
        }
        return content;

    }
}
