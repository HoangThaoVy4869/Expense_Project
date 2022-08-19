package com.htv.nttv.pojo;

import com.htv.nttv.pojo.Team;
import com.htv.nttv.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-19T14:29:47")
@StaticMetamodel(UserGroup.class)
public class UserGroup_ { 

    public static volatile SingularAttribute<UserGroup, Date> dateTime;
    public static volatile SingularAttribute<UserGroup, Long> income;
    public static volatile SingularAttribute<UserGroup, Team> groupId;
    public static volatile SingularAttribute<UserGroup, String> description;
    public static volatile SingularAttribute<UserGroup, Integer> id;
    public static volatile SingularAttribute<UserGroup, Long> expense;
    public static volatile SingularAttribute<UserGroup, User> userId;

}