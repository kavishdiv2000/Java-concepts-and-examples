import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Animal> animals = new ArrayList<>();
    static ArrayList<Animal> animalsLoaded = new ArrayList<>(); // animalsLoaded is use to store the Animal objects loaded from the saved saved arraylist in animals.txt


    public static void Serialization(){

        try{
            FileOutputStream file = new FileOutputStream("animals.txt");
            ObjectOutputStream objectOut = new ObjectOutputStream(file);
            objectOut.writeObject(animals);

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void Deserialization(){
        try{
            FileInputStream file = new FileInputStream("animals.txt");
            ObjectInputStream objectIn = new ObjectInputStream(file);
//            animals= (ArrayList<Animal>) objectIn.readObject();
            animalsLoaded.addAll((ArrayList<Animal>) objectIn.readObject());

        }catch(IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }


    public static void main(String[] args) {
        Animal a1 = new Animal("Kitty","cat",2);
        Animal a2 = new Animal("Simba","lion",4);
        Animal a3 = new Animal("Nala","dog",3);

        animals.add(a1);
        animals.add(a2);
        animals.add(a3);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter option 1 to serialization 2 to deserialization: " );
        int op = input.nextInt();

        switch (op){
            case 1: Serialization(); break;
            case 2: Deserialization(); break;
        }

        for(Animal animal: animalsLoaded){
            System.out.println(animal);
        }




    }
}