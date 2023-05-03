package Constructor;

public class ConstructorOverloading {
	private int rollNum;
	ConstructorOverloading() { rollNum = 100;
	}
	ConstructorOverloading(int rnum) {
		this();
		/*
		 * this() is used for calling the default constructor from parameterized
		 * constructor. It should always be the first statement in constructor
		 * body.
		 */ rollNum = rollNum + rnum;
	}
	public int getRollNum() { return rollNum;
	}
	public void setRollNum(int rollNum) { this.rollNum = rollNum;
	}
}