package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import repozitory.Order;

@RestController
public class OrderController {
        //Тут нам должен приходить заказ в виде String имя и List позиции блюд (Json)

    @PostMapping("/orders")
    public Order plaseOrders(@RequestBody Order order){
        // Нужно написать логику если позции доступны из Fridge отправить ответ заказ принят, если нет то отправить что не можем приготовить заказ.



        // Если можно его приготовить отправить его через кафку в сервис Kitchen и там сделать вид бурной деятельности и отправить

        return order;//удалить потом наверное
    }

}
