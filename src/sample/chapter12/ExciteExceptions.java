package sample.chapter12;

/**
 * Copyright (c) Anton on 11.10.2017.
 */
class ExciteExceptions {
    void excite(int i) throws FirstException, SecondException, ThirdException {
        if (i < 0) {
            throw new FirstException("Something went wrong");
        }
        if (i == 0) {
            throw new SecondException();
        }
        if (i > 0) {
            throw new ThirdException();
        }
    }
}

