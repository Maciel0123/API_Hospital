package med.voll.API.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.API.domain.endereco.DadosEndereco;

public record DadosCadastroMedicos(

        @NotBlank //para STRINGs nulo e vazio
        String nome,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotBlank
        @Pattern(regexp = "\\d{4,6}") //valor numerico de 4 a 6 digitos
        String crm,

        @NotNull
        Especialidade especialidade,

        @NotNull @Valid DadosEndereco endereco) {
}
