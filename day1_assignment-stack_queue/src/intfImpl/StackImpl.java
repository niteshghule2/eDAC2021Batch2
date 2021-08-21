package intfImpl;

import intf.StackIntf;

public class StackImpl implements StackIntf {
	private int top;
	private int[] stack;
	public StackImpl(int num) {
		stack=new int[num];
		top=-1;
	}
	@Override
	public void Push(int elem) {
		stack[++top]=elem;
	}

	@Override
	public int Pop() {
		int num = stack[top];
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
		if(stack.length==top+1) {
			return true;
		}
		return false;
	}

}
