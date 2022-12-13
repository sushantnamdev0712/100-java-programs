import java.util.*;
class Student
{
	private String Sid;
	private String Sname;
	private int NoofDaysOfFood;
	public Student(String sid, String sname, int noofDaysOfFood) {
		
		Sid = sid;
		Sname = sname;
		NoofDaysOfFood = noofDaysOfFood;
	}
	public String getSid() {
		return Sid;
	}
	public void setSid(String sid) {
		Sid = sid;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public int getNoofDaysOfFood() {
		return NoofDaysOfFood;
	}
	public void setNoofDaysOfFood(int noofDaysOfFood) {
		NoofDaysOfFood = noofDaysOfFood;
	}
	
}
class Room{
	private int roomno;
	private boolean occupancystatus;
	private double roomrent;
	private ArrayList<Student> Slist= new ArrayList<Student>();
	public Room(int roomno,  double roomrent) {
	
		this.roomno = roomno;
		
		this.roomrent = roomrent;
		
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public boolean isOccupancystatus() {
		return occupancystatus;
	}
	public void setOccupancystatus() {
		if (isOccupancystatus()==false && getSlist().size()==3)
			this.occupancystatus = true;
	}
	public double getRoomrent() {
		return (roomrent/(getSlist().size()));
		
	}
	public void setRoomrent(double roomrent) {
		this.roomrent = roomrent;
	}
	public ArrayList<Student> getSlist() {
		return Slist;
	}
	public void setSlist(ArrayList<Student> slist) {
		Slist = slist;
	}
	public void addOccupier(Student newstudent){
		Slist.add(newstudent);
		setOccupancystatus();		
	}
	public void deleteOccupier(Student newStudent) {
		Slist.remove(newStudent);
	}
	
}
class Hostel{
	private  ArrayList<Room> roomList= new ArrayList<Room>();
	private  ArrayList<Student> StudentList= new ArrayList<Student>();
	private double foodcost;
	public Hostel( double foodcost) {
		
		
		this.foodcost = foodcost;
		
	}
	public void addRoom(int roomNo, double roomrent )
	{
		roomList.add(new Room(roomNo,roomrent));
	}
	public double getFoodcost() {
		return foodcost;
	}
	public void setFoodcost(double foodcost) {
		this.foodcost = foodcost;
	}
	public void addStudent(Student newStudent,int prefRoom)
	{
		
		if(allocateRoom(newStudent,prefRoom))
		{
			System.out.println(" Student has been successfully allocated");
			StudentList.add(newStudent);
		}
		else
			System.out.println(" Student cant be allocated");
	}
	public boolean allocateRoom(Student newStudent,int prefRoom){
		boolean flag=false;
		for (Room room:roomList)
			if(room.isOccupancystatus() && room.getRoomno()==prefRoom)
				{room.addOccupier(newStudent);flag=true;}
			else if(room.isOccupancystatus())
				{room.addOccupier(newStudent);flag=true;}
				
		return flag;	
	}
	public boolean deallocateRoom(Student newStudent){
		boolean flag=false;
		for (Room room:roomList )
			for (Student member: room.getSlist())
				if(member.getSid()==newStudent.getSid())
					{room.deleteOccupier(newStudent);flag=true;break;}
	 return flag;
	 }
	
}
public class SilverBlooms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
}
