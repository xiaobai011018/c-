package com.bsc.jdbc.dao_.dao;

import com.bsc.jdbc.dao_.domain.Actor;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestDao {
    @Test
    public void test(){
        ActorDao actorDao = new ActorDao();
        String sql = "select * from actor where id >= ?";
        List<Actor> list = actorDao.queryMulti(sql, Actor.class, 1);
        for (Actor actor:list) {
            System.out.print(actor);
        }
    }
}
