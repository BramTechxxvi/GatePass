package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "AccessCodes")
public class AccessCode {

    @Id
    private String id;
    private String code;
    private LocalDateTime timeCreated = LocalDateTime.now();
    private LocalDateTime expiryTime = timeCreated.plusHours(5);
    private boolean isValid = true;
    private boolean isUsed = false;
    @DBRef
    private Resident resident;
    @DBRef
    private Visitor visitor;


}
