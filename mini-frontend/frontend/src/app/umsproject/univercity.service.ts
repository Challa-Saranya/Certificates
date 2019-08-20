import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from '../../../node_modules/rxjs';
@Injectable({
  providedIn: 'root'
})
export class UnivercityService {

  constructor(private http: HttpClient) { }

  getCollegeDetails() {
    return this.http.get("http://localhost:9860/college/getcollegedetails");

  }
  addcollegedetails(data: any) {
    let collegedata = {
      "sno": data.sno, "collegeCode": data.collegeCode, "collegeName": data.collegeName,
      "collegeLocation": data.collegeLocation, "affliatedDate": data.affliatedDate
    }
    return this.http.post("http://localhost:9860/college/savecollege", collegedata);
  }
  searchcollege(c: any) {
    return this.http.get("http://localhost:9860/college/searchcollege?id=" + c.sno);
  }
  updatecollege(data: any) {
    let collegedata = {
      "sno": data.sno, "collegeCode": data.collegeCode, "collegeName": data.collegeName,
      "collegeLocation": data.collegeLocation, "affliatedDate": data.affliatedDate
    }
    return this.http.put("http://localhost:9860/college/updatecollege", collegedata);
  }

  deletecollege(c: any) {
    return this.http.delete("http://localhost:9860/college/deletecollege/"+c.sno);
  }

  deletecollegeBulk(c: any) {
    return this.http.delete("http://localhost:9860/college/deletecollege/"+c);
  }



  getCourseDetails() {
    return this.http.get("http://localhost:9860/courses/getcoursedetails")
  }

  addCourse(data: any) {
    console.log(data);

    let input = { "courseId": data.courseId, "courseName": data.courseName, "courseDuration": data.courseDuration, "noOfSems": data.noOfSems }
    return this.http.post("http://localhost:9860/courses/savecourses", input)
  }

  updatecourse(data: any) {
    let input = { "courseId": data.courseId, "courseName": data.courseName, "courseDuration": data.courseDuration, "noOfSems": data.noOfSems }
    return this.http.put("http://localhost:9860/courses/updatecourse",input);
  }

  searchCourse(course: any) {
    return this.http.get("http://localhost:9860/courses/searchcourse?cid=" + course.courseId);
  }
  deleteCourse(c: any) {
    return this.http.delete("http://localhost:9860/courses/deletecourse/"+ c.courseId);
  }

  deleteCourseBulk(c: any) {
    return this.http.delete("http://localhost:9860/courses/deletecourse/"+ c);
  }
  

  getCanteenDetails() {
    return this.http.get("http://localhost:9860/canteen/getcanteendetails");
  }

  addCanteendetails(data: any) {
    let CanteenData = {
      "itemName": data.itemName, "itemPrice": data.itemPrice,
      "date": data.date
    }
    return this.http.post("http://localhost:9860/canteen/savecanteen", CanteenData);
  }

  searchCanteen(c: any) {
    return this.http.get("http://localhost:9860/canteen/searchcanteen?id=" + c.id);
  }

  updateCanteen(data: any) {
    return this.http.put("http://localhost:9860/canteen/updatecanteen", data);
  }

  deleteCanteen(c: any) {
    return this.http.delete("http://localhost:9860/canteen/deletecanteenItem/"+c.id);
  }

  deleteCanteenBulk(c: any) {
    return this.http.delete("http://localhost:9860/canteen/deletecanteenItem/"+c);
  }


  getPlacementDetails() {
    return this.http.get("http://localhost:9860/placements/getplacementdetails");
  }

  addPlacementDetails(data: any) {
    let input = { "companyId": data.companyId, "companyName": data.companyName, "visitedOnDate": data.visitedOnDate, "noOfPlacements": data.noOfPlacements }
    return this.http.post("http://localhost:9860/placements/saveplacement", input);
  }

  searchPlacement(c: any) {
    return this.http.get("http://localhost:9860/placements/searchplacement?id=" + c.companyId);
  }

  updatePlacement(data: any) {
    return this.http.put("http://localhost:9860/placements/updateplacement", data);
  }

  deletePlacement(c: any) {
    return this.http.delete("http://localhost:9860/placements/deleteplacement/" + c.companyId);
  }

  
  deletePlacementBulk(c: any) {
    return this.http.delete("http://localhost:9860/placements/deleteplacement/" + c);
  }



  saveProfile(file: File):Observable<any>{
    const formdata=new FormData();
    formdata.append('file',file);
    return this.http.post("http://localhost:9860/fileupload/saveCollegeExcel?file=",formdata, {
      reportProgress: true,
      responseType: 'text'
    });
    

  }

showtables(){
  return this.http.get("http://localhost:9860/show/selectedtable")
}
showfields(){
  return this.http.get("http://localhost:9860/show/showfields")
}
show(name){
  return this.http.get("http://localhost:9860/show//showcollege?tablename="+name);
}
validateLogin(email,password){
    
  //let input1={"email":data.email};
  //let input2={"password":data.password};

return this.http.get("http://localhost:9860/register/validateUser/",{params:{email:email,password:password}});
}

addUser(data:any){
  console.log(data);

  let input={
    "firstname":data.firstname,
    "lastname":data.lastname,
    "gender":data.gender,
    "phnum":data.phnum,
    "email":data.email,
    "password":data.password,
    "confirmPassword":data.confirmPassword,
    "securityQuestion":data.securityQuestion,
    "answer":data.answer
  }
  console.log(input);
  return this.http.post("http://localhost:9860/register/addall",input);
}
deleteCollegeTable(){
  return this.http.delete("http://localhost:9860/college/deletecollegetable")
}
deleteCanteenTable(){
  return this.http.delete("http://localhost:9860/canteen/deletecanteen")
}
deleteCourseTable(){
  return this.http.delete("http://localhost:9860/courses/deletecoursetable");
}
deleteCompanyData(){
  return this.http.delete("http://localhost:9860/placements/deletecompany");
}




saveCourseBulk(file: File):Observable<any>{
  const formdata=new FormData();
  formdata.append('file',file);
  return this.http.post("http://localhost:9860/fileupload/saveCourseExcel?file=",formdata, {
    reportProgress: true,
    responseType: 'text'
  });
  /* saveProfile(file: File):Observable<any>{
    const formdata=new FormData();
    formdata.append('file',file);
    return this.http.post("http://localhost:9860/fileupload/saveCollegeExcel?file=",formdata, {
      reportProgress: true,
      responseType: 'text'
    }); */
  

}
saveCanteenExcel(file: File):Observable<any>{
  const formdata=new FormData();
  formdata.append('file',file);
  return this.http.post("http://localhost:9860/fileupload/saveCanteenExcel?file=",formdata, {
    reportProgress: true,
    responseType: 'text'
  });
}
}
