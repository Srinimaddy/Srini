public class MovieStaticConstructor
{
	public String name;
	public int movie_id ;
	public String duration;
	public String action_name;
	
	MovieStaticConstructor(String name,int movie_id,String duration,String action_name){
		this.name=name;
		this.movie_id=movie_id;
		this.duration=duration;
		this.action_name=action_name;
	}
	void display(){
		System.out.println(name+"   "+movie_id+"  "+duration+"   "+action_name);
	}
	public static void main(String[] args) {
		MovieStaticConstructor s1= new MovieStaticConstructor("srini",1,"1hrs","srini");
		s1.display();
		

	}
}



	
