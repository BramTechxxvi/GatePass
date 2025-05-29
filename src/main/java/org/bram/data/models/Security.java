package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Securities")
public class Security {

    @Id
    private String id;
    private String fullName;
    private String Address;
    private String phone;
    private String email;
    @DBRef
    private Resident resident;
    @DBRef
    private AccessCode accessCode;
    @DBRef
    private Visitor visitor;
}
