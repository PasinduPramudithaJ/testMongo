package com.testmongo.testmongo.Model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;
import java.time.LocalTime;

@Document(collection = "students")
public class Student {
    @Id
    private String studentId;
    private String name;
    private String address;
    private String userRole = "User";
    private LocalDate dateViewed = LocalDate.now();
    private LocalTime timeViewed = LocalTime.now();

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }

    public LocalDate getDateViewed() {
        return dateViewed;
    }

    public void setDateViewed(LocalDate dateViewed) {
        this.dateViewed = dateViewed;
    }

    public LocalTime getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(LocalTime timeViewed) {
        this.timeViewed = timeViewed;
    }
}
