package com.nst.eng.persistance;

import com.nst.eng.persistance.entities.VerbTenses;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VerbTensesRepositoryTest {
    @Autowired private VerbTensesRepository verbTensesRepository;

    @Test
    public void save(){
        VerbTenses verbTenses1 = new VerbTenses();
        verbTenses1.setPresent("eat");
        verbTenses1.setPast("ate");
        verbTenses1.setPastParticiple("eaten");
        verbTenses1.setContinues("eating");
        //verbTenses1.setPresent3rdPerson("eats");
        VerbTenses saved = verbTensesRepository.save(verbTenses1);
        assertThat(saved.getId()).isNotNull();
        assertThat(verbTensesRepository).isNotNull();
    }
}
