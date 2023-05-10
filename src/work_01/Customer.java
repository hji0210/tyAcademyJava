package work_01;

public class Customer {
         String id;
         int pw;
         String name;
         int tel;
         String addr;


Customer(String id,int pw,String name,int tel,String addr){
	this.id=id;
	this.pw=pw;
	this.name=name;
	this.tel=tel;
	this.addr=addr;
 }


Customer(String id,int pw,String name){
	this.id=id;
	this.pw=pw;
	this.name=name;

 }
Customer(){
	

}
}

