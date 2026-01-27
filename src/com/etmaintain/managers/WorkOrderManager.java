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

