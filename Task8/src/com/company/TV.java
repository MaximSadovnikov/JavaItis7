package com.company;
public class TV {
    private Channel channels[];
    private int count = 0;

    public TV() {
        this.channels = new Channel[5];
    }

    public void add(Channel channel) {
        this.channels[count] = channel;
        count++;
    }
    public void switchChannels(int channelNumber){
        if (channels[channelNumber] == null) {
            System.err.println("пшпшпшшпшппшшпшпшпш");
        } else {
            channels[channelNumber].showCurrentProgram();
        }
    }
    public void ShowProgram ( int channelNumber){
        if (channels[channelNumber] == null) {
            System.err.println("пшпшпшшпшппшшпшпшпш");
    } else {
           channels[channelNumber].showAllPrograms();
        }
    }
    public int getChannelsLength(){
        return channels.length;
    }
}
