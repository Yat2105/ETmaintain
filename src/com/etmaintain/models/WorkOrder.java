package com.etmaintain.models;

public class WorkOrder {
    private int id;
    private String description;
    private WorkOrderStatus status;
    private WorkOrderPriority priority;
    private int technicianId;
    private String requestDate;

    public WorkOrder(int id, String description, WorkOrderStatus status, 
                    WorkOrderPriority priority, int technicianId, String requestDate) {
        this.id = id;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.technicianId = technicianId;
        this.requestDate = requestDate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public WorkOrderStatus getStatus() {
        return status;
    }

    public WorkOrderPriority getPriority() {
        return priority;
    }

    public int getTechnicianId() {
        return technicianId;
    }

    public String getRequestDate() {
        return requestDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(WorkOrderStatus status) {
        this.status = status;
    }

    public void setPriority(WorkOrderPriority priority) {
        this.priority = priority;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    public void setRequestDate(String requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * @return Formatted string containing all work order details
     */
    @Override
    public String toString() {
        return "WorkOrder{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", priority=" + priority +
                ", technicianId=" + technicianId +
                ", requestDate='" + requestDate + '\'' +
                '}';
    }
}
