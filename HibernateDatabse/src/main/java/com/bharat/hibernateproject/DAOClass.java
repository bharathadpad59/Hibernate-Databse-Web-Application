package com.bharat.hibernateproject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.TypedQuery;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

public class DAOClass {

	public String s1=" ";
	public String s2=" ";
	public String s3=" ";
	public String s4=" ";



	public void databasestoring(String name,int id,String favsubject,String nativeplace,String skills,int year_of_passout, int mathsMarks,int scienceMarks, int englishMarks, int historyMarks, int geographyMarks, int kannadaMarks,double Percentage) 
	{


		UserClass user =new UserClass();
		user.setId(id);
		user.setFavsubject(favsubject);
		user.setName(name);
		user.setNativeplace(nativeplace);
		user.setSkills(skills);
		user.setYear_of_passout(year_of_passout);
		user.setMathsMarks(mathsMarks);
		user.setScienceMarks(scienceMarks);
		user.setEnglishMarks(englishMarks);
		user.setHistoryMarks(historyMarks);
		user.setGeographyMarks(geographyMarks);
		user.setKannadaMarks(kannadaMarks);
		user.setPercentage(Percentage);



		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 
		// ServiceRegistry res = new ServiceRegistryBuilder().applySettings(cnf.getProperties()).buildServiceRegistry();

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		session.save(user);

		tx.commit();


	}


	public String databaseretrieve(String name1)
	{
		System.out.println(name1);
		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		Query q1=session.createQuery("from UserClass where name= :name1");
		q1.setParameter("name1",name1);
		List<UserClass> userclass= q1.list();

		System.out.println(userclass);

		for(int i=0;i<userclass.size();i++)
		{
			s1+=userclass.get(i);

			System.out.println("\n");
		}
		System.out.println(s1);
		//		  for(UserClass u:userclass)
		//		  {
		//			 System.out.println(u); 
		//		  }
		tx.commit();
		return s1;

	}


	public void databaseretrieveall()
	{

		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		Query q1=session.createQuery("from UserClass");		  

		List<UserClass> userclass= q1.list();
		for(int i=0;i<userclass.size();i++)
		{
			System.out.println(userclass.get(i));
			s2+=userclass.get(i);
			System.out.println("\n");
		}

		tx.commit();


	}
	public void databaseretrieveallidname()
	{

		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		//Retrieve and displaying a multiple properties of class or column of a table

		Query query1 = session.createQuery("select id,name from UserClass");
		List<Object[]> collection1 = query1.list(); //collection of object arrays

		//Accessing each object array to retrieve individual id and first name
		System.out.println("Retrieving values in multiple columns ");


		for(Object[] user: collection1)
		{
			s3+=(Integer)user[0]+" " + (String)user[1];
			System.out.println("Id : " + (Integer)user[0]+"Name : " + (String)user[1]);

			System.out.println();
		}

		tx.commit();
	}

	public String databaseretrievebyper(String name2)
	{

		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		Query query1 = session.createQuery("select Percentage from UserClass where name= :name2");
		query1.setParameter("name2",name2);
		s4+=query1.uniqueResult().toString();
		System.out.println(query1.uniqueResult().toString());
		System.out.println("s4 result is " +s4);

		System.out.println("query returning"+ query1);
		tx.commit();

		return s4;
	}

	public void databaseupdate(String name1,String skills1,int id1,int Yearofpassout,
			String Nativeplace,String Favsubject,int MathsMarks,int ScienceMarks,int EnglishMarks,int HistoryMarks,int GeographyMarks,int KannadaMarks)
	{
		System.out.println(name1);
		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		String qryString = "update UserClass s set s.name= :name1,s.skills= :skills1,s.year_of_passout= :Yearofpassout,s.nativeplace= :Nativeplace,s.favsubject= :Favsubject,s.MathsMarks= :MathsMarks,s.ScienceMarks= :ScienceMarks,s.EnglishMarks= :EnglishMarks,s.HistoryMarks= :HistoryMarks,s.GeographyMarks= :GeographyMarks,s.KannadaMarks= :KannadaMarks where s.id= :id1";
		Query query = session.createQuery(qryString);
		query.setParameter("name1",name1);
		query.setParameter("skills1",skills1);
		query.setParameter("id1",id1);
		query.setParameter("Yearofpassout",Yearofpassout);
		query.setParameter("skills1",skills1);
		query.setParameter("Nativeplace",Nativeplace);
		query.setParameter("Favsubject",Favsubject);
		query.setParameter("MathsMarks",MathsMarks);
		query.setParameter("ScienceMarks",ScienceMarks);
		query.setParameter("EnglishMarks",EnglishMarks);
		query.setParameter("HistoryMarks",HistoryMarks);
		query.setParameter("GeographyMarks",GeographyMarks);
		query.setParameter("KannadaMarks",KannadaMarks);

		int count = query.executeUpdate();

		System.out.println(count + " Record(s) Updated.");

		System.out.println("Updating with Query Parameters ");

		tx.commit();
	}
	public void databasedelete(int id2)
	{
		UserClass u1=new UserClass();

		Configuration cnf= new Configuration().configure().addAnnotatedClass(UserClass.class); 

		SessionFactory sf=cnf.buildSessionFactory(); 
		Session session=sf.openSession(); 				  
		Transaction tx=session.beginTransaction(); 

		String qryString = "delete from UserClass s  where s.id=:id2";
		Query query = session.createQuery(qryString);
		query.setParameter("id2",id2);
		int count = query.executeUpdate();

		System.out.println(count + " Record(s) Deleted.");

		System.out.println("Deleting with Query Parameters ");

		tx.commit();
	}

}
