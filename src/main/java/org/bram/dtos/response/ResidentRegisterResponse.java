package org.bram.dtos.response;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class ResidentRegisterResponse {

    @Id
    private String id;
    private String fullName;
    private String message;
}
