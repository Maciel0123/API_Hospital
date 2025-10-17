package med.voll.API.domain.consulta.validacoes;

import med.voll.API.domain.consulta.DadosAgendamentoConsulta;
import med.voll.API.domain.consulta.ValidacaoException;
import org.springframework.stereotype.Component;

import java.time.DayOfWeek;

@Component
public class ValidadorHorarioFuncionamentoClinica implements ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataConsulta = dados.data();

        var domingo = dataConsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);

        var antesDaAberturaDaClinca = dataConsulta.getHour() < 7;

        var depoisDoEncerramentoDaClinca = dataConsulta.getHour() > 18;

        if (domingo || antesDaAberturaDaClinca || depoisDoEncerramentoDaClinca) {
            throw new ValidacaoException("Consulta fora do horario da clinica");
        }
    }

}
