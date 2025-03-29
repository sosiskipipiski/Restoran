package controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import servise.Menu;

@RestController
@RequiredArgsConstructor
public class OrderController {
    private final Menu menuService;
}
