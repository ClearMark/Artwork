package com.kedom.socket;

import lombok.Data;

import javax.websocket.Session;

@Data
public class SocketUser {
    private Session session;
    private String username;

    public SocketUser(Session session, String username) {
        this.session = session;
        this.username = username;
    }
}
