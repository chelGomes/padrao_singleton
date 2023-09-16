public class CoordenacaoCurso {
    private CoordenacaoCurso(){}
    private static CoordenacaoCurso instance = new CoordenacaoCurso();
    public static CoordenacaoCurso getInstance(){
        return instance;
    }

    private String nomeCurso;
    private String nomeCoordenador;

    private String matriculaSiape;

    public String getMatriculaSiape() {
        return matriculaSiape;
    }

    public void setMatriculaSiape(String matriculaSiape) {
        this.matriculaSiape = matriculaSiape;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public void setNomeCoordenador(String nomeCoordenador) {
        this.nomeCoordenador = nomeCoordenador;
    }

    public String getNomeCoordenador(){
        return nomeCoordenador;
    }
}
