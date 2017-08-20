package com.interview.rabbits;

import java.util.ArrayList;

public class Coop {

	ArrayList<MaleRabbit> maleRabbits = new ArrayList<MaleRabbit>();
	ArrayList<FemaleRabbit> femaleRabbits = new ArrayList<FemaleRabbit>();
	private Integer percentageofRabbitsBorn;
	private Integer numberofNewbornRabbits;

	public Coop() {

		this.numberofNewbornRabbits = Statistics.numberofNewbornRabbits;
		this.percentageofRabbitsBorn = Statistics.percentageofRabbitsBorn;

	}

	public Rabbit getGenderRabbits(Gender gender) {
		Rabbit rabbit = null;
		if (gender.equals(Gender.MALE)) {
			maleRabbits.add(new MaleRabbit());
		} else if (gender.equals(Gender.FEMALE)) {
			femaleRabbits.add(new FemaleRabbit());
		}

		return rabbit;
	}

	public Integer getPercentageofRabbitsBorn() {
		return percentageofRabbitsBorn;
	}

	public void setPercentageofRabbitsBorn(Integer percentageofRabbitsBorn) {
		this.percentageofRabbitsBorn = percentageofRabbitsBorn;
	}

	public Integer getNumberofNewbornRabbits() {
		return numberofNewbornRabbits;
	}

	public void setNumberofNewbornRabbits(Integer numberofNewbornRabbits) {
		this.numberofNewbornRabbits = numberofNewbornRabbits;
	}

}
