package repository;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class OrderRequest {

    private String name;
    List<String> dishName =new ArrayList<>();




}
