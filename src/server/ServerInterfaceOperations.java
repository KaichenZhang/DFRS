package server;


/**
* server/ServerInterfaceOperations.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��C:/Users/nathan/workspace/COMP6231project/src/server.idl
* 2016��11��16�� ������ ����09ʱ02��35�� EST
*/

public interface ServerInterfaceOperations 
{
  String bookFlight (String currentCity, String firstName, String lastName, String address, String phoneNumber, String destination, String flightClass, String flightDate);
  String getBookedFlightCount (String currentCity, String managerID);
  String editFlightRecord (String currentCity, String managerID, String destination, String flightDate, int economy, int business, int firstclass);
  String transferReservation (String managerID, String PassengerID, String CurrentCity, String OtherCity);
} // interface ServerInterfaceOperations
