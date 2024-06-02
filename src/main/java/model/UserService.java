package com.example.oop_lr9;

import com.example.oop_lr9.User;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.getType;
public class UserService {
    private static final String FILE_PATH = "src\\main\\webapp\\Users.json";

    public static void saveUser(User User) {
        List<User> users = getAllUsers();
        users.add(User);
        writeToJsonFile(users);
    }

    public static List<User> getAllUsers() {
        String json = readFromJsonFile();
        Type listType = new TypeToken<ArrayList<User>>(){}.getType();
        return new Gson().fromJson(json, listType);
    }

    private static String readFromJsonFile() {
        StringBuilder jsonString = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                jsonString.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return jsonString.toString();
    }

    private static void writeToJsonFile(List<User> users) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            String json = new Gson().toJson(users);
            writer.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
