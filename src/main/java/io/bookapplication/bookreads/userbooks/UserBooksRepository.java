package io.bookapplication.bookreads.userbooks;

import org.apache.catalina.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserBooksRepository extends CassandraRepository <UserBooks, UserBooksPrimaryKey> {

}
