package org.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PrintAllAnimals {

    public PrintAllAnimals(){
        String select = ("select * from animal;");
        try(Statement statement = AnimalConnection.getConnection().createStatement()){

            ResultSet resultSet = statement.executeQuery(select);

            while (resultSet.next()){
                Animal animal = new Animal();
                animal.setAnimalId(resultSet.getInt(1));
                animal.setAnimalName(resultSet.getString(2));
                animal.setAnimalDescription(resultSet.getString(3));

                System.out.println(animal.toString());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            AnimalConnection.closeConnection();
        }
    }
}
