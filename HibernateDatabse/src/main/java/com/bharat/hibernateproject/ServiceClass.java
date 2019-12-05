package com.bharat.hibernateproject;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

public class ServiceClass 
{
	
	String retrievedata=" ";
	double percentage=0.0;
	String retrievedatainteger="";

	
	public String conditionscheck(String a,String b ) 
	{	
		String a1="bharathadpad59@gmail.com";
		String b1="bharat@97";
		String c="Login Succes";
		String d="Login Fails";
		
		
		if(a.equals(a1) && b.equals(b1))
		{
			return c;
		
		}
		else
		{
			return d;	
		}
	}
	
	public String optionselection(String opt)
	{
		
		if(opt.equals("Insertingdata"))
		{
			return "insert";
		}
		else if(opt.equals("Retrivingdata"))
		{
			return "retrieve";
		}
		else if(opt.equals("Updatedata"))
		{
			return "update";
		}
		else 
		{
			return "delete";
		}
	}
	
	public void daoclassaccessinsert(String Name,int Id,String Favsubject,String Nativeplace,String Skills,int Yearofpassout, int mathsMarks, int scienceMarks, int englishMarks, int historyMarks, int geographyMarks, int kannadaMarks,double per) {
		try
		{
		DAOClass dao=new DAOClass();
		
		dao.databasestoring(Name, Id, Favsubject, Nativeplace, Skills,  Yearofpassout,mathsMarks,scienceMarks,englishMarks,historyMarks,geographyMarks,kannadaMarks,per);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static double percentagecalculation(int a,int b,int c,int d,int e,int f)
	{
		double total=(a+b+c+d+e+f);
		double per=(total*100)/600;
		ServiceClass s1=new ServiceClass();
		return per;
	}
	

	public String daoclassaccessretrieve(String name1) {
		
		DAOClass dao=new DAOClass();
		
		String x=dao.databaseretrieve(name1);
		
		return retrievedata= dao.s1;
		
	}
	
public String daoclassaccessretrievebyper(String name2) {
		
		DAOClass dao=new DAOClass();
		retrievedatainteger = dao.databaseretrievebyper(name2);
		return retrievedatainteger;
	}
	
	public void daoclassaccessretrieveall(String option) {
		
		DAOClass dao=new DAOClass();
		
		switch (option)
		{
		case "Nameall":{ 
			
			dao.databaseretrieveall();
			retrievedata=dao.s2;
			break;
			
		}
		
		
		case "Allidwithname":
			
		{
			dao.databaseretrieveallidname();
			retrievedata=dao.s3;
			break;
		}
		
		default:
			break;
			
		}
			
	}	
	

	public void daoclassaccessupdate(String name1,String skills1,int id1,int Yearofpassout,String Nativeplace,String Favsubject,int MathsMarks,int ScienceMarks,int EnglishMarks,int HistoryMarks,int GeographyMarks,int KannadaMarks) {
		
		DAOClass dao=new DAOClass();
		dao.databaseupdate(name1, skills1, id1,Yearofpassout,Nativeplace,Favsubject,MathsMarks,ScienceMarks,EnglishMarks,HistoryMarks,GeographyMarks,KannadaMarks);
		
	}
	
public void daoclassaccessdelete(int id2) {
		
		DAOClass dao=new DAOClass();
		dao.databasedelete(id2);
		
	}
	
	
	
}
