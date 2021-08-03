package com.revature;

public class TrainMain extends Trainproblem {

	public TrainMain(int serial, String code, String station, String arrival, String departure) {
		super(serial, code, station, arrival, departure);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Yasvantpur Delhi Sarai Rohilla AC Duronto Express  (12213)");
		System.out.println("---------------------------------------------");
		System.out.println("#  Code   Station            Arr.      Dep.");
		System.out.println("---------------------------------------------");
	TrainMain[] input= {
			new TrainMain(1,"YPR","Yasvantpur JN"," ","23:40"),
			new TrainMain(2,"GTL","Guntakal JN","3:45","3:50"),
			new TrainMain(3,"SC ","Secundrabad JN","8:55","09:10"),
			new TrainMain(4,"BPQ","Balharshah JN","13:30","13:35"),
			new TrainMain(5,"HBJ","Habibganj JN","21:20","21:25"),
			new TrainMain(6,"JHS","Jhansi JN","1:15","01:20"),
			new TrainMain(7,"DEE","Delhi S Rohilla","07:00"," "),
	};
	for(TrainMain t: input) {
		t.DisplayStatement();
	}
		}



}
