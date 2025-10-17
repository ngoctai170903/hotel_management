/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;


public class Service {
    private int serviceId;        
    private String name;          
    private String unit;          
    private double unitPrice;     
    private String chargeType;    
    private boolean active;      

    public Service() {}

    public Service(int serviceId, String name, String unit, double unitPrice, String chargeType, boolean active) {
        this.serviceId = serviceId;
        this.name = name;
        this.unit = unit;
        this.unitPrice = unitPrice;
        this.chargeType = chargeType;
        this.active = active;
    }

    
    public int getServiceId() { return serviceId; }
    public void setServiceId(int serviceId) { this.serviceId = serviceId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUnit() { return unit; }
    public void setUnit(String unit) { this.unit = unit; }

    public double getUnitPrice() { return unitPrice; }
    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public String getChargeType() { return chargeType; }
    public void setChargeType(String chargeType) { this.chargeType = chargeType; }

    public boolean isActive() { return active; }
    public void setActive(boolean active) { this.active = active; }

    @Override public String toString() {
        return "Service{" +
                "id=" + serviceId +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", unitPrice=" + unitPrice +
                ", chargeType='" + chargeType + '\'' +
                ", active=" + active +
                '}';
    }
}
