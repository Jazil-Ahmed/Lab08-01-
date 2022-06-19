class Mutable {

  private String Rollnum;
  private String SubCode;
  private String SubName;

 Mutable(String Rollnum,String SubCode, String SubName){
  this.Rollnum = Rollnum;
  this.SubCode= SubCode;
  this.SubName= SubName;
}

 public String getRoll(){
   return(Rollnum);
   
 } 

 public String getCode(){
   return(SubCode);
   
 } 
  
 public String getName(){
   return(SubName);
   
 } 

  public void setRoll(String Rollnum){
    this.Rollnum= Rollnum;
  }

  public void setCode(String SubCode){
    this.SubCode= SubCode;
  }
  
  public void setName(String SubName){
    this.SubName= SubName;
  }

  
 
}

public final class Main{
  final String subName;
  final String rollNum;
  final String subCode;
  

public Main(String subName,String rollNum,String subCode){
  this.rollNum = rollNum;
  this.subCode= subCode;
  this.subName= subName;
}

public String getroll(){
  return rollNum;
}

  
public String getcode(){
  return subCode;
}
  
public String getname(){
  return subName;
}
   public static void main(String[] args) {
    Mutable ob = new Mutable("SE20-083","SWE-103","Programming");
    Main ob1= new Main("SE20-081","SWE-104","SDA");
     System.out.println();
     System.out.println("-----------------");
    System.out.println("Promoted Students");
     System.out.println("-----------------\n");
    System.out.println("Roll Number: "+""+ob.getRoll()+"\n");
    System.out.println("Subject Code: "+""+ob.getCode()+"\n");
    System.out.println("Subject: "+""+ob.getName()+"\n");


     System.out.println();
     System.out.println("---------------");
    System.out.println("Failed Students");
    System.out.println("---------------\n");
     System.out.println(""+ob1.getroll()+"\n");
    System.out.println(""+ob1.getcode()+"\n");
    System.out.println(""+ob1.getname()+"\n");
  }
}
//Main Class
