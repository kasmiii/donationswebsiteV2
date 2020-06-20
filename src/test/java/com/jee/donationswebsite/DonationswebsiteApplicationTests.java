package com.jee.donationswebsite;

import com.jee.donationswebsite.controllers.DemandeController;
import com.jee.donationswebsite.controllers.FileController;
import com.jee.donationswebsite.controllers.PersonneController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DonationswebsiteApplicationTests {

    @Autowired
    FileController fileController;

    @Autowired
    DemandeController demandeController;

    @Autowired
    PersonneController personneController;

    @Test
    void contextLoads() throws Exception{
        assertThat(personneController).isNotNull();
    }

    @Test
    void test2(){
        assertThat(demandeController).isNotNull();
    }

}
