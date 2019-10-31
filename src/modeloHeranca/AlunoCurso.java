package modeloHeranca;

import java.time.LocalDate;
import java.util.Random;

public class AlunoCurso {
    private Integer matricula;
    private Curso curso;
    private LocalDate dataInicio;

    public AlunoCurso(Curso curso, LocalDate dataInicio) {
        this.matricula = new Random().nextInt();
        this.curso = curso;
        this.dataInicio = dataInicio;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }
}
