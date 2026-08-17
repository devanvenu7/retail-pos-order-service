package com.devanvenu.pos.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity @Table(name="orders")
public class Order{
  @Id @GeneratedValue(strategy=GenerationType.UUID)
  private String id;
  private String externalOrderId;
  private String storeId;
  private BigDecimal totalAmount;
  public String getId(){return id;}
  public String getExternalOrderId(){return externalOrderId;}
  public void setExternalOrderId(String v){externalOrderId=v;}
  public String getStoreId(){return storeId;}
  public void setStoreId(String v){storeId=v;}
  public BigDecimal getTotalAmount(){return totalAmount;}
  public void setTotalAmount(BigDecimal v){totalAmount=v;}
}
