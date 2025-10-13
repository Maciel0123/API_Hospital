package med.voll.API.domain.paciente;

import jakarta.validation.constraints.NotNull;
import med.voll.API.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPacientes(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
