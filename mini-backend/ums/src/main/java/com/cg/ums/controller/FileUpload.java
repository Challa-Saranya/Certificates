package com.cg.ums.controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cg.ums.bean.Canteen;
import com.cg.ums.bean.College;
import com.cg.ums.bean.Courses;
import com.cg.ums.service.CanteenService;
import com.cg.ums.service.CollegeService;
import com.cg.ums.service.CourseInterface;

@RestController
@RequestMapping("/fileupload")
@CrossOrigin(origins="http://localhost:4200")
public class FileUpload {
    @Autowired
	CollegeService cservice;
    @Autowired
    CourseInterface courseInterface;
    @Autowired
    CanteenService canservice;
	
	@SuppressWarnings("deprecation")
	@PostMapping("/saveCollegeExcel")
	public ResponseEntity<String> saveProfile(@RequestParam("file") MultipartFile file1) throws IOException{
		
		String line,name="C:\\Users\\vyechuri\\Desktop\\"+file1.getOriginalFilename();
		FileReader fr=new FileReader(name);
		 BufferedReader br=new BufferedReader(fr);
		 College college=new College();
			while((line=br.readLine())!=null) { 
				College coll=new College();
				String []data=line.split(",");
				
				coll.setCollegeCode(data[0]);
				coll.setCollegeName(data[1]);
				coll.setCollegeLocation(data[2]);
				coll.setAffliatedDate(new Date(data[3]));
				college=cservice.saveCollegeData(coll);
			}
			if(college!=null)
				return new ResponseEntity<String>("User saved",HttpStatus.OK);
			return new ResponseEntity<String>("not saved",HttpStatus.NOT_FOUND);
			
	}	
	@PostMapping("/saveCourseExcel")
public ResponseEntity<String> saveCourses(@RequestParam("file") MultipartFile file1) throws IOException{
		
		String line,name="C:\\Users\\vyechuri\\Desktop\\"+file1.getOriginalFilename();
		FileReader fr=new FileReader(name);
		 BufferedReader br=new BufferedReader(fr);
		Courses courses=new Courses();
			while((line=br.readLine())!=null) { 
				Courses course=new Courses();
				String []data=line.split(",");
				
				course.setCourseId(Integer.parseInt(data[0]));
				course.setCourseName(data[1]);
				course.setCourseDuration(Integer.parseInt(data[2]));
				course.setNoOfSems(Integer.parseInt( data[3]));
				courses=courseInterface.saveCoursesData(course);
			}
			if(courses!=null)
				return new ResponseEntity<String>("User saved",HttpStatus.OK);
			return new ResponseEntity<String>("not saved",HttpStatus.NOT_FOUND);
			
	}	
	
	
}

