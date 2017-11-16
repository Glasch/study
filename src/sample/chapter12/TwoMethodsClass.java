package sample.chapter12;

/**
 * Copyright (c) Anton on 11.10.2017.
 */
class TwoMethodsClass  {

    void g() throws  FirstException{
        throw new FirstException("Something went wrong");
    }

    void  f(){
        try {
            g();
        } catch (FirstException e) {
            e.printStackTrace(System.out);
            System.out.println("Перехвачено FirstException!");
            System.out.flush();
            throw  new  RuntimeException("Cannot rectify state, terminating.. ", e);
        }
        // TODO: 12.10.2017 Ex.11 p. 385
    }

}
