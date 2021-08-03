package com.revature;

public class Trainproblem {
	private int serial;
	   private String code;
	   private String station;
	   private String arrival;
	   private String departure;
	   public Trainproblem(int serial, String code, String station, String arrival, String departure) {
			this.serial = serial;
			this.code = code;
			this.station = station;
			this.arrival = arrival;
			this.departure = departure;
		}  
	   public void DisplayStatement() {
	   System.out.printf("%d %4s %17s %8s %11s\n",serial,code,station,arrival,departure);

	   }
	}
