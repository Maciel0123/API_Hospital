package med.voll.API.domain.paciente;

import jakarta.validation.constraints.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PacienteRepository extends JpaRepository<Paciente,Long> {

    @Query("""
            select p.ativo
            from Pacientes p
            where
            p.id = :id
            """)
    Boolean findAtivoById(@NotNull Long idPaciente);
}
