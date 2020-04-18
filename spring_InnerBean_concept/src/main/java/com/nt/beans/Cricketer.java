package com.nt.beans;

public class Cricketer {
private CricketBat cricketbat; 
public String BattingScroe()
{int runs=cricketbat.ScoreRuns();
	return "Batting score="+runs;
}
public Cricketer(CricketBat cricketbat) {
	super();
	this.cricketbat = cricketbat;
}
@Override
public String toString() {
	return "Cricketer [cricketbat=" + cricketbat + "]";
}
}
