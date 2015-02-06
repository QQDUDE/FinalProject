 import java.util.ArrayList;

 
 
 	public class Cars
 		{
 			String carName;
		
	public Cars(String CN)
		{
			carName = CN;
		}
	public static void Cars()
		{
			ArrayList <Cars> CarName = new ArrayList <Cars>();
			CarName.add(new Cars("Subaru Impreza"));
			CarName.add(new Cars("Ford Mustang"));
			CarName.add(new Cars("Mazda Miata"));
			CarName.add(new Cars("Nissan 300ZX"));
			CarName.add(new Cars("Lexus LFA"));
			CarName.add(new Cars("Audi R8"));
			CarName.add(new Cars("Dodge Viper"));
			CarName.add(new Cars("Koenigsegg Agera R"));
			CarName.add(new Cars("Bugatti Super Sport"));
			CarName.add(new Cars("Nissan GT-R"));
			CarName.add(new Cars("Marussia B2"));
			CarName.add(new Cars("Koenigsegg One:1"));
			CarName.add(new Cars("Hennessey Venom GT"));
			
		}
	public String getCarName()
		{
			return carName;
		}
	public void setCarName(String carName)
		{
			this.carName = carName;
		}
	
		
 		}
