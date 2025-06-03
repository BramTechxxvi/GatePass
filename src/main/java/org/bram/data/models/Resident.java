package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Residents")
public class Resident {

    @Id
    private String id;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private String hashedPassword;
}
