package com.klef.fsad.exam;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="hospital")
public class Hospital
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

@Column(nullable=false)
private String name;

@Column(nullable=false)
private String description;

@Column(nullable=false)
private Date date;

@Column(nullable=false)
private String status;

public int getId() { return id; }
public void setId(int id) { this.id = id; }

public String getName() { return name; }
public void setName(String name) { this.name = name; }

public String getDescription() { return description; }
public void setDescription(String description) { this.description = description; }

public Date getDate() { return date; }
public void setDate(Date date) { this.date = date; }

public String getStatus() { return status; }
public void setStatus(String status) { this.status = status; }
}