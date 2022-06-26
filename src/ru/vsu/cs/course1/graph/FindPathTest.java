package ru.vsu.cs.course1.graph;

import org.junit.Test;
import ru.vsu.cs.util.GraphUtils;

import static org.junit.jupiter.api.Assertions.*;

public class FindPathTest {
    @Test
    public void wayFindingTest1() {
        String inputGraphStr = "a c 9\n" +
                "a b 7\n" +
                "a f 14\n" +
                "b c 10\n" +
                "b d 15\n" +
                "c d 11\n" +
                "c f 2\n" +
                "d e 6\n" +
                "e f 9\n" +
                "f e 9";
        String cities = "f b";
        GraphAlgorithms inputGraph = GraphUtils.fromString(inputGraphStr);
        String actualResult = inputGraph.findPathWithDijkstraWithBadVertexes("a", "e", cities);
        String expectedResult = "a -> c(9km) -> d(20km) -> e(26km)";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void wayFindingTest2() {
        String inputGraphStr = "a c 20\n" +
                "a b 7\n" +
                "a f 14\n" +
                "b c 10\n" +
                "f c 4\n" +
                "b f 3\n" +
                "d a 5\n" +
                "c d 12";
        String cities = "f";
        GraphAlgorithms inputGraph = GraphUtils.fromString(inputGraphStr);
        String actualResult = inputGraph.findPathWithDijkstraWithBadVertexes("a", "c", cities);
        String expectedResult = "a -> b(7km) -> c(17km)";

        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void wayFindingTest3() {
        String inputGraphStr = "a c 20\n" +
                "a b 7\n" +
                "a f 14\n" +
                "b c 10\n" +
                "f c 4";
        String cities = "b";
        GraphAlgorithms inputGraph = GraphUtils.fromString(inputGraphStr);
        String actualResult = inputGraph.findPathWithDijkstraWithBadVertexes("a", "c", cities);
        String expectedResult = "a -> f(14km) -> c(18km)";

        assertEquals(expectedResult, actualResult);
    }

}