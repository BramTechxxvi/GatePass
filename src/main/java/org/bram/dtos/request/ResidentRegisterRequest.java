package org.bram.dtos.request;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ResidentRegisterRequest {

    @Id
    private String id;
    private String fullName;
    private String Address;
    private String phone;
    private String email;
    private String hashedPassword;
}
