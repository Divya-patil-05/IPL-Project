package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {
public void printTeamDetails() {
	Team teamMI = TeamRepository.getMIteamDetails();
	System.out.println(teamMI.getId());
	System.out.println(teamMI.getTeamName());
	System.out.println(teamMI.getCaptainName());
	System.out.println(teamMI.getCoachName());
	System.out.println(teamMI.getisQualified());
	System.out.println(teamMI.getnRR());
	System.out.println("*************");


Team teamRCB=TeamRepository.getRCBTeamDetails();
System.out.println(teamRCB.getId());
System.out.println(teamRCB.getTeamName());
System.out.println(teamRCB.getCaptainName());
System.out.println(teamRCB.getCoachName());
System.out.println(teamRCB.getisQualified());
System.out.println(teamRCB.getnRR());
System.out.println("**************");



	Team teamRR=TeamRepository.getRRTeamDetails();
	System.out.println(teamRR.getId());
	System.out.println(teamRR.getTeamName());
	System.out.println(teamRR.getCaptainName());
	System.out.println(teamRR.getCoachName());
	System.out.println(teamRR.getisQualified());
	System.out.println(teamRR.getnRR());
	System.out.println("*************");

	

	Team teamSRH=TeamRepository.getSRHTeamDetails();
	System.out.println(teamSRH.getId());
	System.out.println(teamSRH.getTeamName());
	System.out.println(teamSRH.getCaptainName());
	System.out.println(teamSRH.getCoachName());
	System.out.println(teamSRH.getisQualified());
	System.out.println(teamSRH.getnRR());
	System.out.println("*************");

	

	Team teamCSK=TeamRepository.getCSKTeamDetails();
	System.out.println(teamCSK.getId());
	System.out.println(teamCSK.getTeamName());
	System.out.println(teamCSK.getCaptainName());
	System.out.println(teamCSK.getCoachName());
	System.out.println(teamCSK.getisQualified());
	System.out.println(teamCSK.getnRR());
	System.out.println("**************");

	
   Team teamLSG=TeamRepository.getLSGTeamDetails();
    System.out.println(teamLSG.getId());
    System.out.println(teamLSG.getTeamName());
    System.out.println(teamLSG.getCaptainName());
    System.out.println(teamLSG.getCoachName());
    System.out.println(teamLSG.getisQualified());
    System.out.println(teamLSG.getnRR());
    System.out.println("**************");


   Team teamGT=TeamRepository.getGTTeamDetails();
   System.out.println(teamGT.getId());
   System.out.println(teamGT.getTeamName());
   System.out.println(teamGT.getCaptainName());
   System.out.println(teamGT.getCoachName());
   System.out.println(teamGT.getisQualified());
   System.out.println(teamGT.getnRR());
   System.out.println("**************");



   Team teamKKR=TeamRepository.getKKRTeamDetails();
   System.out.println(teamKKR.getId());
   System.out.println(teamKKR.getTeamName());
   System.out.println(teamKKR.getCaptainName());
   System.out.println(teamKKR.getCoachName());
   System.out.println(teamKKR.getisQualified());
   System.out.println(teamKKR.getnRR());
   System.out.println("**************");



      Team teamDelhiCaptial=TeamRepository.getDelhiCapitalTeamDetails();
      System.out.println(teamDelhiCaptial.getId());
      System.out.println(teamDelhiCaptial.getTeamName());
      System.out.println(teamDelhiCaptial.getCaptainName());
      System.out.println(teamDelhiCaptial.getCoachName());
      System.out.println(teamDelhiCaptial.getisQualified());
      System.out.println(teamDelhiCaptial.getnRR());
      System.out.println("**************");

}
}

   






  
