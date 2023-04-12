public class OfferedCourse extends Course {
    // TODO: Declare private fields - instructorName, term, classTime
       private String instructorName;
       private String term;
       private String classTime;
 //setters
       public void setInstructorName(String instructorName){
          this.instructorName = instructorName;
       }
       
       public void setTerm(String term){
          this.term = term;
       }
       
       public void setClassTime(String classTime){
          this.classTime = classTime;
       }
 //getters
       public String getInstructorName(){
          return instructorName;
 }
 
       public String getTerm(){
          return term;
       }
       
       public String getClassTime(){
          return classTime;
       }
       
 }