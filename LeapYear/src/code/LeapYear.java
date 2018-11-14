package code;

public class LeapYear {

	private int year;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public boolean isLeapYear() {
		if (this.year % 4 == 0) {
			if (this.year % 100 == 0) {
				if (this.year % 400 == 0) {
					return true;
				}
				return false;
			}
			return true;
		}
		return false;
	}

}
