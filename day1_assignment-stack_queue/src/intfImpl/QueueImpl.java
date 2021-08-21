package intfImpl;

import intf.QueueIntf;

public class QueueImpl implements QueueIntf {
	private int top;
	private int[] queue;
	public QueueImpl(int num) {
		queue=new int[num];
		top=-1;
	}
	@Override
	public void AddQ(int elem) {
		for(int i=top;i>=0;i--) {
			queue[i+1]=queue[i];
		}
		top++;
		queue[0]=elem;
	}

	@Override
	public int DeleteQ() {
		int num = queue[top];
		top--;
		return num;
	}

	@Override
	public boolean IsEmpty() {
		if(top<0) {
			top=-1;
			return true;
		}
		return false;
	}

	@Override
	public boolean IsFull() {
		if(queue.length==top+1) {
			return true;
		}
		return false;
	}

}
