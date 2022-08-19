package com.htv.nttv.pojo;

import com.htv.nttv.pojo.Transaction;
import com.htv.nttv.pojo.UserGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-19T14:29:47")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile CollectionAttribute<User, Transaction> transactionCollection;
    public static volatile SingularAttribute<User, String> lastName;
    public static volatile SingularAttribute<User, String> firstName;
    public static volatile SingularAttribute<User, String> password;
    public static volatile SingularAttribute<User, String> gender;
    public static volatile SingularAttribute<User, Integer> phone;
    public static volatile CollectionAttribute<User, UserGroup> userGroupCollection;
    public static volatile SingularAttribute<User, Boolean> active;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, Boolean> userRole;
    public static volatile SingularAttribute<User, String> email;
    public static volatile SingularAttribute<User, String> username;

}