import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassificationTest {

    @Test
    void classifiTriangleTest1() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 2;
        String expected = "tam giac deu";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void classifiTriangleTest2() {
        int sideA = 2;
        int sideB = 2;
        int sideC = 3;
        String expected = "tam giac can";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void classifiTriangleTest3() {
        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        String expected = "tam giac thuong";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void classifiTriangleTest4() {
        int sideA = 8;
        int sideB = 2;
        int sideC = 3;
        String expected = "khong phai tam giac";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void classifiTriangleTest5() {
        int sideA = -1;
        int sideB = 2;
        int sideC = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }

    @Test
    void classifiTriangleTest6() {
        int sideA = 0;
        int sideB = 1;
        int sideC = 1;
        String expected = "khong phai tam giac";
        String result = TriangleClassification.classifiTriangle(sideA,sideB,sideC);
        assertEquals(expected,result);
    }
}