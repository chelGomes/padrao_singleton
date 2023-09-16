import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoordenacaoCursoTest {
    @org.junit.jupiter.api.Test
    void deveRetornarNomeCurso()
    {
        CoordenacaoCurso.getInstance().setNomeCurso("Sistemas de Informação");
        assertEquals("Sistemas de Informação", CoordenacaoCurso.getInstance().getNomeCurso());
    }
    @Test
    void deveRetornarNomeDoDiretor()
    {
        CoordenacaoCurso.getInstance().setNomeCoordenador("Luciano");
        assertEquals("Luciano", CoordenacaoCurso.getInstance().getNomeCoordenador());
    }
    @Test
    void deveRetornarMatriculaSiape()
    {
        CoordenacaoCurso.getInstance().setMatriculaSiape("1111111");
        assertEquals("1111111", CoordenacaoCurso.getInstance().getMatriculaSiape());
    }
}
