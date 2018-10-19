package com.packt;

import org.openjdk.jmh.annotations.Benchmark;

public class MyBenchmark {

    @Benchmark
    public void testMethod() {
		int total = 0;
		for (int i = 0; i < 100_000; i++) {
			total = total + (i * 2);
		}
		System.out.println("Total: " + total);
    }

}
