package Util;

import bean.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserUtil {
    public static void regUser() {
        List<User> l = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name:");
        String name = sc.nextLine();
        System.out.println("Surname:");
        String surName = sc.nextLine();
        User u = new User(name, surName);
    }

    public static void sendFileLocation() throws Exception{
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the link with the file you want to send.");
        String location=sc.nextLine();
        System.out.println("Enter the  port of the person you want to send the file to");
        int port=sc.nextInt();
        tcp.Server.server(location,port);
    }
}
