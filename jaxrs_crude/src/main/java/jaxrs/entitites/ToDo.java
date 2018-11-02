package jaxrs.entitites;

import java.sql.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name="todo")
public class ToDo {
private String title ;
private String description;
private Date due ;
private boolean completed ;
private Date createdAt;
private Date updatedAt;

public String getTitle() {
	return title;
}
@XmlAttribute
public void setTitle(String title) {
	this.title = title;
}
public String getDescription() {
	return description;
}
@XmlElement(name="description")
public void setDescription(String description) {
	this.description = description;
}
public Date getDue() {
	return due;
}
@XmlElement(name="due")
public void setDue(Date due) {
	this.due = due;
}
public boolean isCompleted() {
	return completed;
}
@XmlElement(name="isCompleted")
public void setCompleted(boolean completed) {
	this.completed = completed;
}
public Date getCreatedAt() {
	return createdAt;
}
@XmlElement(name="created")
public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}
public Date getUpdatedAt() {
	return updatedAt;
}
@XmlElement(name="updated")
public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + (completed ? 1231 : 1237);
	result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
	result = prime * result + ((description == null) ? 0 : description.hashCode());
	result = prime * result + ((due == null) ? 0 : due.hashCode());
	result = prime * result + ((title == null) ? 0 : title.hashCode());
	result = prime * result + ((updatedAt == null) ? 0 : updatedAt.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	ToDo other = (ToDo) obj;
	if (completed != other.completed)
		return false;
	if (createdAt == null) {
		if (other.createdAt != null)
			return false;
	} else if (!createdAt.equals(other.createdAt))
		return false;
	if (description == null) {
		if (other.description != null)
			return false;
	} else if (!description.equals(other.description))
		return false;
	if (due == null) {
		if (other.due != null)
			return false;
	} else if (!due.equals(other.due))
		return false;
	if (title == null) {
		if (other.title != null)
			return false;
	} else if (!title.equals(other.title))
		return false;
	if (updatedAt == null) {
		if (other.updatedAt != null)
			return false;
	} else if (!updatedAt.equals(other.updatedAt))
		return false;
	return true;
}
public ToDo(String title, String description, boolean completed) {
	super();
	this.title = title;
	this.description = description;
	this.completed = completed;
}
public ToDo() {
	super();
}

}
