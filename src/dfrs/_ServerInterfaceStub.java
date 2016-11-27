package dfrs;


/**
* dfrs/_ServerInterfaceStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from D:/GIT/DFRS/src/dfrs.idl
* 2016年11月27日 星期日 下午04时27分03秒 EST
*/

public class _ServerInterfaceStub extends org.omg.CORBA.portable.ObjectImpl implements dfrs.ServerInterface
{

  public String bookFlight (String departure, String firstName, String lastName, String address, String phoneNumber, String destination, String flightClass, String flightDate)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("bookFlight", true);
                $out.write_string (departure);
                $out.write_string (firstName);
                $out.write_string (lastName);
                $out.write_string (address);
                $out.write_string (phoneNumber);
                $out.write_string (destination);
                $out.write_string (flightClass);
                $out.write_string (flightDate);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return bookFlight (departure, firstName, lastName, address, phoneNumber, destination, flightClass, flightDate        );
            } finally {
                _releaseReply ($in);
            }
  } // bookFlight

  public String getBookedFlightCount (String managerID, String recordType)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getBookedFlightCount", true);
                $out.write_string (managerID);
                $out.write_string (recordType);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getBookedFlightCount (managerID, recordType        );
            } finally {
                _releaseReply ($in);
            }
  } // getBookedFlightCount

  public String editFlightRecord (String managerID, String recordID, String fieldName, String newValue)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("editFlightRecord", true);
                $out.write_string (managerID);
                $out.write_string (recordID);
                $out.write_string (fieldName);
                $out.write_string (newValue);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return editFlightRecord (managerID, recordID, fieldName, newValue        );
            } finally {
                _releaseReply ($in);
            }
  } // editFlightRecord

  public String transferReservation (String managerID, String passengerID, String currentCity, String otherCity)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("transferReservation", true);
                $out.write_string (managerID);
                $out.write_string (passengerID);
                $out.write_string (currentCity);
                $out.write_string (otherCity);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return transferReservation (managerID, passengerID, currentCity, otherCity        );
            } finally {
                _releaseReply ($in);
            }
  } // transferReservation

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:dfrs/ServerInterface:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _ServerInterfaceStub
