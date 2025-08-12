package repository;

import entity.Team;

public class TeamRepository {

	//Should return MI team details
	public static Team getMIteamDetails() {
		Team team=new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("JayWardhan");
		team.setQualified(false);
		team.setnRR(2.3f);
		return team;
	}
	public static Team getRCBTeamDetails() {
		Team team=new Team();
		team.setId(102);
		team.setTeamName("Royal Challengers Bengalore");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy Flower");
		team.setQualified(false);
		team.setnRR(0.301f);
		return team;
	}
	public static Team getRRTeamDetails() {
		Team team=new Team();
		team.setId(103);
		team.setTeamName("Rajastan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setQualified(false);
		team.setnRR(-0.733f);
		return team;
	}
	public static Team getSRHTeamDetails() {
		Team team=new Team();
		team.setId(104);
		team.setTeamName("Sunrisers Hydrabad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Daniel Vettori");
		team.setQualified(false);
		team.setnRR(-0.241f);
		return team;
	}
	public static Team getCSKTeamDetails() {
		Team team=new Team();
		team.setId(102);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setQualified(false);
		team.setnRR(-0.647f);
		return team;
	}
		
	}
// add similar methods for remaining 9 teams
