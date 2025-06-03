package org.bram.data.repository;

import org.bram.data.models.Resident;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ResidentRepositoryTest {

    @Autowired
    private ResidentRepository residents;

    @BeforeEach
    void setUp() {
        residents.deleteAll();
    }

    @Test
    public void saveNewResident__countIsOneTest() {
        Resident newResident = new Resident();
        newResident.setFullName("Olabode Lawal");
        newResident.setEmail("123@fake.com");
        newResident.setAddress("12 main street");
        newResident.setHashedPassword("12345");
        residents.save(newResident);
        assertNotNull(newResident.getId());
        assertEquals(1L, residents.count());
    }
}