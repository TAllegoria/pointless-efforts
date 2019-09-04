public class ksp_lab1_client {
  
  public static void main(String[] args) {
    Socket client = new Socket("localhost", 1111);
    DataInputStream in = new DataInputStream(client.getInputStream());
    DataOutputStream out = new DataOutputStream(client.getOutputStream());
    out.writeUTF("hope it works");
    String response = in.readUTF();
    in.close();
    out.close();
    client.close();
  }
}
