package modeloHeranca;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class Professor extends Funcionario {
    private List<ProfessorCurso>  professorCursoList = new ArrayList<>();

    public List<ProfessorCurso> getProfessorCursoList() {
        return professorCursoList;
    }

    public void setProfessorCursoList(List<ProfessorCurso> professorCursoList) {
        this.professorCursoList = professorCursoList;
    }

    @Override
    public BigDecimal calculaSalario() {
        BigDecimal salarioBase = super.calculaSalario();

        Double totalPercentual = 0D;
        for (ProfessorCurso professorCurso : professorCursoList) {
            totalPercentual+= professorCurso.getPercentual();
        }

        return salarioBase.add(
                salarioBase.multiply(BigDecimal.valueOf(totalPercentual))
                .divide(BigDecimal.valueOf(100), RoundingMode.HALF_UP)
        );
    }
}
