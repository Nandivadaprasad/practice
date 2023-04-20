package pac1;

import java.util.HashMap;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class FrameworkField {

	
		private static FrameworkField instance;
		 private String CurrentResultpath;
		 private String CurrentTestCasename;
		 
		 private String CurrentModuleName;
		 private String currentfoldarpath;
		 private String currentdatafilepath;
		 private  HashMap<String,String>testdata;
		 private  ExtentReports report;
		 private Exception exceptiondescription;
		 private ExtentTest test;
		 
		 private  FrameworkField() {
		}
		 
		 
		 
		public static FrameworkField getInstance() {
			if(instance==null) {
				instance=new FrameworkField();
			}
			return instance;
		}
		
		public HashMap<String, String> getTestdata() {
			return testdata;
		}
		public void setTestdata() {
			testdata =new HashMap<String, String>();
		}
		
		
		public String getCurrentResultpath() {
			return CurrentResultpath;
		}
		public void setCurrentResultpath(String path) {
			CurrentResultpath = path;
		}
		public String getCurrentTestCasename() {
			return CurrentTestCasename;
		}
		public void setCurrentTestCasename(String currentTestCasename) {
			CurrentTestCasename = currentTestCasename;
		}
		public String getCurrentModuleName() {
			return CurrentModuleName;
		}
		public void setCurrentModuleName(String currentModuleName) {
			CurrentModuleName = currentModuleName;
		}
		public String getCurrentfoldarpath() {
			return currentfoldarpath;
		}
		public void setCurrentfoldarpath(String currentfoldarpath) {
			this.currentfoldarpath = currentfoldarpath;
		}
		public String getCurrentdatafilepath() {
			return currentdatafilepath;
		}
		public void setCurrentdatafilepath(String currentdatafilepath) {
			this.currentdatafilepath = currentdatafilepath;
		}
		public ExtentReports getReport() {
			return report;
		}
		public void setReport(ExtentReports report) {
			this.report = report;
		}
		public Exception getExceptiondescription() {
			return exceptiondescription;
		}
		public void setExceptiondescription(Exception exceptiondescription) {
			this.exceptiondescription = exceptiondescription;
		}
		public ExtentTest getTest() {
			return test;
		}
		public void setTest(ExtentTest test) {
			this.test = test;
		}
		 
		 
		 
		 
		
		
}


