package sample;

import java.util.Date;

public class Task {

    private Date date;
    private String name;
    private String time;
    private int numberTask;


    public Task(String name,Date date, String time, int numberTask) {
        this.date = date;
        this.name = name;
        this.time = time;
        this.numberTask = numberTask;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNumberTask() {
        return numberTask;
    }

    public void setNumberTask(int numberTask) {
        this.numberTask = numberTask;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
