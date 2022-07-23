public class ThreeCharacters
{  public static void main(String[]  args)
       {  
          MyCharacter characterOne = new MyCharacter();
          MyCharacter characterTwo = new MyCharacter();
          MyCharacter characterThree = new MyCharacter();
          characterOne = getDataOne(characterOne);
          characterTwo = getDataTwo(characterTwo);
          characterThree = getDataThree(characterThree);
          display(characterOne, characterTwo, characterThree);
              }
public static MyCharacter getDataOne(MyCharacter character)
     { 
        String colorOne = "Green";
        int numberEyesOne = 3;
        int numberLimbsOne = 8;
        int numberLivesOne = 9;
        character.setColor(colorOne); character.setNumberEyes(numberEyesOne);  character.setNumberLimbs(numberLimbsOne); character.setNumberLives(numberLivesOne);
        return character;
          } 

public static MyCharacter getDataTwo(MyCharacter character)
     { 
        String colorTwo = "Yellow";
        int numberEyesTwo = 1;
        int numberLimbsTwo = 10;
        int numberLivesTwo = 2;
        character.setColor(colorTwo); character.setNumberEyes(numberEyesTwo);  character.setNumberLimbs(numberLimbsTwo); character.setNumberLives(numberLivesTwo);
        return character;
          }

public static MyCharacter getDataThree(MyCharacter character)
     { 
        String colorThree = "Orange";
        int numberEyesThree = 4;
        int numberLimbsThree = 6;
        int numberLivesThree = 5;
        character.setColor(colorThree); character.setNumberEyes(numberEyesThree);  character.setNumberLimbs(numberLimbsThree); character.setNumberLives(numberLivesThree);
       return character;
      }

public static void display(MyCharacter characterOne, MyCharacter characterTwo, MyCharacter characterThree ) 
       {
         System.out.println("My first alien character is " + characterOne.getColor() + " in color, has " + characterOne.getNumberEyes() + " eyes, " + 
                              characterOne.getNumberLimbs() + " limbs and " + characterOne.getNumberLives() + " lives.");
              
          System.out.println("My second alien character is " + characterTwo.getColor() + " in color, has " + characterTwo.getNumberEyes() + " eyes, " + 
                              characterTwo.getNumberLimbs() + " limbs and " + characterTwo.getNumberLives() + " lives.");
      
          System.out.println("My third alien character is " + characterThree.getColor() + " in color, has " + characterThree.getNumberEyes() + " eyes, " + 
                              characterThree.getNumberLimbs() + " limbs and " + characterThree.getNumberLives() + " lives.");
             }
}