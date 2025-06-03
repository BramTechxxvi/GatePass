package org.bram.services;

import org.bram.data.models.Resident;
import org.bram.data.repository.ResidentRepository;
import org.bram.dtos.request.ResidentLoginRequest;
import org.bram.dtos.request.ResidentRegisterRequest;
import org.bram.dtos.response.ResidentLoginResponse;
import org.bram.dtos.response.ResidentRegisterResponse;
import org.springframework.stereotype.Service;

import static org.bram.utils.Mapper.map;

@Service
public class ResidentServicesImpl implements ResidentServices {

    private ResidentRepository residentRepository;

    public ResidentServicesImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }


    @Override
    public ResidentRegisterResponse register(ResidentRegisterRequest registerRequest) {
        Resident resident = map(registerRequest);
        Resident savedResident = residentRepository.save(resident);

        return map(savedResident);
    }

    @Override
    public ResidentLoginResponse login(ResidentLoginRequest loginRequest) {
        return null;
    }
}
