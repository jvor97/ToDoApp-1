package com.acccenture.letovit.todolist.database;

import org.springframework.data.repository.CrudRepository;

public interface DbToDoItemRepository extends CrudRepository<DbToDoItem,String> {

}
