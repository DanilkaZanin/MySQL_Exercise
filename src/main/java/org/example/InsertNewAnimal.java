package org.example;

import java.sql.PreparedStatement;
import java.sql.SQLException;

///Класс реализует интерфейс добавления новых животных в дб animal
public class InsertNewAnimal {
    private static final String INSERT = "insert into animal(idanimal, anim_name, anim_desc) value(?,?,?);";

    public InsertNewAnimal(int animalId, String animalName, String animalDescription){

        try(PreparedStatement preparedStatement = AnimalConnection.getConnection().prepareStatement(INSERT)){
            preparedStatement.setInt(1,animalId);
            preparedStatement.setString(2,animalName);
            preparedStatement.setString(3,animalDescription);

            preparedStatement.execute();
        }catch (SQLException e ){
            e.printStackTrace();
        }finally {
            AnimalConnection.closeConnection();
        }
    }


}
