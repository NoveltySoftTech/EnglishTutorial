package com.nst.eng.persistance;

import com.nst.eng.persistance.entities.VerbTenses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerbTensesRepository extends JpaRepository<VerbTenses, Long> {
}
