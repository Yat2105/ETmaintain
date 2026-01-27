package com.etmaintain.models;

/**
 * Enumeration representing the priority levels of a work order.
 * Higher priority work orders should be addressed before lower priority ones.
 */
public enum WorkOrderPriority {
    /**
     * Low priority stands for a maintenance that can be scheduled when convenient.
     */
    LOW,
    
    /**
     *And Medium priority for important but not urgent maintenance tasks.
     */
    MEDIUM,
    
    /**
     * Finallly High priority or urgent maintenance requiring immediate attention.
     */
    HIGH
}
