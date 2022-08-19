/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.service;

import com.htv.nttv.pojo.Team;
import java.util.List;
import java.util.Map;

/**
 *
 * @author USER
 */
public interface TeamService {
    List<Team> getTeam(Map<String, String> params);
    boolean addTeam(Team t);
}
