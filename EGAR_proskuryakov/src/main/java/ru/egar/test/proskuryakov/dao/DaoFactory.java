package ru.egar.test.proskuryakov.dao;

import ru.egar.test.proskuryakov.entities.Order;

/**
 * Created by 1 on 06.03.2016.
 */
public interface DaoFactory {

    Dao<Order, Integer> getOrderDao();
}