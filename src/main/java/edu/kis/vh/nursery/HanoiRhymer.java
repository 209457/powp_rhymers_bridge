package edu.kis.vh.nursery;

import edu.kis.vh.nursery.collections.IntLinkedList;

public class HanoiRhymer extends DefaultCountingOutRhymer{

	private int totalRejected = 0;
	
	public HanoiRhymer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HanoiRhymer(IntLinkedList linkedList) {
		super(linkedList);
		// TODO Auto-generated constructor stub
	}

	int reportRejected() {
		return totalRejected;
	}
	
	@Override
	public void countIn(int in) {
		if (!callCheck() && in > peekaboo())
			totalRejected++;
		else
			super.countIn(in);
	}
}
