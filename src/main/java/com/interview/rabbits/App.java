package com.interview.rabbits;

import java.util.Iterator;
import java.util.Scanner;

public class App {
	public static void main(String args[]) {
		App ini = new App();
		ini.doit();
	}

	public void doit() {
		try {
			Statistics.getInstance().getStaticInformations();

			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			int months = scanner.nextInt();
			if (months <= 0) {
				System.out.println("There are 1 female and 1 male newborn rabbits in the coop..");
			} else {

				Coop coop = new Coop();
				coop.getGenderRabbits(Gender.MALE);
				coop.getGenderRabbits(Gender.FEMALE);

				for (int month = 0; month <= months;) {
					if (coop.femaleRabbits.size() > 0) {
						int newBornFemaleRabbit = 0;
						int newBornMaleRabbit = 0;
						for (FemaleRabbit femaleRabbit : coop.femaleRabbits) {
							if (femaleRabbit.getLoseofFertility() > femaleRabbit.getAge() && femaleRabbit.getAge() > 0) {
								newBornFemaleRabbit += coop.getNumberofNewbornRabbits()
										* coop.getPercentageofRabbitsBorn() / 100;
								newBornMaleRabbit += coop.getNumberofNewbornRabbits()
										* (100 - coop.getPercentageofRabbitsBorn()) / 100;
								
							}
						}

						for (int i = 0; i < newBornFemaleRabbit; i++) {
							coop.getGenderRabbits(Gender.FEMALE);
						}
						for (int i = 0; i < newBornMaleRabbit; i++) {
							coop.getGenderRabbits(Gender.MALE);
						}
						Iterator<FemaleRabbit> iterF = coop.femaleRabbits.iterator();
						while (iterF.hasNext()) {
							FemaleRabbit femaleRabbit = iterF.next();
							if (femaleRabbit.getAge() >= femaleRabbit.getLifetime()) {
								iterF.remove();
							} else {
								if(month != months)
									femaleRabbit.age += Statistics.timeofPregnancy;
							}
						}

						Iterator<MaleRabbit> iter = coop.maleRabbits.iterator();
						while (iter.hasNext()) {
							MaleRabbit maleRabbit = iter.next();
							if (maleRabbit.getAge() >= maleRabbit.getLifetime()) {
								iter.remove();
							} else {
								if(month != months)
									maleRabbit.age += Statistics.timeofPregnancy;
							}
						}

					}
					month += Statistics.timeofPregnancy;
				}

				for (int i = 0; i <= months; i++) {
					int numberFemale = 0;
					int numberMale = 0;
					for (FemaleRabbit femaleRabbit : coop.femaleRabbits) {

						if (femaleRabbit.getAge() == i) {
							numberFemale++;
						}
					}

					for (MaleRabbit maleRabbit : coop.maleRabbits) {

						if (maleRabbit.getAge() == i) {
							numberMale++;
						}
					}

					System.out.println(i + " months age " + numberFemale + " female " + numberMale + " male rabbits");

				}

			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
