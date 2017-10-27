package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Remote remote = new Remote();
//                Program goodMorning =
//                        new Program("Доброе утро", "05:00", "09:00");
//                Program letsSpeak =
//                        new Program("Пусть говорят", "18:00", "20:00");
//                Program news =
//                        new Program("Новости", "12:00", "12:10");
//
//                Channel firstChannel =
//                        new Channel("Первый канал");
//
//                firstChannel.addProgram(goodMorning);
//                firstChannel.addProgram(news);
//                firstChannel.addProgram(letsSpeak);
//
//                firstChannel.showAllPrograms();
//
//                Program criminalNews =
//                        new Program("Сегодня", "12:00", "12:20");
//                Program youNotBelieve =
//                        new Program("Ты не поверишь", "15:15", "16:15");
//                Program evening = new Program("Вечер","19:00","23:59");
//
//                Channel ntv = new Channel("НТВ");
//
//                ntv.addProgram(criminalNews);
//                ntv.addProgram(youNotBelieve);
//                ntv.addProgram(evening);
//
//                TV tv = new TV();
//                tv.add(firstChannel);
//                tv.add(ntv);
            TV tv;
            tv = new TV();
            System.out.println("TV setup:");
            boolean setup = true;
            while (setup == true) {
                System.out.println("1. Создать канал" + '\n' + "2. Выход");
                int command = scanner.nextInt();
                switch (command) {
                    case 1: {
                        System.out.println("Введите количество передач. (1 - 5)");
                        int programsCount = scanner.nextInt();
                        if (programsCount < 1) {
                            programsCount = 1;
                        } else if (programsCount > 5) {
                            programsCount = 5;
                        }
                        System.out.println("Введите название канала.");
                        String channelName = scanner.next();
                        Channel channel = new Channel(channelName);
                        for (int i = 0; i < programsCount; i++) {
                            System.out.println("Введите время начала, время завершения и название канала.");
                            String startTime = scanner.next();
                            String finishTime = scanner.next();
                            String name = scanner.next();
                            Program program = new Program(name, startTime, finishTime);
                            channel.addProgram(program);
                        }
                        tv.add(channel);
                    }
                    break;
                    case 2: {
                        setup = false;
                    }
                    break;
                }
            }
            while (true) {
                System.out.println("MENU:" + '\n' + "1 - Show programs on this channel" + '\n' + "2 - Show program that going now" + '\n' + "3 - Next channel" + '\n' + "4 - Previous channel" + '\n' + "5 - Switch to channel NUMBER" + '\n' + "0 - TURN OFF");
                int command = scanner.nextInt();
                if (command == 0) {
                    System.out.println("TV is OFF");
                    System.exit(0);
                } else if (command == 5) {
                    System.out.println("Enter channel number");
                    int channelNumber = scanner.nextInt();
                    remote.switchChannelNumber(channelNumber);
                }
                remote.Menu(command);

            }
        }
    }
}