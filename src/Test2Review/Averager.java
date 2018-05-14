package Test2Review;

public class Averager extends Summer {
	public Averager(double[] arr) {
		super(arr);
	}

	@Override
	public double measure() {
		if (super.measure() == -1) {
			return -1;
		}
		return super.measure() / super.value();
	}

}
