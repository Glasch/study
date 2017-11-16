package sample.chapter8;

/**
 * Copyright (c) Anton on 07.09.2017.
 */
public class Starship {
    private AlertStatus alertStatus;
    private StarshipAlertListener alertListener;

    public void setAlertListener(StarshipAlertListener alertListener) {
        this.alertListener = alertListener;
    }

    void showAlert() {
        alertStatus.print();

    }

    public void setAlertStatus(AlertStatus alertStatus) {
        if (alertListener != null) {
            alertListener.onAlertChange(this.alertStatus, alertStatus);
        }
        this.alertStatus = alertStatus;
    }
}
