package com.adept.ims.institute.service;

import java.util.List;

import com.adept.ims.institute.database.pojo.Trust;

public interface TrustService {

    public List<Trust> getAll();

    public Trust get(long trustId);

    public Trust getByPrimaryKey(long trustId);

    public Trust save(Trust trust);

    public void update(Trust trust);

    public void remove(long trustId);

    public List<Trust> getByName(String name);

    public List<Trust> getByFilter(String filter, String value);

    public List<Trust> getByOperator(Trust trust, String operator);
}