package dfrs.servers1;

import dfrs.utils.Config;

public class WDCServer extends FlightServer{
	static final int UDP_PORT = 2002;

	public WDCServer(){
		super();
		super.city = "WDC";
		super.createLogFile();
		try {
			this.exportServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	public void createFlightRecord(FlightRecord f){
//		f.addFlight("WDC", "NDL", "2016/11/01", 10, 30, 100);
//		f.addFlight("WDC", "MTL", "2016/11/01", 10, 30, 100);
//		f.addFlight("WDC", "NDL", "2016/11/02", 20, 40, 200);
//		f.addFlight("WDC", "MTL", "2016/11/02", 20, 40, 200);
//		f.addFlight("WDC", "NDL", "2016/11/03", 30, 50, 300);
//		f.addFlight("WDC", "MTL", "2016/11/03", 30, 50, 300);
		f.addFlight("WDC", "MTL", Config.DEPARTURE_DATE, 100, 100, 100);
		f.addFlight("WDC", "NDL", Config.DEPARTURE_DATE, 100, 100, 100);
	}
	
	public static FlightServer main(String args[]){
		final WDCServer server = new WDCServer();
		try{
//			Properties props = new Properties();
//		    props.put("org.omg.CORBA.ORBInitialPort", "1050");    
//		    props.put("org.omg.CORBA.ORBInitialHost", "127.0.0.1"); 
//		    ORB orb = ORB.init(args, props);	    
//			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
//			rootpoa.the_POAManager().activate();	
//			server.setORB(orb);
//			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(server);
//			ServerInterface href = ServerInterfaceHelper.narrow(ref);
//			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
//			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
//			NameComponent path[] = ncRef.to_name("WDC");
//			ncRef.rebind(path, href);
			
			
			System.out.println("Washington Server is Running");
			server.writeLog("-----------------------Initial Flights------------------------- ");
			server.writeLog(server.flight_record.toString());
			server.writeLog("-----------------------------Server----------------------------");
			new Thread(new Runnable() {
				@Override
				public void run() {
					server.UDPServer(UDP_PORT);
				}
			}).start();
		}catch(Exception e){
			e.printStackTrace();
		}
		return server;
	}
}
