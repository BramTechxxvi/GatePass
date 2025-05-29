package org.bram.data.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "Visitors")
public class Visitor {

    @Id
    private String id;
    private String fullName;
    private String Address;
    private String phone;
    private String email;
}
