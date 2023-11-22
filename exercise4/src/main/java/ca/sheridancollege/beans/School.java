package ca.sheridancollege.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;



@Data
@AllArgsConstructor
public class School
{
    private String name;
    private String Address;
    private int numofStudents;
   
}
