package ex_20072024;

import java.util.Scanner;

public class Lab082 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String browser_name =scn.next();
          browser_name=browser_name.toLowerCase();
        switch(browser_name){
            case "chrome":// Chrome, CHROME not accepted so use lowercase()
            System.out.println("browser name is:"+browser_name);
            break;
            case "firefox":
            System.out.println("browser name is:"+browser_name);
            break;
            case "Explorer":
            System.out.println("browser name is:"+browser_name);
            break;
            default:
                System.out.println(" don't know the browser name");

        }
    }
}
