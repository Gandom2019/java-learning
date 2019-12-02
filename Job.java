package cla;

 public class Job {
	String nameOfJob;
	String address;
	String phoneNumber;
	double farAway;
	public void setName(String a) {
		nameOfJob=a;
	}
	public void getName() {
		System.out.println(nameOfJob);
	}
	public void setAdd(String a) {
		address=a;
	}
	public void getAdd() {
		System.out.println(address);
	}
	public void setPhone(String a) {
		phoneNumber=a;
	}
	public void getPhone() {
		System.out.println("phoneNumber");
	}
	public void setDistance(double a) {
		farAway=a;
	}	
	public void getDistance() {
		System.out.println(farAway);
	}

	public Job(){
		this.nameOfJob=null;
		this.address=null;
		this.phoneNumber=null;
		this.farAway=0;
	
	}
	public Job(String a){
		this.nameOfJob=a;
		this.address=null;
		this.phoneNumber=null;
		this.farAway=0;
		
	}
}
