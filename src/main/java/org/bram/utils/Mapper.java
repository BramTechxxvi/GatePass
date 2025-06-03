package org.bram.utils;

import org.bram.data.models.Resident;
import org.bram.dtos.request.ResidentRegisterRequest;
import org.bram.dtos.response.ResidentRegisterResponse;

public class Mapper {

    public static Resident map(ResidentRegisterRequest registerRequest) {
        Resident resident = new Resident();
        resident.setFullName(registerRequest.getFullName());
        resident.setEmail(registerRequest.getEmail());
        resident.setAddress(registerRequest.getAddress());
        resident.setPhone(registerRequest.getPhone());
        resident.setHashedPassword(registerRequest.getHashedPassword());

        return resident;
    }

    public static ResidentRegisterResponse map(Resident resident) {
        ResidentRegisterResponse registerResponse = new ResidentRegisterResponse();
        registerResponse.setFullName(resident.getFullName());
        registerResponse.setId(resident.getId());
        registerResponse.setMessage("Registered successfully");

        return registerResponse;
    }
}
