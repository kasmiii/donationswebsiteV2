package com.jee.donationswebsite.RepositoriesTest;
import com.jee.donationswebsite.repositories.ObjetRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ObjetRepoTest {

    @Autowired
    ObjetRepo objetRepo;

    @Test
    void asertThatObjetIsReturnedCorrectelly(){
        assertThat(objetRepo.getObjetById("15NpBI").getmDescription().equals("livre2"));
    }
    //@Test
    //void assertThat

}
