package by.htp.task1.view;

import by.htp.task1.entity.Array;

public class ArrayPrinter {
	
	public void print(Array array) {
		for(int i = 0; i < array.getLength(); i++) {
			for (int j = 0; j < array.getLength(); j++) {
				System.out.print(array.getValue(i, j) + "\t");
			}
			System.out.println();
		}
	}

}
