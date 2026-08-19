package HotelBookingmanagement;

import java.util.Scanner;

public class Guest {
private int id;
private String name;
private String email;
private String city;
private int age;
public Guest(int id,String name,String email,String city,int age){
    this.id=id;
    this.name=name;
    this.email=email;
    this.city=city;
    this.age=age;
}
public int getId(){
    return id;
}
public String getName(){
    return name;
}
public String getEmail(){
    return email;
}
public String getCity(){
    return city;
}
public int getAge(){
    return age;
}
public void setId(int id){
    this.id=id;
}
public void setName(String name){
    this.name=name;
}
public void setEmail(String email){
    this.email=email;
}
public void setCity(String city){
    this.city=city;
}
public void setAge(int age){
    this.age= age;
}

@Override
public boolean equals(Object obj){
    if(this==obj){
        return true;
    }
    if(obj==null){
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Guest other = (Guest) obj;
    return this.id == other.id;
}

@Override
public int hashCode() {
    return Integer.hashCode(id);
}
@Override
public String toString() {
    return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", city='" + city + '\'' +
                ", age=" + age +
                '}';
    }
}
