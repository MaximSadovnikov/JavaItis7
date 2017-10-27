package com.company;

public class Remote {
    private int channelNumber = 0;
    private TV tv = new TV();

    public void switchChannelNumber(int Number) {
        if (0 <= Number && Number < tv.getChannelsLength()) {
            this.channelNumber = Number;
        } else {
            System.err.println("Wrong channel number");
        }
    }

    void Menu(int command) {
//            "MENU:"
//                    "1 - Show programs on this channel"
//                    "2 - Show program that going now"
//                    "3 - Next channel"
//                    "4 - Previous channel"
//                    "5 - Switch to channel NUMBER"
//                    "0 - TURN OFF"
        switch (command) {
            case 1: {
                tv.ShowProgram(channelNumber);
            }
            break;
            case 2: {
                tv.switchChannels(channelNumber);
            }
            break;
            case 3: {
                if ((channelNumber + 1) <= tv.getChannelsLength()) {
                    channelNumber++;
                } else {
                    System.out.println("It is LAST channel");
                }
            }
            break;
            case 4: {
                if ((channelNumber - 1) >= 0) {
                    channelNumber--;
                } else {
                    System.out.println("It is FIRST channel");
                }
            }
            break;
        }
    }


}