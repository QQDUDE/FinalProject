import java.util.ArrayList;



public class Transmission
	{
		String transmissionName;
		int Price;
		
		public Transmission (String TN, int P)
			{
				transmissionName = TN;
				Price = P;

			}
		public static void Transmission()
			{
				ArrayList <Transmission> TransmissionName = new ArrayList <Transmission>();
				TransmissionName.add(new Transmission("5-Speed Manual",3000));
				TransmissionName.add(new Transmission("CD4E—4-speed transaxle",18000));
				TransmissionName.add(new Transmission("5-Speed Manual",18500));
				TransmissionName.add(new Transmission("3.0 TURBO Engine RE4R03A Transmission",11000));
				TransmissionName.add(new Transmission("Electrohydraulic manual transmission",15000));
				TransmissionName.add(new Transmission("6-speed R Tronic",15500));
				TransmissionName.add(new Transmission("6-Speed Manual",10000));
				TransmissionName.add(new Transmission("7-speed dual clutch-w/ paddle shifters",20000));
				TransmissionName.add(new Transmission("7-speed DSG sequential",50000));
				TransmissionName.add(new Transmission("6-speed automatic dual clutch transmission",65200));
				TransmissionName.add(new Transmission("6-speed automatic",55000));
				TransmissionName.add(new Transmission("7-speed dual clutch",15000));
				TransmissionName.add(new Transmission("Ricardo 6-speed Manual",80000));
			}
		public String getTransmissionName()
			{
				return transmissionName;
			}
		public void setTransmissionName(String transmissionName)
			{
				this.transmissionName = transmissionName;
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
