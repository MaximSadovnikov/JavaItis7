package com.company;

import java.time.LocalTime;

public class Program {

    private String name;
    private LocalTime startTime;
    private LocalTime finishTime;

    public Program(String name, String startTime, String finishTime) {
        // используем функцию parse класса LocalTime для
        // преобразования времени в виде строки в формат, понятный java
        this.startTime = LocalTime.parse(startTime);
        this.finishTime = LocalTime.parse(finishTime);
        this.name = name;
    }

    boolean isGoingNow() {
        // сохранили текущее время
        LocalTime nowTime = LocalTime.now();
        // если текущее время после начала программы и перед концом программы
        if (nowTime.isAfter(startTime) &&
                nowTime.isBefore(finishTime)) {
            return true;
        } else {
            return false;
        }
    }

    LocalTime getStartTime() {
        return startTime;
    }

    LocalTime getFinishTimeTime() {
        return finishTime;
    }

    String getName() {
        return name;
    }
}