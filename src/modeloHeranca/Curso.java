package modeloHeranca;

public class Curso {
    private Integer id;
    private String nomeCurso;
    private Integer duracaoCurso;

    public Curso(Integer id, String nomeCurso, Integer duracaoCurso) {
        this.id = id;
        this.nomeCurso = nomeCurso;
        this.duracaoCurso = duracaoCurso;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public Integer getDuracaoCurso() {
        return duracaoCurso;
    }
}
