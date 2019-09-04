public class ksp_lab1_server {
  
  public static void main(String[] args) {
    SeverSocket server = new ServerSocket(1111);
    while(true) {
      Socket client = server.accept();
      DataInputStream in = new DataInputStream(client.getInputStream());
      DataOutputStream out = new DataOutputStream(client.getOutputStream());
      String message = in.readUTF();
      out.writeUTF(message);
      in.close();
      out.close();
      client.close();
    }
  }
}
