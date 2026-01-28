public class SpaceProbe{

	private String name;
	private String mission;
	private double distanceFromEarth;
	private boolean isActive;

	//Default Constructor
	public SpaceProbe(){
		this.name = null;
		this.mission = null;
		this.distanceFromEarth = 0.0;
		this.isActive = false;
	}

	//Overloaded Constructor
	public SpaceProbe(String name,String mission,double distanceFromEarth,boolean isActive){
		this.name = name;
		this.mission = mission;
		this.distanceFromEarth = distanceFromEarth;
		this.isActive = isActive;
	}

	//Setters
	public void setName(String name){
		this.name = name;
	}

	public void setMission(String mission){
		this.mission = mission;
	}

	public void setDistanceFromEarth(double distanceFromEarth){
		this.distanceFromEarth = distanceFromEarth;
	}

	public void setIsActive(boolean isActive){
		this.isActive = isActive;
	}

	//Getters
	public String getName(){
		return this.name;
	}

	public String getMission(){
		return this.mission;
	}

	public double getDistanceFromEarth(){
		return this.distanceFromEarth;
	}

	public boolean getIsActive(){
		return this.isActive;
	}
}