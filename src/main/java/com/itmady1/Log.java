package com.itmady1;

public  class Log {
    String ip;
    String username;
    String date;
    String event;
    String status;

    public Log(String[] array) {
        this.ip = array[0];
        this.username = array[1];
        this.date = array[2];
        this.event = array[3];
        this.status = array[4];
    }

    public String getStatus() {
        return this.status;
    }

    public String toString() {
        return this.ip + "\t" + this.username + "\t" + this.date + "\t" + this.event + "\t" + this.status;
    }
}
