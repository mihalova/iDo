package com.example.ido;

class Group {

    private String groupName;
    private boolean newMessage;


    Group(String groupName, boolean newMessage){
        this.groupName = groupName;
        this.newMessage = newMessage;
    }

    boolean getNewMessage() { return this.newMessage; }

    String getGroupName() {
        return groupName;
    }
}
