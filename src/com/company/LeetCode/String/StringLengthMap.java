package com.company.LeetCode.String;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StringLengthMap {

        public static Map<Integer, Set<String>> groupByLengthStream(List<String> words) {
            return words.stream()
                    .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
        }

        public static void main(String[] args) {
            List<String> words = List.of("abc", "xyz", "abcd", "eddf", "1234567", "1234567", "23", "43");
            Map<Integer, Set<String>> lengthMap = groupByLengthStream(words);

            System.out.println(lengthMap);
        }

}
