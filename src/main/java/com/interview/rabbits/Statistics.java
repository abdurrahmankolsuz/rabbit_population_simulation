package com.interview.rabbits;

import java.io.FileInputStream;
import java.util.Properties;

public class Statistics {
	 private static Statistics singleton = new Statistics( );
	 public static Integer malelifetime;
	 public static Integer femalelifetime;
	 public static Integer timeofPregnancy;
	 public static Integer loseofFertility;
	 public static Integer percentageofRabbitsBorn;
	 public static Integer numberofNewbornRabbits;
	 
	 

	   private Statistics() { }

	   public static Statistics getInstance( ) {
	      return singleton;
	   }

	   protected void getStaticInformations( ) {
		   try {
				Properties p = new Properties();
				p.load(new FileInputStream("target/user.ini"));
				
				malelifetime = Integer.valueOf(p.getProperty("Lifetimeofmalerabbits"));
				femalelifetime = Integer.valueOf(p.getProperty("Lifetimeoffemalerabbits"));
				loseofFertility = Integer.valueOf(p.getProperty("Theperiodoflosefertility"));
				timeofPregnancy = Integer.valueOf(p.getProperty("Theperiodofpregnancyoffemalerabbits"));
				numberofNewbornRabbits = Integer.valueOf(p.getProperty("Thenumberofnewbornrabbits"));
				percentageofRabbitsBorn = Integer.valueOf(p.getProperty("Percentageofnewbornrabbits"));
				
			} catch (Exception e) {
				System.out.println(e);
			}

	   }

}
