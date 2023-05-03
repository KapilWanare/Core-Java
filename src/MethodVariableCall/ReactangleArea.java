package MethodVariableCall;

public class ReactangleArea {
	int length;
	int breadth;
	void Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
	public int getArea() {
		return length * breadth;
	}
}
