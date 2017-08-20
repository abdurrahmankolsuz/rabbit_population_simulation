package com.interview.rabbits;

public class FemaleRabbit extends Rabbit {

	private Integer timeofPregnancy;
	private Integer loseofFertility;
	private boolean isPregnant;

	public FemaleRabbit() {

		this.lifetime = Statistics.femalelifetime;
		this.loseofFertility = Statistics.loseofFertility;
		this.timeofPregnancy = Statistics.timeofPregnancy;
		this.age = 0;
		this.isPregnant = false;

	}

	public FemaleRabbit(Integer _timeofPregnancy, Integer _loseofFertility, Integer _age, Integer _lifetime, boolean _isPregnant) {
		this.timeofPregnancy = _timeofPregnancy;
		this.loseofFertility = _loseofFertility;
		this.age = _age;
		this.lifetime = _lifetime;
		this.isPregnant = _isPregnant;
	}

	public Integer getTimeofPregnancy() {
		return timeofPregnancy;
	}

	public void setTimeofPregnancy(Integer timeofPregnancy) {
		this.timeofPregnancy = timeofPregnancy;
	}

	public Integer getLoseofFertility() {
		return loseofFertility;
	}

	public void setLoseofFertility(Integer loseofFertility) {
		this.loseofFertility = loseofFertility;
	}

	public boolean isPregnant() {
		return isPregnant;
	}

	public void setPregnant(boolean isPregnant) {
		this.isPregnant = isPregnant;
	}


}
