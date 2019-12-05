package com.bharat.hibernateproject;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserClass 
{
	
	private String name;
	@Id
	private Integer id;
	private String skills;
	private String nativeplace;
	private int year_of_passout;
	private String favsubject;
	int MathsMarks;
	int ScienceMarks;
	int EnglishMarks;
	int HistoryMarks;
	int GeographyMarks;
	int KannadaMarks;
	double Percentage;
	
	
	
	
	
	
	public double getPercentage() {
		return Percentage;
	}
	public void setPercentage(double percentage) {
		Percentage = percentage;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getNativeplace() {
		return nativeplace;
	}
	public void setNativeplace(String nativeplace) {
		this.nativeplace = nativeplace;
	}
	public int getYear_of_passout() {
		return year_of_passout;
	}
	public void setYear_of_passout(int year_of_passout) {
		this.year_of_passout = year_of_passout;
	}
	public String getFavsubject() {
		return favsubject;
	}
	public void setFavsubject(String favsubject) {
		this.favsubject = favsubject;
	}
	
	
	public int getMathsMarks() {
		return MathsMarks;
	}
	public void setMathsMarks(int mathsMarks) {
		MathsMarks = mathsMarks;
	}
	public int getScienceMarks() {
		return ScienceMarks;
	}
	public void setScienceMarks(int scienceMarks) {
		ScienceMarks = scienceMarks;
	}
	public int getEnglishMarks() {
		return EnglishMarks;
	}
	public void setEnglishMarks(int englishMarks) {
		EnglishMarks = englishMarks;
	}
	public int getHistoryMarks() {
		return HistoryMarks;
	}
	public void setHistoryMarks(int historyMarks) {
		HistoryMarks = historyMarks;
	}
	public int getGeographyMarks() {
		return GeographyMarks;
	}
	public void setGeographyMarks(int geographyMarks) {
		GeographyMarks = geographyMarks;
	}
	public int getKannadaMarks() {
		return KannadaMarks;
	}
	public void setKannadaMarks(int kannadaMarks) {
		KannadaMarks = kannadaMarks;
	}
	@Override
	public String toString() {
		return "UserClass [name=" + name + ", id=" + id + ", skills=" + skills + ", nativeplace=" + nativeplace
				+ ", year_of_passout=" + year_of_passout + ", favsubject=" + favsubject + ", MathsMarks=" + MathsMarks
				+ ", ScienceMarks=" + ScienceMarks + ", EnglishMarks=" + EnglishMarks + ", HistoryMarks=" + HistoryMarks
				+ ", GeographyMarks=" + GeographyMarks + ", KannadaMarks=" + KannadaMarks + "]";
	}
	
	
	
	
	
	
	

	
	
	
	
	
}
