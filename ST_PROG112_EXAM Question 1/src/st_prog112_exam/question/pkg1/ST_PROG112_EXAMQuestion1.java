/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package st_prog112_exam.question.pkg1;
import java.util.Scanner;

public class ST_PROG112_EXAMQuestion1 {


    public static void main(String[] args) {
        String[] Cities = {"Cape Town","Johannesburgh","Port Elizabeth"};
        
        int[][] RoadAccidents = {
            {0,0,0},
            {0,0,0}
        };
       // DisplayData();
        DisplayData(RoadAccidents,Cities);
    }
    
    public static void DisplayData(int[][] RoadAccidents, String[] Cities) {
        int[] TotalAccidents = {0,0,0};
        int TotalAccidentsforCapeTown = 0;
        int TotalAccidentsforJohannesburgh = 0;
        int TotalAccidentsforPortElizabeth = 0;
        int Cityindex2 = 0;
        
        //Retrieving user data input
        Scanner myObj = new Scanner(System.in); 
        
        //Inputs for Capetown
        System.out.print("Enter the number of car accidents for Cape Town: ");
        int CarAccidents_Capetown = myObj.nextInt(); 

        System.out.print("Enter the number of motor bike accidents for Cape Town: ");
        int MoterBikeAccidents_Capetown = myObj.nextInt();
        
        //Inputs for Johannesburg
        System.out.print("Enter the number of car accidents for Johannesburg: ");
        int CarAccidents_Johannesburg = myObj.nextInt(); 

        System.out.print("Enter the number of motor bike accidents forJohannesburg: ");
        int MotorBikeAccidents_Johannesburg = myObj.nextInt();
        
        //Inputs for Port Elizabeth
        System.out.print("Enter the number of car accidents for Port Elizabeth: ");
        int CarAccidents_PortElizabeth = myObj.nextInt(); 

        System.out.print("Enter the number of motor bike accidents for Port Elizabeth: ");
        int MotorBikeAccidents_PortElizabeth = myObj.nextInt();
        
        
       //Assigning user input to multiDimensionalArray values
       
        //Car accidents
        RoadAccidents[0][0] = CarAccidents_Capetown;
        RoadAccidents[0][1] = CarAccidents_Johannesburg;
        RoadAccidents[0][2] = CarAccidents_PortElizabeth;
        
        //Motorbike accidents  
        RoadAccidents[1][0] = MoterBikeAccidents_Capetown;
        RoadAccidents[1][1] = MotorBikeAccidents_Johannesburg;
        RoadAccidents[1][2] = MotorBikeAccidents_PortElizabeth;
        
        //Appendcing total accidents for each city
        TotalAccidents[0] = RoadAccidents[0][0]+ RoadAccidents[1][0]; 
        TotalAccidents[1] = RoadAccidents[0][1]+ RoadAccidents[1][1];
        TotalAccidents[2] = RoadAccidents[0][2]+ RoadAccidents[1][2];
        
        
        // Function to obtain largest value of city with most accients
        int CityIndex1 = TotalAccidents[0];
        for(int i = 0; i < TotalAccidents.length; i++)  {
            if(TotalAccidents[i] > CityIndex1) {
                CityIndex1 = TotalAccidents[i];
            }
        }
        
        
        for (int index = 0; index < TotalAccidents.length; index++) {
            if (TotalAccidents[index] == CityIndex1) {
                Cityindex2 = index;
            }
        }
        ///////////////////////////////////////////////////////////////
        
        
        //Printing final results
                System.out.println("----------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("----------------------------------------------------");
        
        System.out.println("\t \t \t"+"CAR"+"\t \t"+"MOTOR BIKE");
        System.out.println("Cape Town"+"\t \t"+RoadAccidents[0][0]+"\t \t"+RoadAccidents[1][0]);
        System.out.println("Johannesburg"+"\t \t"+RoadAccidents[0][1]+"\t \t"+RoadAccidents[1][1]);
        System.out.println("Port Elizabeth"+"\t \t"+RoadAccidents[0][2]+"\t \t"+RoadAccidents[1][2]);
        
        System.out.println("----------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTAL FOR EACH CITY");
        System.out.println("----------------------------------------------------");
        
        System.out.println("Cape Town"+"\t"+TotalAccidents[0]);
        System.out.println("Johannesburgh"+"\t"+TotalAccidents[1]);
        System.out.println("Port Elizabeth"+"\t"+TotalAccidents[2]);
        
        System.out.println("CITY WITH THE MOST VEHICLE ACIDENTS: "+Cities[Cityindex2]);
        
        System.out.println("----------------------------------------------------");
    }
    

    
}
