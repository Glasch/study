package sample.chapter7;

/**
 * Copyright (c) Anton on 31.08.2017.
 */
public class Root {
    Component1 component1;
    Component2 component2;
    Component3 component3;

    private static final int COMPS_COUNT = 3;

    {
        this.component1 = new Component1();
        this.component2 = new Component2();
        this.component3 = new Component3();
//        COMPS_COUNT = 3;
    }

    public Root() {
        System.out.println("Root.Root");
    }


}
