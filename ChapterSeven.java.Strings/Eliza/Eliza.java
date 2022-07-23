import java.util.Scanner;
public class Eliza
{   public static void main(String[]  args)
     {  Scanner input = new Scanner(System.in);
           
           String myPhrase, onePhrase = "My ", copyPhrase = "", phrase1 = "", phrase2 = "";
           String twoPhrase = " my ", copyPhrase2 = "";
           String threePhrase = "dislike", copyPhrase3 = "", phrase13 = "";
           String fourPhrase = "love", fivePhrase = "hate";
           String breakLoop = "Goodbye";           
           boolean appears = false;           
 
          //Use the do...while loop to reprompt the user
           //till the user types Goodbye

       do{    System.out.print("Enter your statement >> ");
                  myPhrase = input.nextLine();

        //Loop the phrase to find onePhrase which is "My "

           for(int i = 0; i < myPhrase.length(); ++i)
             {    
                 if(myPhrase.regionMatches(i, onePhrase, 0, onePhrase.length()))
                       { copyPhrase = myPhrase.substring(i + onePhrase.length(), myPhrase.length());
                         int index = copyPhrase.indexOf(' ');
                           phrase1 = copyPhrase.substring(0, index);
                             System.out.println("Tell me more about your " + phrase1);
                          appears = true;
                         }

                   else
                    if(myPhrase.regionMatches(i, twoPhrase, 0, twoPhrase.length()))
                          {  copyPhrase2 = myPhrase.substring(i + twoPhrase.length(), myPhrase.length());
                             int index = copyPhrase2.indexOf(' ');
                               if(index >= 0)
                                  { phrase2 = copyPhrase2.substring(0, index);
                                     System.out.println("Tell me more about your " + phrase2);
                                    }
                               else
                                 if(index < 0)
                                  { System.out.println("Tell me more about your " + copyPhrase2);
                                   }
                             appears = true;
                            }
                  

           //Search if the phrase "dislike" appears in your sentence
          //If it does then the else...if statement runs

                else
                   if(myPhrase.regionMatches(i, threePhrase, 0, threePhrase.length()))
                     {     copyPhrase3 = myPhrase.substring(i + threePhrase.length() + 1, myPhrase.length()); 
                           int index = copyPhrase3.indexOf(' ');
                        
                       //The noun might be followed by other words
                       //We only need the noun so we have to extract it
                      //We extract it by finding a space in the new phrase
                      //Find index of the space and use it as argument in the extraction of noun
                      //Assign it to an empy string
   
                             if(index >= 0)
                                { phrase13 = copyPhrase3.substring(0, index);
                                    System.out.println("Why do you say you dislike " + phrase13);
                                 }
                              else
                                if(index < 0)
                                  System.out.println("Why do you say you dislike " + copyPhrase3);
                        appears = true;
                     }

               
                 if(myPhrase.regionMatches(i, fourPhrase, 0, fourPhrase.length()) ||
                    myPhrase.regionMatches(i, fivePhrase, 0, fivePhrase.length()))
                       { System.out.println("You seem to have strong feelings about that.");
                            appears = true;
                        }
            }
         
    //if user types goodbye break loop

            if(myPhrase.equalsIgnoreCase(breakLoop))
               { break;
                 }
           
         }while(true);
     }
}







































