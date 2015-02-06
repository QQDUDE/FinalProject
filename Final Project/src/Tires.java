import java.util.ArrayList;


public class Tires
	{
		String tireName;
		int Price;
		int Ranking;
		
public Tires (String TN, int P, int R)
	{
		tireName = TN;
		Price = P;
		Ranking = R;
	}
		
		
		public static void Tires()			
			{
				ArrayList <Tires> TireName = new ArrayList <Tires>();
				TireName.add(new Tires ("Very warn tires",2000,1));
				TireName.add(new Tires ("Street tires",10000,2));
				TireName.add(new Tires ("Race tires",15000,3));
				TireName.add(new Tires ("Drag tires",25000,4));

			}


		public String getTireName()
			{
				return tireName;
			}


		public void setTireName(String tireName)
			{
				this.tireName = tireName;
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
