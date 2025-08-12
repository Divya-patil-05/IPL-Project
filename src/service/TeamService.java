package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
public void printTeamDetails() {
	Team team = TeamRepository.getMIteamDetails();
	System.out.println(team.getId());
	System.out.println(team.getTeamName());
	System.out.println(team.getCaptainName());
	System.out.println(team.getCoachName());
	System.out.println(team.getisQualified());
	System.out.println(team.getnRR());
}
public void printRCBTeamDetails() {
Team team=TeamRepository.getRCBTeamDetails();
System.out.println(team.getId());
System.out.println(team.getTeamName());
System.out.println(team.getCaptainName());
System.out.println(team.getCoachName());
System.out.println(team.getisQualified());
System.out.println(team.getnRR());

}
public void printRRTeamDetails() {
	Team team=TeamRepository.getRRTeamDetails();
	System.out.println(team.getId());
	System.out.println(team.getTeamName());
	System.out.println(team.getCaptainName());
	System.out.println(team.getCoachName());
	System.out.println(team.getisQualified());
	System.out.println(team.getnRR());

	}
public void printSRHTeamDetails() {
	Team team=TeamRepository.getSRHTeamDetails();
	System.out.println(team.getId());
	System.out.println(team.getTeamName());
	System.out.println(team.getCaptainName());
	System.out.println(team.getCoachName());
	System.out.println(team.getisQualified());
	System.out.println(team.getnRR());

	}
public void printCSKTeamDetails() {
	Team team=TeamRepository.getCSKTeamDetails();
	System.out.println(team.getId());
	System.out.println(team.getTeamName());
	System.out.println(team.getCaptainName());
	System.out.println(team.getCoachName());
	System.out.println(team.getisQualified());
	System.out.println(team.getnRR());

	}

	
}
  
