package assignment08;

class Student {
	private String name;
	private int numCreditsApplied;
	private String major = "undeclared";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumCreditsApplied() {
		return numCreditsApplied;
	}

	public void setNumCreditsApplied(int numCreditsApplied) {
		this.numCreditsApplied = numCreditsApplied;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String s) {
		major = s;
	}

	@Override
	public String toString() {
		return name + " (" + major + ": " + numCreditsApplied + ")";
	}

}
