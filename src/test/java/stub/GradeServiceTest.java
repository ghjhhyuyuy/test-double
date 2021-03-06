package stub;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GradeServiceTest {
    /* 需求描述：
    编写GradeService类的单元测试，单元测试calculateAverageGrades方法
    * */
    private GradeService gradeService;
    @BeforeEach
    public void setUp() {
        GradeSystem gradeSystem = new MockGradeSystem();
        gradeService = new GradeService(gradeSystem);
    }
    @Test
    public void shouldReturn90WhenCalculateStudentAverageGradeAndGradeIs80And90And100() {
        assertEquals(90.0,gradeService.calculateAverageGrades(0));
    }
}
