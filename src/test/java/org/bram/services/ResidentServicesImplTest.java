package org.bram.services;

import org.bram.data.repository.ResidentRepository;
import org.bram.dtos.request.ResidentRegisterRequest;
import org.bram.dtos.response.ResidentRegisterResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ActiveProfiles("test")
class ResidentServicesImplTest {

    @Autowired
    private ResidentServices residentServices;
    @Autowired
    private ResidentRepository residentRepository;
    private ResidentRegisterRequest registerRequest;
    private ResidentRegisterResponse registerResponse;

    @BeforeEach
    void setUp() {
        registerRequest = new ResidentRegisterRequest();
        registerResponse = new ResidentRegisterResponse();
        residentRepository.deleteAll();
    }

    @Test
    public void registerNewResident__registerResidentTest() {
        registerResident();
        assertNotNull(registerResponse.getId());
        assertEquals("Registered successfully", registerResponse.getMessage());
        assertEquals(1, residentRepository.count());
    }

    private void registerResident() {
        registerRequest.setFullName("Olabode Lawal");
        registerRequest.setEmail("olabodelawal@gmail.com");
        registerRequest.setAddress("123 Main Street");
        registerRequest.setPhone("0907-826-3522");
        registerRequest.setHashedPassword("12345");
        registerResponse = residentServices.register(registerRequest);
    }

}