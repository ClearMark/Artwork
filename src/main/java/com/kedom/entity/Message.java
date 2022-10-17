package com.kedom.entity;

import lombok.Data;

import java.util.Date;

@Data
public class Message {
    private Integer messageID;
    private String messageSendUserName;
    private Date messageSendTime;
    private String messageAcceptUserName;
    private Date messageAcceptTime;
    private String messageText;
    private Character messageState;
    private Character messageType;
}
