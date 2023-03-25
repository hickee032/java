package sec04_exam_generic_method_2;

public class Tv {

	private int inch;

	public Tv(int inch) {
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	@Override
	public String toString() {
		return this.inch + "";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Tv) {
			Tv tv = (Tv) obj;
			if (this.inch == tv.inch) {
				return true;
			}
		}
		return false;
	}

}
