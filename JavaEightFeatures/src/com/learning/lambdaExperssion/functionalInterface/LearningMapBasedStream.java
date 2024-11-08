package com.learning.lambdaExperssion.functionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LearningMapBasedStream {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(50, "Raja");
		hashMap.put(45, "Saraswathi");
		hashMap.put(30, "Suchithra");
		hashMap.put(27, "Dineshkumar");
		hashMap.put(33, "Praveen");
		hashMap.put(1, "MokshithKrishna");
		hashMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		List<Integer> list = hashMap.keySet().stream().sorted().collect(Collectors.toList());
		List<String> name = hashMap.values().stream().sorted().collect(Collectors.toList());
		list.stream().forEach(System.out::println);
		name.forEach(System.out::println);
	}

}
