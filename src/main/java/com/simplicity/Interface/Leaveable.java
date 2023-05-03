package com.simplicity.Interface;

public interface Leaveable extends Runnable {
    public int getSisaWaktu();

    public void showCompleteMessage();

    public void stop();

    public void start();
}
