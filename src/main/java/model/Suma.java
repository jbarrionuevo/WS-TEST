package model;

public class Suma {
	private final long id;
	private Integer int1;
	private Integer int2;

	public Suma(long id, Integer int1, Integer int2) {
		this.id = id;
		this.int1 = int1;
		this.int2 = int2;
	}

	public long getId() {
		return id;
	}

	public Integer getAddition() {
		return int1 + int2;
	}

}
