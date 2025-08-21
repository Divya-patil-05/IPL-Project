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
	// add similar methods for remaining 9 teams
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
		team.setId(105);
		team.setTeamName("Chennai Super Kings");
		team.setCaptainName("Ruturaj Gaikwad");
		team.setCoachName("Stephen Fleming");
		team.setQualified(false);
		team.setnRR(-0.647f);
		return team;
	}
	
	
	public static Team getLSGTeamDetails() {
		Team team=new Team();
		team.setId(107);
		team.setTeamName("Lucknow Super Giants");
		team.setCaptainName("Rishabh Pant");
		team.setCoachName("Justin Langer ");
		team.setQualified(false);
		team.setnRR(-0.376f);
		return team;
	}
	public static Team getKKRTeamDetails() {
		Team team=new Team();
		team.setId(108);
		team.setTeamName("Kolkata Knight Riders");
		team.setCaptainName("Ajinkya Rahane");
		team.setCoachName("Chandrakant Pandit");
		team.setQualified(false);
		team.setnRR(-0.305f);
		return team;
	}
	public static Team getGTTeamDetails() {
		Team team=new Team();
		team.setId(100);
		team.setTeamName("Gujarat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Ashish Nehra");
		team.setQualified(false);
		team.setnRR(+0.254f);
		team.setShortName("GT");
		return team;
	}
	public static Team getDelhiCapitalTeamDetails() {
		Team team=new Team();
		team.setId(110);
		team.setTeamName("DelhiCapital");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setQualified(false);
		team.setnRR(+0.744f);
		team.setShortName("DC");
		return team;
	}
	 
	}
		
	

