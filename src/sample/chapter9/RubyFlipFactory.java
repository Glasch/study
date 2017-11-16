package sample.chapter9;

/**
 * Copyright (c) Anton on 14.09.2017.
 */
public class RubyFlipFactory implements FlipFactory {
    @Override
    public Flip createFlip() {
        return new RubyFlip();
    }
}
