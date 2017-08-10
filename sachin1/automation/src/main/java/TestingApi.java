
import org.testng.annotations.Test;
import static com.jayway.restassured.RestAssured.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
/**
 * Purpose:Testing
 * 
 * Create Date : 21/6/2017
 * 
 * @author Sumukh
 *
 */
public class TestingApi {
	Response resp=null;
static String url="http://localhost:9001/dhc/services/rest/api/v1/";
		@Test
	public void state(){

		//returns status code 200
		System.out.println("GETstateList");
		given().
		get((url+"state")).then().statusCode(200).log().all();
		System.out.println("url");
		
}
	@Test
	public void countrybyid(){
		//returns status code 200
		System.out.println("GEtcountrylistbyid");
		given().
		get((url+"country/1")).then().statusCode(200).log().all();
		System.out.println("url");
}	
	@Test
	public void country(){
	//returns status code 200
	System.out.println("GETcountrylist");
	given().
	get((url+"country")).then().statusCode(200).log().all();
	System.out.println("url");
}	
		@Test
	public void city(){
	//returns status code 200
	System.out.println("GETcityList");
	given().
	get((url+"city")).then().statusCode(200).log().all();
	System.out.println("url");
}	
		@Test
	public void district(){
	//returns status code 200
	System.out.println("GETdistrictList");
	given().
	get((url+"district")).then().statusCode(200).log().all();
	System.out.println("url");
}	
		@Test
	public void lablist(){

	//returns status code 200
	System.out.println("GETlabList");
	given().
	get((url+"lablist")).then().statusCode(200).log().all();
	System.out.println("url");
}
  @Test
   public void lablistbyid(){
   //returns status code 200
   System.out.println("GETlablistbyid");
   given().
   get((url+"lab/2")).then().statusCode(200).log().all();
   System.out.println("url");
}
  @Test
   public void hospitallist(){ 
   //returns status code 200
   System.out.println("GEThospitallist");
   given().
   get((url+"hospitallist")).then().statusCode(200).log().all();
   System.out.println("url");
}
   @Test
   public void hospitabyid(){
   //returns status code 200
   System.out.println("GEThospitabyid");
   given().
   get((url+"hospital/2")).then().statusCode(200).log().all();
   System.out.println("url");
}
  @Test
   public void cliniclist(){
   //returns status code 200 
   System.out.println("GETclinicList");
   given().   
   get((url+"cliniclist")).then().statusCode(200).log().all();
   System.out.println("url"); 
}
  @Test
   public void cliniclistbyid(){
   //returns status code 200
   System.out.println("GETclinicListbyid");
   given().
   get((url+"clinic/3")).then().statusCode(200).log().all();
   System.out.println("url");
}
 @Test
   public void specialitylist(){
   //returns status code 200
   System.out.println("GETspecialitylist");
   given().
   get((url+"specialitylist")).then().statusCode(200).log().all();
   System.out.println("url");
}
 @Test
 public void specialitylistbyid(){
 //returns status code 200
 System.out.println("GETspecialitylistbyid");
 given().
 get((url+"speciality/1")).then().statusCode(200).log().all();
 System.out.println("url");
}
  @Test
  public void lablistbyname(){
  //returns status code 200
  System.out.println("GETlablistbyname");
  given().
  get((url+"lablist/appolo")).then().statusCode(200).log().all();
  System.out.println("url");
}
@Test
public void hospitallistbyname(){
//returns status code 200
System.out.println("GEThospitallistbyname");
given().
get((url+"hospitallist/appolo")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void cliniclistbyname(){
//returns status code 200
System.out.println("GETcliniclistbyname");
given().
get((url+"cliniclist/agastya")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void patientlistbyname(){
//returns status code 200
System.out.println("GETpatientlistbyname");
given().
get((url+"patientlist/fn")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void doctorbyname(){
//returns status code 200
System.out.println("GETdoctorbyname");
given().
get((url+"doctor/pratham")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void doctorlist(){
//returns status code 200
System.out.println("GETdoctorlist");
given().
get((url+"doctorlist")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void appointmentlistbystatus(){
//returns status code 200
System.out.println(" appointmentlistbystatus}");
given().
get((url+"appointmentlist/1")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void scheduleList(){
//returns status code 200
System.out.println("GETscheduleList");
given().
get((url+"scheduleList")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void docProfileDetailsbyid(){
//returns status code 200
System.out.println("GETdocProfileDetailsbyid");
given().
get((url+"docProfileDetails/31")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void drugList(){
//returns status code 200
System.out.println("GETdrugList");
given().
get((url+"drugList")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void prescriptionList(){
	//returns status code 200
	System.out.println("GETprescriptionList");
	given().
	get((url+"prescriptionList")).then().statusCode(200).log().all();
	System.out.println("url");
}
	@Test
public void intakeList(){
//returns status code 200
System.out.println("GETintakeList");
given().
get((url+"intakeList")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void prescriptionHistorybyid(){
//returns status code 200
System.out.println("GETprescriptionHistorybyid");
given().
get((url+"prescriptionHistory/11")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void AppConfigbyid(){
//returns status code 200
System.out.println("GETAppConfigbyid");
given().
get((url+"AppConfig/12")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void SceduleConfigbyid(){
//returns status code 200
System.out.println("GETSceduleConfigbyid");
given().
get((url+"SceduleConfig/13")).then().statusCode(200).log().all();
System.out.println("url");
}
@Test
public void patientlistsbyid(){
//returns status code 200
System.out.println("GETpatientlistsbyid");
given().
get((url+"patientlists/6")).then().statusCode(200).log().all();
System.out.println("url");
}



/*-------------------------------POST----------------------------------------------------*/
	
@Test
public void patientRegistration(){
//returns status code 200
System.out.println("patientRegistration");
given().
body("{"
   +"\"first_name\":\"sowmya\","
	+"\"first_name\":\"sowmya\","
	+"\"middle_name\":\"middle\","
	+"\"last_name\":\"last\","
	+"\"gender\":\"female\","
	 +"\"email_id\":\"ramyagc1591@gmail.com\","
	 +"\"contact\":\"655321\","
	 +"\"status\":\"true\","
	 +"\"username\":\"soujurty\","
	 +"\"password\":\"54645\","
	 +"\"dob\":\"1994-02-23\","
	 +"\"lane\":\"2\","
	 +"\"area\":\"aasas\","
	 +"\"stage_block\":\"5th\","
	 +"\"land_mark\":\"palya\","
	 +"\"door_no\":\"2\","
	 +"\"street_name\":\"kavimarga\","
	 +"\"pincode\":\"562117\","
	 +"\"profile_type_id\":\"1\","
	 +"\"city_id\":\"2\""
	+"}").
when().
contentType(ContentType.JSON).
post(url+"patientRegistration").then().statusCode(200).log().all();;
} 


@Test
public void hospitalRegistration(){
	//returns status code 200
	System.out.println("hospitalRegistration");
	given().
	body("{"
			+ "\"first_name\":\"appolo\","
			+ "\"hospital_description\":\"cloud9\","
			+ "\"email_id\":\"ramyagc19@gmail.com\","
			+ "\"contact\":\"655389\","
			+ "\"username\":\"soujurty\","
			+ "\"password\":\"54645\","
			+ "\"lane\":\"2\","
			+ "\"area\":\"rajajinagar\","
			+ "\"stage_block\":\"5th\","
			+ "\"land_mark\":\"bashyam\","
			+ "\"door_no\":\"2\","
			+ "\"street_name\":\"rajkumar road\","
			+ "\"pincode\":\"562117\","
			+ "\"area\":\"rajajinagar\","
			+ " \"city_id\":\"1\""
			+ "}").
	

	when().
	contentType(ContentType.JSON).
	post(url+"hospitalRegistration").then().statusCode(200).log().all();;
}
	

@Test
public void clinicRegistration(){
	//returns status code 200
	System.out.println("clinicRegistration");
	given().
	body("{"
			+ "\"type_id\":\"1\","
			+ "\"cname\":\"latha\","
			+ "\"description\":\"good\","
			+ "\"email_id\":\"ramyagc@gmail.com\","
			+ "\"contact\":\"659821\","
			+ "\"username\":\"hjkrty\","
			+ "\"password\":\"54645\","
			+ "\"lane\":\"2\","
			+ "\"area\":\"rajajinagar\","
			+ "\"stage_block\":\"5th\","
			+ "\"land_mark\":\"bashyam\","
			+ "\"door_no\":\"2\","
			+ "\"street_name\":\"rajkumar road\","
			+ "\"pincode\":\"562117\","
			+ "\"profile_type_id\":\"5\","
			+ " \"city_id\":\"1\""
			+ "}").
	
		when().
	contentType(ContentType.JSON).
	post(url+"clinicRegistration").then().statusCode(200).log().all();;
}

@Test
public void labRegistration(){
	//returns status code 200
	System.out.println("labRegistration");
	given().
	body("{"
			+ "\"lname\":\"latha\","
			+ "\"lab_description\":\"good\","
		
			+ "\"email_id\":\"ramyafc@gmail.com\","
			+ "\"contact\":\"657821\","
			+ "\"username\":\"hjkrty\","
			+ "\"password\":\"54645\","
			+ "\"licence_num\":\"555\","
			+ "\"lane\":\"2\","
			+ "\"area\":\"rajajinagar\","
			+ "\"stage_block\":\"5th\","
			+ "\"land_mark\":\"bashyam\","
			+ "\"door_no\":\"2\","
			+ "\"street_name\":\"rajkumar road\","
			+ "\"pincode\":\"562117\","
			+ "\"profile_type_id\":\"5\","
			+ " \"city_id\":\"1\""
			+ "}").
	
	
		when().
	contentType(ContentType.JSON).
	post(url+"labRegistration").then().statusCode(200).log().all();;
}

@Test
public void prescription(){
	//returns status code 200
	System.out.println("prescription");
	given().
	body("{"
			+ "\"patient_id\":\"2\","
			+ "\"doctor_id\":\"12\","
		
			+ "\"start_date\":\"2017-04-15\","
			+ "\"date_modified\":\"2017-04-15\","
			+ "\"medicine_name\":\"bhd\","
			+ "\"symptom\":\"fever\","
			+ "\"dossage\":\"200mg\","
			+ "\"drug_id\":\"1\","
			+ "\"intake_pattern_id\":\"1\","
			+ "\"status\":\"true\","
			+ "\"created_date\":\"2017-05-22\","
			
		
			+ " \"modified_date\":\"2017-05-22\""
			+ "}").
	
		when().
	contentType(ContentType.JSON).
	post(url+"prescription").then().statusCode(200).log().all();;
}

@Test
public void CancelAppointmentbyid(){
	//returns status code 200
	System.out.println("CancelAppointmentbyid");
	given().	
	body("{"
			+ "\"id\":\"21\","
			+"\"appointment_status_id\":\"1\","
			
			+ " \"new_appointment_status_id\":\"1\""
			+ "}").
	
		when().
	contentType(ContentType.JSON).
	post(url+"CancelAppointment").then().statusCode(200).log().all();;
}
@Test
public void BookAppointment(){
	//returns status code 200
	System.out.println("BookAppointment");
	given().
	body("{"
			+ "\"book_date_time\":\"2017-05-22 12pm\","
			+"\"purpose\":\"dont know\","
			+"\"appointment_status_id\":\"1\","
			+"\"doctor_id\":\"12\","
			+ " \"patient_id\":\"2\""
			+ "}").

	when().
	contentType(ContentType.JSON).
	post(url+"BookAppointment").then().statusCode(200).log().all();;
}

@Test
public void AppointmentConfig(){
	//returns status code 200
	System.out.println("AppointmentConfig");
	given().	
	body("{"
			+ "\"end_date\":\"2017-05-24\","
			+"\"start_date\":\"2017-05-24\","
			+"\"doctor_id\":\"12\","
			+"\"appointment_exception_id\":\"1\","
			+"\"availability\":\"0\","
			+"\"schedule_config_id\":\"5\","
			+"\"hospital_id\":\"2\","
			+"\"status\":\"true\","
			
			+ " \"modified_date\":\"2017-05-24\""
			+ "}").
	
		when().
	contentType(ContentType.JSON).
	post(url+"AppointmentConfig").then().statusCode(200).log().all();;
}
@Test
public void ScheduleConfig(){
	//returns status code 200
	System.out.println("ScheduleConfig");
	given().	
	body("{"
			+ "\"end_time\":\"5:30:00\","
			+"\"start_time\":\"10:30:00\","
			+"\"doctor_id\":\"12\","
			+"\"status\":\"true\","
		
			
			+ " \"modified_date\":\"2017-05-24\""
			+ "}").
	
		when().
	contentType(ContentType.JSON).
	post(url+"ScheduleConfig").then().statusCode(200).log().all();;
}


	

@Test
public void PasswordReset(){
	//returns status code 200
	System.out.println("PasswordReset");
	given().
	body("{" 			+"\"email_id\":\"aaawe@gmail.com\""
		
			
			+ "}").
	when().
	contentType(ContentType.JSON).
	post(url+"PasswordReset").then().statusCode(200).log().all();;
}

@Test
public void DocRegistration(){
//returns status code 200
System.out.println("DocRegistration");
given().
body("{"
		+ "\"username\":\"pavithra\","
		+ "\"first_name\":\"shivudu\","
	
		+ "\"middle_name\":\"middle\","
		+ "\"last_name\":\"last\","
		+ "\"status\":\"true\","
		+ "\"email_id\":\"ramy2a@gmail.com\","
		+ "\"gender\":\"female\","
		+ "\"password\":\"54645\","
		+ "\"dob\":\"1994-02-21\","
		+ "\"speciality_id\":\"1\","
		+ "\"hospital_id\":\"2\","
		+ "\"lane\":\"2\","
		+ "\"area\":\"aasas\","
		+ "\"stage_block\":\"5th\","
		+ "\"land_mark\":\"palya\","
		+ "\"door_no\":\"2\","
		+ "\"street_name\":\"kavimarga\","
		+ "\"pincode\":\"562117\","
		+ "\"city_id\":\"2\","
		+ "\"profile_type_id\":\"1\","
		+ "\"ima_id\":\"524p51\","
		+ "\"qualification\":\"md\","

		+ " \"contact\":\"6521621\""
		+ "}").

	when().
contentType(ContentType.JSON).
post(url+"DocRegistration").then().statusCode(200).log().all();;
}
@Test
public void ForgotPassword(){
//returns status code 200
System.out.println("ForgotPassword");
given().
body("{"
	
		+ "\"email_id\":\"msnbhargava@gmail.com\","

		+ " \"contact\":\"98724563\""
		+ "}").


	when().
contentType(ContentType.JSON).
post(url+"ForgotPassword").then().statusCode(200).log().all();;
}


	
	@Test
	public void login(){
		//returns status code 200
		System.out.println("login");
		given().
		body("{"
				+ "\"email_id\":\"viniith@gmail.com\","
				+ " \"password\":\"123457\""
				+ "}").
	
		when().
		contentType(ContentType.JSON).
		post(url+"login").then().statusCode(200).log().all();;
}


	


	
@Test
public void bookedAppList(){
	//returns status code 200
	System.out.println("bookedAppList");
	given().
	body("{"
		
			+ "\"doctor_id\":\"12\","
	
			+ " \"appointment_status_id\":\"1\""
			+ "}").
	when().
	contentType(ContentType.JSON).
	post(url+"bookedAppList").then().statusCode(200).log().all();;
}

}