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
        return workOrders.stream()
                .filter(wo -> wo.getId() == id)
                .findFirst();
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
        return workOrders.removeIf(wo -> wo.getId() == id);
    }


    public List<WorkOrder> getAllWorkOrders() {
        return new ArrayList<>(workOrders);
    }


    public List<WorkOrder> getWorkOrdersByStatus(WorkOrderStatus status) {
        return workOrders.stream()
                .filter(wo -> wo.getStatus() == status)
                .collect(java.util.stream.Collectors.toList());
    }


    public List<WorkOrder> getWorkOrdersByTechnician(int technicianId) {
        return workOrders.stream()
                .filter(wo -> wo.getTechnicianId() == technicianId)
                .collect(java.util.stream.Collectors.toList());
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


