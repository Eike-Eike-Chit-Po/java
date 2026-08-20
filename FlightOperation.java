package flight_ticket_system;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class FlightOperation {

Flight [] Flight =new Flight[5];

public FlightOperation()
{
Flight[0]=new Flight("F001","MMA101","Yangon","Bangkok","2026-09-01","2026-09-01",180,250000);
Flight[1]=new Flight("F002","MMA101","Yangon","Bangkok","2026-09-01","2026-09-01",180,250000);
Flight[2]=new Flight("F003","MMA101","Yangon","Bangkok","2026-09-01","2026-09-01",180,250000);
Flight[3]=new Flight("F004","MMA101","Yangon","Bangkok","2026-09-01","2026-09-01",180,250000);
Flight[4]=new Flight("F005","MMA101","Yangon","Bangkok","2026-09-01","2026-09-01",180,250000);



}
public void fillData(JTable table)
{
	DefaultTableModel model=(DefaultTableModel)table.getModel();
	
	for(int i=0; i<= Flight.length-1;i++)
	{
		String []data =new String[] {Flight[i].getFlightID(),Flight[i].getFlightNumber(),Flight[i].getDeparture(),
				 Flight[i].getDestination(),Flight[i].getDepartureDate(),Flight[i].getArrivalDate(),
				 String.valueOf(Flight[i].getSeatCapacity()),String.valueOf(Flight[i].getPrice())};
		model.addRow(data);
		
	}
}
}
