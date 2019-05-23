import java.io.*;
import java.util.*;

class DlMain{

    public static void main(String[] args) {
        System.out.println("Enter the value to add");
        Scanner myObj = new Scanner(System.in);
        int value = myObj.nextInt();
        DNode nodeobj1=new DNode(7);
        nodeobj1.dLadd(value);
        nodeobj1.showNodes();
    }
}