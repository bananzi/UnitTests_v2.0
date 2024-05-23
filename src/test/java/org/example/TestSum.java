package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSum {
    long[] correct = {482, 52362985927L, 496163501466L, 5000886374086L, 49837291595353L, 499800189662153L};
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
    @Test
    void Test_sum1() throws FileNotFoundException {
        i = 1;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);

    }

    @Test
    void Test_sum2() throws FileNotFoundException {
        i = 2;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);

    }

    @Test
    void Test_sum3() throws FileNotFoundException {
        i = 3;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);
    }

    @Test
    void Test_sum4() throws FileNotFoundException {
        i = 4;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);
    }

    @Test
    void Test_sum5() throws FileNotFoundException {
        i = 5;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";

        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);
    }

    @Test
    void Test_sum6() throws FileNotFoundException {
        i = 6;
        String file = "src/test/java/org/example/TestInput/test" + i + ".txt";
        Scanner scanner = new Scanner(new File(file));
        List<Integer> arr = new ArrayList<>();
        while (scanner.hasNext()) {
            arr.add(scanner.nextInt());
        }
        scanner.close();
        long result = App._sum(arr);
        assertEquals(correct[i - 1], result);
    }
}