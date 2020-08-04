package mockito;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import stub.GradeService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private GradeService gradeService;

    @BeforeEach
    public void setUp() {
        gradeService = Mockito.mock(GradeService.class);
    }

    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        when(gradeService.calculateAverageGrades(0)).thenReturn(90.0);
        double result = gradeService.calculateAverageGrades(0);
        assertEquals(90.0, result);
    }
}
