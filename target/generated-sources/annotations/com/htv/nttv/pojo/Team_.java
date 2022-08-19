package com.htv.nttv.pojo;

import com.htv.nttv.pojo.UserGroup;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-08-19T14:29:47")
@StaticMetamodel(Team.class)
public class Team_ { 

    public static volatile SingularAttribute<Team, Integer> number;
    public static volatile CollectionAttribute<Team, UserGroup> userGroupCollection;
    public static volatile SingularAttribute<Team, String> name;
    public static volatile SingularAttribute<Team, String> description;
    public static volatile SingularAttribute<Team, Integer> id;

}