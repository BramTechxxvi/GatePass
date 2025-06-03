package org.bram.dtos.response;

import lombok.Data;

@Data
public class ResidentLoginResponse {

    private String id;
    private String fullName;
    private String email;
    private String message;
}
