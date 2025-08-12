package main;

import service.TeamService;

public class Test {
	public static void main(String[] args) {
		TeamService service=new TeamService();
		service.printTeamDetails();
		System.out.println("*************");
		service.printRCBTeamDetails();
		System.out.println("************");
		service.printCSKTeamDetails();
		System.out.println("************");
		service.printSRHTeamDetails();
		System.out.println("************");
		service.printRRTeamDetails();
		System.out.println("Test github");
	}

}
