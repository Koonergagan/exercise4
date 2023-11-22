package ca.sheridancollege.database;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import ca.sheridancollege.beans.School;
import lombok.Data;
@Data
@Repository

public class SchoolDatabase
{
    private ArrayList<School> schoolList = new ArrayList<>();
    
}
