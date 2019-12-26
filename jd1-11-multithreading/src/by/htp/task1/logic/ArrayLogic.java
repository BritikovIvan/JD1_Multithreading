package by.htp.task1.logic;

import by.htp.task1.entity.Array;

public class ArrayLogic implements Runnable {
	
	private Array array;
	private int num;
	
	public ArrayLogic(Array array, int num) {
		this.array = array;
		this.num = num;
	}

	@Override
	public void run() {
		int value = 0;
		while(value == 0) {
			array.getLock().lock();
			value = array.getLast();
			array.add(num);
			array.getLock().unlock();
		}
	}

}
