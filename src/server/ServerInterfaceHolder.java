package server;

/**
* server/ServerInterfaceHolder.java .
* ��IDL-to-Java ������ (����ֲ), �汾 "3.2"����
* ��C:/Users/nathan/workspace/COMP6231project/src/server.idl
* 2016��11��15�� ���ڶ� ����02ʱ42��26�� EST
*/

public final class ServerInterfaceHolder implements org.omg.CORBA.portable.Streamable
{
  public server.ServerInterface value = null;

  public ServerInterfaceHolder ()
  {
  }

  public ServerInterfaceHolder (server.ServerInterface initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = server.ServerInterfaceHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    server.ServerInterfaceHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return server.ServerInterfaceHelper.type ();
  }

}
