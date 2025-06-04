package org.bram.services;

import org.bram.data.models.Resident;
import org.bram.data.repository.ResidentRepository;
import org.bram.dtos.request.ResidentLoginRequest;
import org.bram.dtos.request.ResidentRegisterRequest;
import org.bram.dtos.response.ResidentLoginResponse;
import org.bram.dtos.response.ResidentRegisterResponse;
import org.bram.exceptions.DetailsAlreadyInUseException;
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
        verifyNewEmail(registerRequest.getEmail());
        verifyNewPhone(registerRequest.getPhone());
        Resident resident = map(registerRequest);
        Resident savedResident = residentRepository.save(resident);

        return map(savedResident);
    }

    @Override
    public ResidentLoginResponse login(ResidentLoginRequest loginRequest) {
        return null;
    }

    private void verifyNewEmail (String email){
        validateEmail(email);
        for (Resident resident : residentRepository.findAll()) {
            if (email.equals(resident.getEmail())) throw new DetailsAlreadyInUseException("Email already exists");
        }}

    private void validateEmail(String email){
        if (email == null || email.isBlank() || !email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9-]+\\.[a-zA-Z]{2,}$")) {
            throw new InvalidEmailException("Invalid email format");
        }}

    private void validatePhone(String phone) {
        if (phone == null || phone.isBlank() || !phone.matches("^0[7-9][0-1]\\d[- ]?\\d{3}[- ]?[0-9]{4}$")) {
            throw new InvalidPhoneNumberException("Invalid phone number");
        }}

    private void verifyNewPhone(String phone){
        validatePhone(phone);
        for (Resident resident: residentRepository.findAll()) {
            if(phone.equals(resident.getPhone()))  throw new DetailsAlreadyInUseException("Phone already exists");
        }}

}
