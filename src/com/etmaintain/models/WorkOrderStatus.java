package com.etmaintain.models;

/**
 *I used Enumeration because it represents the possible statuses of a work order.
*/
public enum WorkOrderStatus {
    /**
     * Work order has been created but not yet assigned to a technician.
     */
    PENDING,
    
    /**
     * Work order has been assigned to a technician but work has not started.
     */
    ASSIGNED,
    
    /**
     * Technician is actively working on the maintenance task.
     */
    IN_PROGRESS,
    
    /**
     * Maintenance work has been completed successfully.
     */
    COMPLETED
}
