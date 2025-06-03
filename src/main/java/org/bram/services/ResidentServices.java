package org.bram.services;

import org.bram.dtos.request.ResidentLoginRequest;
import org.bram.dtos.request.ResidentRegisterRequest;
import org.bram.dtos.response.ResidentLoginResponse;
import org.bram.dtos.response.ResidentRegisterResponse;

public interface ResidentServices {

    ResidentRegisterResponse register(ResidentRegisterRequest registerRequest);

    ResidentLoginResponse login(ResidentLoginRequest loginRequest);
}
