package com.etmaintain.managers;

import com.etmaintain.models.WorkOrder;
import com.etmaintain.models.WorkOrderStatus;
import com.etmaintain.models.WorkOrderPriority;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WorkOrderManager {
    private List<WorkOrder> workOrders;
    private int nextId;

    public WorkOrderManager() {
        this.workOrders = new ArrayList<>();
        this.nextId = 1001; // Starting ID for work orders
    }


    public WorkOrder createWorkOrder(String description, WorkOrderStatus status, 
                                   WorkOrderPriority priority, int technicianId) {
        WorkOrder newWorkOrder = new WorkOrder(
            nextId++,
            description,
            status,
            priority,
            technicianId,
            java.time.LocalDateTime.now().toString()
        );
        
        workOrders.add(newWorkOrder);
        return newWorkOrder;
    }
    public Optional<WorkOrder> getWorkOrderById(int id) {
        // Loop through all work orders to find the one with matching ID
        for (WorkOrder workOrder : workOrders) {
            if (workOrder.getId() == id) {
                return Optional.of(workOrder); // Found the work order
            }
        }
        return Optional.empty(); // No work order found with this ID
    }


    public boolean updateWorkOrderStatus(int id, WorkOrderStatus newStatus) {
        Optional<WorkOrder> workOrder = getWorkOrderById(id);
        if (workOrder.isPresent()) {
            workOrder.get().setStatus(newStatus);
            return true;
        }
        return false;
    }


    public boolean deleteWorkOrder(int id) {
        // Find the work order with matching ID and remove it
        for (int i = 0; i < workOrders.size(); i++) {
            if (workOrders.get(i).getId() == id) {
                workOrders.remove(i); // Remove the work order at this index
                return true; // Successfully deleted
            }
        }
        return false; // No work order found with this ID
    }


    public List<WorkOrder> getAllWorkOrders() {
        return new ArrayList<>(workOrders);
    }


    public List<WorkOrder> getWorkOrdersByStatus(WorkOrderStatus status) {
        // Create a new list to store matching work orders
        List<WorkOrder> matchingOrders = new ArrayList<>();
        
        // Loop through all work orders and add matching ones to the new list
        for (WorkOrder workOrder : workOrders) {
            if (workOrder.getStatus() == status) {
                matchingOrders.add(workOrder);
            }
        }
        
        return matchingOrders;
    }


    public List<WorkOrder> getWorkOrdersByTechnician(int technicianId) {
        // Create a new list to store work orders for this technician
        List<WorkOrder> technicianOrders = new ArrayList<>();
        
        // Loop through all work orders and add matching ones to the new list
        for (WorkOrder workOrder : workOrders) {
            if (workOrder.getTechnicianId() == technicianId) {
                technicianOrders.add(workOrder);
            }
        }
        
        return technicianOrders;
    }


    public int getWorkOrderCount() {
        return workOrders.size();
    }

    public void printAllWorkOrders() {
        System.out.println("=== All Work Orders ===");
        if (workOrders.isEmpty()) {
            System.out.println("No work orders found.");
        } else {
            for (WorkOrder wo : workOrders) {
                System.out.println(wo.toString());
            }
        }
        System.out.println();
    }
}


