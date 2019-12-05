package com.bharat.hibernateproject;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class ControllerClass {
	double result=0.0;
	double result1=0.0;
	
	@RequestMapping("Authentication")
	public ModelAndView checkperson(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav=new ModelAndView();
		String a=request.getParameter("username");
		String b=request.getParameter("password");
		System.out.println(a+","+b);
		
		 String c="Login Succes"; 
		 String d="Login Fails";
		 
		
		ServiceClass s1=new ServiceClass();
		String x=s1.conditionscheck(a, b);
		
		if(x.equals(c))
		{
			mav.addObject("LoginStatus",x);
			mav.setViewName("index1.jsp");
			return mav; 
		}	
		else if(x.equals(d))
		{
			mav.addObject("LoginStatus",x);
			mav.setViewName("index.jsp");
			return mav;
		}
		else
		{
			return null;
		}
	
		
	}
	
		@RequestMapping("/Datahandling")
	
		public ModelAndView datahandling(HttpServletRequest request, HttpServletResponse response)
		{
			ModelAndView mav=new ModelAndView();
			ServiceClass s1= new ServiceClass();
			String option=request.getParameter("DATA");
		
			if(s1.optionselection(option).equals("insert"))
			{
				mav.setViewName("index2.jsp");
				return mav;	
			}
			
			else if(s1.optionselection(option).equals("retrieve"))
			{
				mav.setViewName("index3.jsp");
				return mav;
			}
			else if(s1.optionselection(option).equals("update"))
			{
				mav.setViewName("update.jsp");
				return mav;
			}
			else {
				mav.setViewName("delete.jsp");
				return mav;
			}
			
	}
		
		@RequestMapping("/Detailsofinsertion")
		
		public ModelAndView datainsertion(HttpServletRequest request, HttpServletResponse response) 
		{
			ModelAndView mav=new  ModelAndView();
			
			String Name=request.getParameter("NAME");
			int Id=Integer.parseInt(request.getParameter("ID"));
			String Skills=request.getParameter("SKILLS");
			int Yearofpassout=Integer.parseInt(request.getParameter("YEAR_OF_PASSOUT"));
			String Nativeplace=request.getParameter("NATIVE_PLACE");
			String Favsubject=request.getParameter("FAVSUBJECT");
			int MathsMarks=Integer.parseInt(request.getParameter("MathsMarks"));
			int ScienceMarks=Integer.parseInt(request.getParameter("ScienceMarks"));
			int EnglishMarks=Integer.parseInt(request.getParameter("EnglishMarks"));
			int HistoryMarks=Integer.parseInt(request.getParameter("HistoryMarks"));
			int GeographyMarks=Integer.parseInt(request.getParameter("GeographyMarks"));
			int KannadaMarks=Integer.parseInt(request.getParameter("KannadaMarks"));
			
			ServiceClass s1=new ServiceClass();
			result=s1.percentagecalculation(MathsMarks, ScienceMarks, EnglishMarks, HistoryMarks, GeographyMarks,KannadaMarks);
			
			s1.daoclassaccessinsert(Name, Id, Favsubject, Nativeplace, Skills, Yearofpassout,MathsMarks,ScienceMarks,EnglishMarks,HistoryMarks,GeographyMarks,KannadaMarks,result);
			
			mav.addObject("Result","Data Inserted Successfully");
			mav.setViewName("index2.jsp");
			
			mav.addObject("Percentage",result);
			mav.setViewName("index2.jsp");
			
			return mav;
				
		}
		
		
		@RequestMapping("/DetailsofRetrievalonlybyname")
		public ModelAndView dataretrieval(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
		{
			ModelAndView mav=new  ModelAndView();
			
			String name1=request.getParameter("NAME");
			
			
			System.out.println(name1);
			
			
	
			ServiceClass s1=new ServiceClass();
			String finaldata=s1.daoclassaccessretrieve(name1);
			String finalper=s1.daoclassaccessretrievebyper(name1);
			
			mav.addObject("Resultofretrieve",finaldata);
			mav.addObject("Percentage",finalper);	
			
			mav.setViewName("index3.jsp");
			
			return mav;
				
		}
		
		@RequestMapping("/Detailsofretrivealall")
		public ModelAndView dataretrievalall(HttpServletRequest request, HttpServletResponse response) 
		{
			ModelAndView mav=new  ModelAndView();
			
			String option=request.getParameter("DATARETRIEVAL");
			
			System.out.println(option);
			
			ControllerClass c1=new ControllerClass();
	
			ServiceClass s1=new ServiceClass();
			s1.daoclassaccessretrieveall(option);
			String finaldata=s1.retrievedata;
			
			mav.addObject("Resultofretrieve",finaldata);
			mav.setViewName("index3.jsp");
		
			return mav;
				
		}
		
		@RequestMapping("/update")
		
		public ModelAndView dataupdate(HttpServletRequest request, HttpServletResponse response) 
		{
			ModelAndView mav=new  ModelAndView();
			
			String Name1=request.getParameter("NAME");
			int Id1=Integer.parseInt(request.getParameter("ID"));
			String Skills1=request.getParameter("SKILLS");
			int Yearofpassout=Integer.parseInt(request.getParameter("YEAR_OF_PASSOUT"));
			String Nativeplace=request.getParameter("NATIVE_PLACE");
			String Favsubject=request.getParameter("FAVSUBJECT");
			int MathsMarks=Integer.parseInt(request.getParameter("MathsMarks"));
			int ScienceMarks=Integer.parseInt(request.getParameter("ScienceMarks"));
			int EnglishMarks=Integer.parseInt(request.getParameter("EnglishMarks"));
			int HistoryMarks=Integer.parseInt(request.getParameter("HistoryMarks"));
			int GeographyMarks=Integer.parseInt(request.getParameter("GeographyMarks"));
			int KannadaMarks=Integer.parseInt(request.getParameter("KannadaMarks"));
			
			ServiceClass s1=new ServiceClass();
			
			s1.daoclassaccessupdate(Name1, Skills1, Id1,Yearofpassout,Nativeplace,Favsubject,MathsMarks,ScienceMarks,EnglishMarks,HistoryMarks,GeographyMarks,KannadaMarks);
			result1=s1.percentagecalculation(MathsMarks, ScienceMarks, EnglishMarks, HistoryMarks, GeographyMarks,KannadaMarks);
			s1.daoclassaccessinsert(Name1, Id1, Favsubject, Nativeplace, Skills1, Yearofpassout,MathsMarks,ScienceMarks,EnglishMarks,HistoryMarks,GeographyMarks,KannadaMarks,result1);
			
			mav.addObject("Result","DATA UPDATED SUCCESSFULLY");
			mav.addObject("Percentage",result1);
			mav.setViewName("update.jsp");
			
			
			return mav;
		}
		
		@RequestMapping("/delete")
		
		public ModelAndView datadelete(HttpServletRequest request, HttpServletResponse response) 
		{
			ModelAndView mav=new  ModelAndView();
		
			int Id2=Integer.parseInt(request.getParameter("ID"));
			
			ServiceClass s1=new ServiceClass();
			s1.daoclassaccessdelete(Id2);
			mav.addObject("Result","DATA DELETED SUCCESSFULLY");
			mav.setViewName("delete.jsp");
			return mav;
		}
		
	@RequestMapping("USERCLASS")
	public ModelAndView table(HttpServletRequest request, HttpServletResponse response)
	{
		ModelAndView mav=new  ModelAndView();

		mav.setViewName("tableoutput.jsp");
		return mav;
	}
	
}
