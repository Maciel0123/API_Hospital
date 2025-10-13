package med.voll.API.domain.paciente;

import med.voll.API.domain.endereco.Endereco;
import med.voll.API.domain.medico.DadosListagemMedicos;
import med.voll.API.domain.medico.Especialidade;

public record DadosListagemPacientes(Long id, String nome, String email, String cpf) {
    public DadosListagemPacientes(Paciente paciente){
        this(paciente.getId(), paciente.getNome(),  paciente.getEmail(), paciente.getCpf());
    }
}
