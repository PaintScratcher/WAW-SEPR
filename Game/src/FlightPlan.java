import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FlightPlan {
	
	//FIELDS
	private ArrayList<Point> route = new ArrayList<Point>(); 
	private int velocity;
	
	// CONSTRUCTOR
	
	public FlightPlan(Airspace airspace) {
		this.velocity = generate_velocity();
		this.route = build_route(airspace);
	}
	
	// METHODS
	public ArrayList<Point> build_route(Airspace airspace) {
		Random rand = new Random();
		ArrayList<Point> temp_route = new ArrayList<Point>();
		int pointsInPlan=rand.nextInt(4)+4; 
		//the number of waypoints in the flight plan including exit points
		
		for(int i=0;i<pointsInPlan-1;i++) {
			int waypoint_index = rand.nextInt(10);
			
			while(temp_route.contains(airspace.getList_of_way_points().get(waypoint_index))) {
				// this waypoint is already in the list, don't add it
				waypoint_index = rand.nextInt(10);
			}
			temp_route.add(airspace.getList_of_way_points().get(waypoint_index)); 
			//if it isn't, add it
		}
		
		int ExitPoint=rand.nextInt(3);
		temp_route.add(airspace.getList_of_exit_points().get(ExitPoint));
		return temp_route;
		
	}
	
	public int generate_velocity() {
		Random rand = new Random();
		return (rand.nextInt(50)+50);	
	}
	
	//ACCESSORS AND MUTATORS
	
	public int getVelocity() {
		return this.velocity;
	}
	
	public ArrayList<Point> getWaypoints() {
		return route;
	}
	
	
}