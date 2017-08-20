package com.interview.rabbits;

public class MaleRabbit extends Rabbit {

	public MaleRabbit() {

		this.lifetime = Statistics.malelifetime;
		this.age = 0;

	}

	public MaleRabbit(Integer _lifetime, Integer _age) {
		this.age = _age;
		this.lifetime = _lifetime;
	}
}
