package am.i.tm.tmdomain;

import javax.persistence.Entity;

@Entity
public class TMInstructor extends Employee {
	private int tmExprience;

	public TMInstructor() {
		super();
	}

	public TMInstructor(int tmExprience) {
		super();
		this.tmExprience = tmExprience;
	}

	public int getTmExprience() {
		return tmExprience;
	}

	public void setTmExprience(int tmExprience) {
		this.tmExprience = tmExprience;
	}

	@Override
	public String toString() {
		return "TMInstructor [tmExprience=" + tmExprience + "]";
	}

}
