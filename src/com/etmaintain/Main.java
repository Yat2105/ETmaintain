package com.etmaintain;

import com.etmaintain.models.WorkOrder;
import com.etmaintain.models.WorkOrderStatus;
import com.etmaintain.models.WorkOrderPriority;

/**
 * This class serves as the entry point and demonstrates the WorkOrder model functionality.
 */
public class Main {

    public static void main(String[] args) {
        // Create a sample work order with realistic maintenance data
        WorkOrder sampleWorkOrder = new WorkOrder(
            1234,                                    // Work Order ID
            "Replace broken fluorescent light in the Dean's Office", // Description
            WorkOrderStatus.ASSIGNED,                // Status
            WorkOrderPriority.MEDIUM,                // Priority
            45,                                      // Technician ID
            "2026-01-27 14:30:00"                    // Request Date
        );

        // Display the work order details to verify the model works
        System.out.println("=== Facility Maintenance System - Phase 1 Demo ===");
        System.out.println();
        System.out.println("Sample Work Order Details:");
        System.out.println(sampleWorkOrder.toString());
        System.out.println();
        
        // Display individual fields for better readability
        System.out.println("Individual Field Access:");
        System.out.println("ID: " + sampleWorkOrder.getId());
        System.out.println("Description: " + sampleWorkOrder.getDescription());
        System.out.println("Status: " + sampleWorkOrder.getStatus());
        System.out.println("Priority: " + sampleWorkOrder.getPriority());
        System.out.println("Technician ID: " + sampleWorkOrder.getTechnicianId());
        System.out.println("Request Date: " + sampleWorkOrder.getRequestDate());
        System.out.println();
        
        // Demonstrate updating the work order status
        System.out.println("Updating work order status to IN_PROGRESS...");
        sampleWorkOrder.setStatus(WorkOrderStatus.IN_PROGRESS);
        System.out.println("Updated Status: " + sampleWorkOrder.getStatus());
        System.out.println();
        
        System.out.println("WorkOrder model successfully Working");
    }
}
