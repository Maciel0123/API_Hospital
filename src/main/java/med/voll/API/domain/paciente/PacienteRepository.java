package med.voll.API.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.API.domain.medico.Medico;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {
    Page<Paciente> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            select m.ativo
            from Pacientes m
            where
            m.id = :id
            """)
    Boolean findAtivoById(@NotNull Long id);
}
