/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.htv.nttv.service.impl;

import com.htv.nttv.pojo.Team;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.htv.nttv.respository.TeamRespository;
import com.htv.nttv.service.TeamService;
import java.util.Map;

/**
 *
 * @author USER
 */
@Service
public class TeamServiceImpl implements TeamService{
    @Autowired
    private TeamRespository teamRespository;
    @Override
    public List<Team> getTeam(Map<String, String> params) {
        return this.teamRespository.getTeam(params);
    }

    @Override
    public boolean addTeam(Team t) {
        return this.teamRespository.addTeam(t);
    }
}
