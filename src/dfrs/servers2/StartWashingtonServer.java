package dfrs.servers2;

import java.util.Scanner;

public class StartWashingtonServer {

	public static String SERVER_NAME = "Washington";

	public static BaseObj main(String args[]) {
		System.out.println(SERVER_NAME + " Server is ready and waiting ...");
		StartWashingtonServer server = new StartWashingtonServer();
		BaseObj obj = server.initializeServer(args);
		return obj;
	}

	private BaseObj initializeServer(String args[]) {
		WashingtonServerObj obj = new WashingtonServerObj();
		try {
			// create and initialize the ORB //// get reference to rootpoa &amp;
			// activate the POAManager
//			ORB orb = ORB.init(args, null);
//			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
//			rootpoa.the_POAManager().activate();
//
//			// create servant and register it with the ORB
//			obj.setORB(orb);
//
//			// get object reference from the servant
//			org.omg.CORBA.Object ref = rootpoa.servant_to_reference(obj);
//			Server href = ServerHelper.narrow(ref);
//
//			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
//			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
//
//			NameComponent path[] = ncRef.to_name(SERVER_NAME);
//			ncRef.rebind(path, href);


			// wait for invocations from clients
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					while (true) {
//						orb.run();
						int userInput = 0;
						Scanner input = new Scanner(System.in);
						
				 
				            Boolean valid = false;
				            while(!valid)
				            {
				                try {
				                	userInput = input.nextInt();
				                    valid = true;
				                }
				                catch(Exception e) {
				                    System.out.println("Invalid Input, please enter an Integer");
				                    valid = false;
				                    input.nextLine();
				                }
				            }
				            switch(userInput) {
				            case 3: obj.printFlightRecord(); break;
				            case 4: obj.printPassengerRecord(); break;
				            }
					}
				}
			}).start();
		}

		catch (Exception e) {
			System.err.println("ERROR: " + e);
			e.printStackTrace(System.out);
		}

//		System.out.println(SERVER_NAME + " Server Exiting ...");
		return obj;
	}
}
