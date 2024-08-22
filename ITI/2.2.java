import java.util.*;

class IP {
    public String IP_address;
    public IP() {IP_address = "";}
    public IP(String address) {IP_address = address;}
    public String[] getParts() {
        return IP_address.split("\\.");
    }
    public void printContent() {
        String[] parts = this.getParts();
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
public class Main {
    public static void main(String[] args){
        String address="163.121.12.30";
        IP IP_address = new IP (address);
        IP_address.printContent();
    }//end of main
}//end of class