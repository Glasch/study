package sample.chapter8;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public interface StarshipAlertListener {

    void onAlertChange(AlertStatus oldStatus, AlertStatus newStatus);
}
