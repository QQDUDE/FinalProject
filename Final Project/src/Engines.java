import java.util.ArrayList;


public class Engines
	{
		String engineName;
		int Horsepower;
		int Price;
		
		public Engines(String EN, int HP, int P)
			{
				engineName = EN;
				Horsepower = HP;
				Price = P;
			}
		public static void Engines()
			{
				ArrayList <Engines> EngineName = new ArrayList <Engines>();
				EngineName.add(new Engines("Ej22",135,9000));
				EngineName.add(new Engines("Modular 4.6L V8",225,14000));
				EngineName.add(new Engines("1.8 L inline-4",140,10000));
				EngineName.add(new Engines("3.0 L VG30DETT V6",298,20000));
				EngineName.add(new Engines("4.8-liter V10",552,35000));
				EngineName.add(new Engines("4.2 L FSI V8",570,38000));
				EngineName.add(new Engines("8.3 L V10",640,50000));
				EngineName.add(new Engines("5.0 L V8 Twin Turbo",927,72000));
				EngineName.add(new Engines("8.0-L W16",1000,110000));
				EngineName.add(new Engines("3.8L VR38DETT twin-turbo V6",600,150000));
				EngineName.add(new Engines("MARUSSIA-COSWORTH 2.8 TURBO",420,20000));
				EngineName.add(new Engines("5,0L V8",1341,350000));
				EngineName.add(new Engines("7.0 L, LSX; Turbocharged V8",1244,500000));
			}
		public String getEngineName()
			{
				return engineName;
			}
		public void setEngineName(String engineName)
			{
				this.engineName = engineName;
			}
		public int getHorsepower()
			{
				return Horsepower;
			}
		public void setHorsepower(int horsepower)
			{
				Horsepower = horsepower;
			}
		public int getPrice()
			{
				return Price;
			}
		public void setPrice(int price)
			{
				Price = price;
			}
		
	
	
	
	
	
	}

