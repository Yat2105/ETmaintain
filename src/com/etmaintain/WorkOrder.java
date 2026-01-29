package com.etmaintain.models;

public class WorkOrder {

    private int id;
    private String issue;
    private String facility;
    private WorkOrderStatus status;
    private WorkOrderPriority priority;
    private int technicianId;

    // Constructor for new work orders
    public WorkOrder(int id, String issue, String facility, WorkOrderPriority priority) {
        this.id = id;
        this.issue = issue;
        this.facility = facility;
        this.priority = priority;
        this.status = WorkOrderStatus.PENDING;
        this.technicianId = -1; // not assigned
    }

    // Full constructor
    public WorkOrder(int id, String issue, String facility,
                     WorkOrderStatus status,
                     WorkOrderPriority priority,
                     int technicianId) {
        this.id = id;
        this.issue = issue;
        this.facility = facility;
        this.status = status;
        this.priority = priority;
        this.technicianId = technicianId;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getIssue() {
        return issue;
    }

    public String getFacility() {
        return facility;
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

    // Setters
    public void setIssue(String issue) {
        this.issue = issue;
    }

    public void setFacility(String facility) {
        this.facility = facility;
    }

    public void setStatus(WorkOrderStatus status) {
        this.status = status;
    }

    public void setPriority(WorkOrderPriority priority) {
        this.priority = priority;
    }

    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
        this.status = WorkOrderStatus.ASSIGNED;
    }

    public void unassignTechnician() {
        this.technicianId = -1;
        this.status = WorkOrderStatus.PENDING;
    }

    public boolean isCompleted() {
        return status == WorkOrderStatus.COMPLETED;
    }

    @Override
    public String toString() {
        return "WorkOrder ID: " + id +
                ", Issue: " + issue +
                ", Facility: " + facility +
                ", Priority: " + priority +
                ", Status: " + status +
                ", Technician ID: " + technicianId;
    }
}
