package login;
import java.awt.List;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;


public class Login {

    
    public static void main(String[] args) {
        try{
            ArrayList<String> Data = (ArrayList<String>) Files.readAllLines(Paths.get("C:/Users/User/Desktop/TestLogin.txt"));
            int lenLine = Data.size();
            String str = "";
            for ( int i = 0; i < lenLine; i++ ){
                str = Data.get(i);
                int lenWord = str.length();
                int tmp = 0;
                for ( int j = 0; j < lenWord; j++ ){
                    if ( str.charAt(j) == ' ' ){
                        tmp = j;
                        break;
                    }
                }
                String user = "";
                for ( int j = 0; j < tmp; j++ ){
                    user += str.charAt(j);
                }
                System.out.print("username : " + user);
                String pass = "";
                for ( int j = tmp + 1; j < lenWord; j++ ){
                    pass += str.charAt(j);
                }
                System.out.println(" password : " + pass);
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
