package by.htp.task1.main;

import by.htp.task1.entity.Array;
import by.htp.task1.logic.ArrayLogic;
import by.htp.task1.view.ArrayPrinter;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		int length = 100;
		Array array = new Array(length);
		Thread thr1 = new Thread(new ArrayLogic(array, 1));
		Thread thr2 = new Thread(new ArrayLogic(array, 2));
		Thread thr3 = new Thread(new ArrayLogic(array, 3));
		Thread thr4 = new Thread(new ArrayLogic(array, 4));
		Thread thr5 = new Thread(new ArrayLogic(array, 5));
		
		thr1.start();
		thr2.start();
		thr3.start();
		thr4.start();
		thr5.start();
		
		Thread.sleep(5000);
		ArrayPrinter printer = new ArrayPrinter();
		printer.print(array);
	}

}
