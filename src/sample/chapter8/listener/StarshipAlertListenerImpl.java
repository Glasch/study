package sample.chapter8.listener;

import sample.chapter8.AlertStatus;
import sample.chapter8.StarshipAlertListener;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public class StarshipAlertListenerImpl implements StarshipAlertListener {

    @Override
    public void onAlertChange(AlertStatus oldStatus, AlertStatus newStatus) {
//        mammals[i] = random.nextBoolean() ? new Dog() : new Cat();
        String oldS = safePrint(oldStatus);
        String newS = safePrint(newStatus);
        System.out.println ("Old status: " + oldS + "\n New status: " + newS );
    }

    public String safePrint(AlertStatus oldStatus) {
        return oldStatus == null ? "null" : oldStatus.print();
    }
}
