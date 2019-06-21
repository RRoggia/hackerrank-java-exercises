package com.hackerrank.java.bignumber;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.hackerrank.IOUtils;

public class Exercise51 {
	public static void main(String[] args) {
		IOUtils.initializeInputStreamForFile("exercise51.txt");
		try (Scanner scan = new Scanner(System.in)) {

			int numbers = scan.nextInt();
			String[] s = new String[numbers];
			for (int i = 0; i < numbers; i++) {
				s[i] = scan.next();
			}

			class BigDecimalWithOriginalRepresentation extends BigDecimal {

				private String originalRepresentation;

				public BigDecimalWithOriginalRepresentation(String originalRepresentation) {
					super(originalRepresentation);
					this.originalRepresentation = originalRepresentation;
				}

				public String getOriginalRepresentation() {
					return originalRepresentation;
				}

			}

			final List<BigDecimalWithOriginalRepresentation> original = new ArrayList<>();
			List<BigDecimalWithOriginalRepresentation> toBeSorted = new ArrayList<>();

			List<String> asList = Arrays.asList(s);
			for (String numberAsString : asList) {
				BigDecimalWithOriginalRepresentation number = new BigDecimalWithOriginalRepresentation(numberAsString);
				original.add(number);
				toBeSorted.add(number);
			}

			Collections.sort(toBeSorted, (number1, number2) -> {
				if (number1.compareTo(number2) == 0) {
					return original.indexOf(number1) < original.indexOf(number2) ? 1 : -1;
				}
				return number1.compareTo(number2);
			});

			Collections.reverse(toBeSorted);

			for (int i = 0; i < toBeSorted.size(); i++) {
				s[i] = toBeSorted.get(i).getOriginalRepresentation();
			}

			for (int i = 0; i < numbers; i++) {
				System.out.println(s[i]);
			}

		}
	}
}
