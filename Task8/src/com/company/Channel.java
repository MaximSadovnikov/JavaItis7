package com.company;

import java.time.format.DateTimeFormatter;

public class Channel {
    private Program programs[];
    private int count = 0;
    private int ProgramLength = 0;

    private String name;

    public Channel(String name, int ProgLen) {
        if (ProgLen < 1) {
            this.ProgramLength = 1;
        } else if (ProgLen > 5) {
            this.ProgramLength = 5;
        } else {
            this.ProgramLength = ProgLen;
        }
        this.programs = new Program[ProgramLength];
        this.name = name;
    }

    void addProgram(Program program) {
        if (count < ProgramLength) {
            this.programs[count] = program;
            count++;
        }
    }

    void showAllPrograms() {
        System.out.println(this.name + " программа передач.");
        // создаем объект Formatter для форматирования времени по нашему шаблону
        // далее этот форматтер будет передан во время начала и во время конца передачи
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh.mm");
        for (int i = 0; i < count; i++) {
            System.out.println(programs[i].getStartTime().format(formatter) + " : " +
                    programs[i].getFinishTimeTime().format(formatter) + " - " + programs[i].getName());
        }
    }

    void showCurrentProgram() {
        for (int i = 0; i < count; i++) {
            if (programs[i].isGoingNow() == true) {
                System.out.println(programs[i].getName());
            }
        }
    }

}