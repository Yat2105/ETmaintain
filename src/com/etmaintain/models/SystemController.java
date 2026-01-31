package com.etmaintain.models;

import java.util.Scanner;

public class SystemController {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Facility Maintenance System ===");

        System.out.print("Enter work order description: ");
        String description = sc.nextLine();

        System.out.print("Enter priority (LOW / MEDIUM / HIGH): ");
        String priority = sc.nextLine();

        System.out.println("\nWork Order Created");
        System.out.println("Description: " + description);
        System.out.println("Priority: " + priority);

        sc.close();
    }
}

