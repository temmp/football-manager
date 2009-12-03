package ie.tippinst.jod.fm.model;

import java.util.Calendar;

public class Match {
	private Calendar date;
	private Club homeTeam;
	private Club awayTeam;
	private int homeScore;
	private int awayScore;
	private Competition competition;
	private Stadium stadium;
	
	public Match() {
		super();
	}
	
	public Match(Club homeTeam, Club awayTeam, int homeScore,
			int awayScore, Competition competition, Stadium stadium) {
		super();
		this.homeTeam = homeTeam;
		this.awayTeam = awayTeam;
		this.homeScore = homeScore;
		this.awayScore = awayScore;
		this.competition = competition;
		this.stadium = stadium;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public Club getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(Club homeTeam) {
		this.homeTeam = homeTeam;
	}

	public Club getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(Club awayTeam) {
		this.awayTeam = awayTeam;
	}

	public int getHomeScore() {
		return homeScore;
	}

	public void setHomeScore(int homeScore) {
		this.homeScore = homeScore;
	}

	public int getAwayScore() {
		return awayScore;
	}

	public void setAwayScore(int awayScore) {
		this.awayScore = awayScore;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
	}

	public Stadium getStadium() {
		return stadium;
	}

	public void setStadium(Stadium stadium) {
		this.stadium = stadium;
	}

	@Override
	public String toString() {
		return homeTeam.getName() + " " + (homeScore == -1 ? "" : homeScore) + "-" + (awayScore == -1 ? "" : awayScore) + " " + awayTeam.getName();
	}	
}
