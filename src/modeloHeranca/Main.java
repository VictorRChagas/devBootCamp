package modeloHeranca;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("888888");

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setCpf("888888");
        funcionario.setDataAdimissao(LocalDate.now().minusYears(1));
        funcionario.setSalario(BigDecimal.valueOf(1000));
        System.out.println("Funcionario: ");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("CPF: " + funcionario.getCpf());
        System.out.println("Data Adimissao: " + funcionario.getDataAdimissao());
        System.out.println("Salário: " + funcionario.calculaSalario());
        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("João");
        aluno.setCpf("777777");
        aluno.getCursoList();

        Curso curso = new Curso(1,"ADS",4);
        Curso curso1 = new Curso(2,"ADM",4);

        Integer matricula = aluno.matricularAluno(curso);
        Integer matriculaADM = aluno.matricularAluno(curso1);
        Integer matricula1 = aluno.matricularAluno(curso1);
        System.out.println(matriculaADM);

        System.out.println("Cursos do Aluno: ");
        for (AlunoCurso alunoCurso : aluno.getCursoList()) {
            System.out.println(alunoCurso.getMatricula());
            System.out.println(alunoCurso.getCurso().getNomeCurso());
            System.out.println(alunoCurso.getDataInicio());
            System.out.println();
        }

        ProfessorCurso professorCurso = new ProfessorCurso();
        professorCurso.setCurso(curso1);
        professorCurso.setPercentual(10D);

        Professor professor = new Professor();
        professor.setCpf("1111111");
        professor.setNome("pdpfmgkdfgmdflg");
        professor.setDataAdimissao(LocalDate.now());
        professor.getProfessorCursoList();
        professor.setSalario(BigDecimal.valueOf(4000));


        System.out.println("Professor: ");
        System.out.println("Nome: " + professor.getNome());
        System.out.println("CPF: " + professor.getCpf());
        System.out.println("Data de adminissão: " + professor.getDataAdimissao());
        System.out.println("Salario: " + professor.calculaSalario());
        System.out.println("Cursos: ");
        for (ProfessorCurso professorCurso1 : professor.getProfessorCursoList()) {
            System.out.println("Curso: " + professorCurso1.getCurso().getNomeCurso());
            System.out.println("Percentual sobre o curso: " + professorCurso1.getPercentual());
            System.out.println();
        }



    }
}
