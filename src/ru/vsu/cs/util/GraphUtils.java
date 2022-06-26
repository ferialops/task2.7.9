package ru.vsu.cs.util;

import ru.vsu.cs.course1.graph.*;

public class GraphUtils {
    public static GraphAlgorithms fromString(String input) {
        GraphAlgorithms graph = new GraphAlgorithms();
        String[] lines = input.split("\n");
        for (int i = 0; i < lines.length; i++) {
            String[] values = lines[i].split(" ");
            graph.addEdge(values[0], values[1], Integer.parseInt(values[2]));
        }
        return graph;
    }
}
