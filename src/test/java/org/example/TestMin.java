package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMin {
    int[] correct = {4, 6878459, 173072, 10939, 3130, 128};
    long start;
    int i;

    @BeforeEach
    public void start() {
        start = System.currentTimeMillis();
    }

    @AfterEach
    public void end() {
        System.out.println("При " + (int) Math.pow(10, i) + " чисел, время работы: " + (System.currentTimeMillis() - start) + " мс");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5, 6})
    void testMin(int number) throws FileNotFoundException {
        i = number;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        int result = App.min(arr);
        assertEquals(correct[i - 1], result);

    }
}