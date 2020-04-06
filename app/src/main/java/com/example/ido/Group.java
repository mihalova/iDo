package com.example.ido;

class Group {

    private String groupName;
    private int newMessage;


    Group(String groupName, int newMessage){
        this.groupName = groupName;
        this.newMessage = newMessage;
    }

   int getNewMessage() { return this.newMessage; }

    String getGroupName() {
        return groupName;
    }
}
