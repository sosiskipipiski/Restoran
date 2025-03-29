package servise;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class Menu {
    private static final List<String> availableDish = Arrays.asList("Pizza","Pasta","Salat","Burger");
    
}
