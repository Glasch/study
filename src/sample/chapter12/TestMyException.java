package sample.chapter12;

/**
 * Copyright (c) Anton on 04.10.2017.
 */
class TestMyException {
    void whenMyException() throws MyException {

        throw new MyException("Throws My Exception!");

    }

    void whenMyExceptionNotThrowed() throws MyException {

      throw  new MyException("whenMyExceptionNotThrowed");
    }

}
