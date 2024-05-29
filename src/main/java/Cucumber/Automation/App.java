package Cucumber.Automation;


public class App implements Vehical
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        System.out.println( "Adding another test" );
        
        System.out.println("Adding second test in git");
        
        App a=new App();
        a.Speed();
        a.Engine();
        
        
    }
    
    public App() {
    	System.out.println("constructor made in class");
    }

	public void Speed () {
		// TODO Auto-generated method stub
		System.out.println("Speed should not exceed 100 kmph");
		
	}

	public void Color() {
		// TODO Auto-generated method stub
		System.out.println("Color can be anything");
		
	}

	public void Engine() {
		// TODO Auto-generated method stub
		
		System.out.println("Vehical engine should not more than 1000cc");
		
	}
    
    
    
}