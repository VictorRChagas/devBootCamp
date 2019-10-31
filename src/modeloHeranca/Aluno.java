package modeloHeranca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa {
    private List<AlunoCurso> cursoList = new ArrayList<>();

    public List<AlunoCurso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<AlunoCurso> cursoList) {
        this.cursoList = cursoList;
    }

    public Integer matricularAluno(Curso curso){
        boolean estaMatriculadoNoCurso = false;

        for (AlunoCurso alunoCurso : cursoList) {
            if(alunoCurso.getCurso().getId().equals(curso.getId())){
                estaMatriculadoNoCurso = true;
                System.out.println("Aluno já está cadastrado no curso: " + curso.getNomeCurso());
                return alunoCurso.getMatricula();
            }
        }

        AlunoCurso alunoCurso = new AlunoCurso(curso, LocalDate.now());
        cursoList.add(alunoCurso);
        System.out.println("Aluno matriculado no curso " + curso.getNomeCurso());
        return alunoCurso.getMatricula();
    }
}
