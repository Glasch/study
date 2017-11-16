package sample.chapter3;


class Aliasing {

    void primer() {
        Number p1 = new Number();
        Number p2 = new Number();
        p1.number = (float) 5.46;
        p2.number = (float) 546;
        System.out.println(p2.number / p1.number);
        p1.number = p2.number;
        System.out.println(p2.number / p1.number);
        p1.number = (float) 5460;
        System.out.println(p2.number / p1.number);

    }

    private class Number {
        Float number;
    }

}



/*public class Aliasing {
    {
        Number p1 = new Number();
        Number p2 = new Number();
        p1.number = (float) 5.46;
        p2.number = (float) 156.25;
        System.out.println(p2.number / p1.number);
        p1 = p2;
        System.out.println(p2.number / p1.number);
        p1.number = (float) 144.25;
        System.out.println(p2.number / p1.number);
    }




}
*/
/*
public class Aliasing {
      Number p1;
      Number p2;
      void primer(){
          p1 = new Number();
          p2 = new Number();
          p1.number = (float) 5.46;
          p2.number = (float) 156.25;
          System.out.println(p2.number / p1.number);
          p1 = p2;
          System.out.println(p2.number / p1.number);
          p1.number = (float) 144.25;
          System.out.println(p2.number / p1.number);

      }
}
*/